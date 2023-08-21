package Grafo;

import static Grafo.Grafo.VALOR_MAX;

public class Dijkstra {
    int Matriz[][];
    int Ultimo[];
    int Cost[];
    boolean Visitados[];
    int Orig, Num, Destino;

    public Dijkstra(Grafo graf, int Orig, int Destino) {
        Num = graf.getnVertices();
        Matriz = graf.MatrizAd;
        Ultimo = new int[Num];
        Cost = new int[Num];
        Visitados = new boolean[Num];
        this.Orig = Orig;
        this.Destino = Destino;
    }

    public void CaminoDijkstra() {
        for (int i = 0; i < Num; i++) {
            Visitados[i] = false;
            Cost[i] = Matriz[Orig][i];
            Ultimo[i] = Orig;
        }
        
        Visitados[Orig] = true;
        
        for (int k = 1; k < Num; k++) {
            int min = MenorDistancia();
            Visitados[min] = true;
            for (int j = 1; j < Num; j++) {
                if (!Visitados[j]) {
                    if (Cost[min] + Matriz[min][j] < Cost[j]) {
                        Cost[j] = Cost[min] + Matriz[min][j];
                        Ultimo[j] = min;
                    }
                }
            }
        }
    }

    public String RecuperarCamino(int v, String cadena) {
        int anterior = Ultimo[v];
        if (v != Orig) {
            cadena = cadena + "," + v;
            cadena = RecuperarCamino(anterior, cadena);
        } else {
            cadena = cadena + ",0";
        }
        return cadena;
    }

    public String CaminoFormato() {
        CaminoDijkstra();
        String cadena = RecuperarCamino(Destino, "");
        String s[] = cadena.split(",");

        int j = s.length - 1;
        String inverse = "1";
        j--;
        for (int i = 1; i < s.length - 1; i++) {
            inverse = inverse + " -> " + Integer.toString(Integer.parseInt(s[j]) + 1);
            j--;
        }
        return inverse + "  ~  Distancia total entre los puntos: " + Cost[Destino] + " Km";
    }

    private int MenorDistancia() {
        int minimo = VALOR_MAX;
        int aux = 1;
        for (int i = 0; i < Num; i++) {
            if (!Visitados[i] && (Cost[i] < minimo)) {
                minimo = Cost[i];
                aux = i;
            }
        }
        return aux;
    }
}
