package Grafo;

import javax.swing.JOptionPane;

public class Grafo {
    private int nVertices;
    private static int MaxVertices;
    protected Vertice[] Vertices;
    protected int[][] MatrizAd;
    final static int VALOR_MAX = 999999999;
    
    public int getnVertices() {
        return nVertices;
    }

    public void setnVertices(int nVertices) {
        this.nVertices = nVertices;
    }

    public static int getMaxVertices() {
        return MaxVertices;
    }

    public static void setMaxVertices(int MaxVertices) {
        Grafo.MaxVertices = MaxVertices;
    }

    public Vertice[] getVertices() {
        return Vertices;
    }

    public void setVertices(Vertice[] Vertices) {
        this.Vertices = Vertices;
    }

    public Grafo(int max) {
        MaxVertices = max;
        MatrizAd = new int[MaxVertices][MaxVertices];
        Vertices = new Vertice[MaxVertices];
        nVertices = 0;
        
        for (int i = 0; i < MaxVertices; i++) {
            for (int j = 0; j < MaxVertices; j++) {
                if (i == j) {
                    MatrizAd[i][j] = 0;
                } else {
                    MatrizAd[i][j] = VALOR_MAX;
                }
            }
        }
    }

    public int IndiceVertice(String nombre, String calle, String urb) {
        Vertice nuevo = new Vertice(nombre, calle, urb);
        boolean encontrado = false;
        int i = 0;
        while ((i < nVertices) && (encontrado == false)) {

            encontrado = Vertices[i].getNombre().equals(nuevo.getNombre());
            if (!encontrado) {
                i++;
            }
        }
        if (i < nVertices) {
            return i;
        } else {
            return -1;
        }

    }

    public int IndiceVerticeInt(int id) {
        if (id < nVertices) {
            return id;
        } else {
            return -1;
        }

    }

    public void NuevoV(String nombre, String calle, String urb) {
        boolean existe = IndiceVertice(nombre, calle, urb) >= 0;
        if (!existe) {
            Vertice newVertice = new Vertice(nombre, calle, urb);
            newVertice.setNumVertice(getnVertices());
            Vertices[nVertices] = newVertice;
            nVertices++;
        }
    }

    public boolean NuevoA(int v1, int v2, int recorrido) {
        int n1, n2;
        n1 = IndiceVerticeInt(v1);
        n2 = IndiceVerticeInt(v2);
        if (n1 < 0 || n2 < 0) {
            JOptionPane.showMessageDialog(null, "Alguno de los vertices no existe");
            return false;
        } else {
            MatrizAd[n1][n2] = recorrido;
            MatrizAd[n2][n1] = recorrido;
            return true;
        }
    }

    public String BFS(int orig) {
        int recorrido[] = new int[nVertices];
        int aux;
        String cadena, cadena1, cadenafinal;
        cadena = "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1);
        cadena1 = "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1) + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb();

        if (!"".equals(Vertices[orig].getCalle())) {
            cadena1 += ", " + Vertices[orig].getCalle() + "\n";
        } else {
            cadena1 += "\n";
        }

        if (orig >= 0) {
            Lista cola = new Lista();
            for (int i = 0; i < nVertices; i++) {
                recorrido[i] = 0;
            }
            recorrido[orig] = 1;
            cola.Encolar(orig);
            while (!cola.EsVacio()) {
                aux = (int) cola.LeerCabeza();
                cola.Desencolar();

                for (int i = 0; i < nVertices; i++) {
                    if (MatrizAd[aux][i] != 0 && recorrido[i] == 0 && MatrizAd[aux][i] != VALOR_MAX) {
                        cadena += "->" + "ID" + Integer.toString(Vertices[i].getNumVertice() + 1);
                        cadena1 += "ID: " + Integer.toString(Vertices[i].getNumVertice() + 1)
                                + " " + Vertices[i].getNombre() + ", " + Vertices[i].getUrb();
                        if (!"".equals(Vertices[i].getCalle())) {
                            cadena1 += ", " + Vertices[i].getCalle() + "\n";
                        } else {
                            cadena1 += "\n";
                        }
                        recorrido[i] = 1;
                        cola.Encolar(i);
                    }
                }
            }
        }
        cadenafinal = "Recorrido BSF: \n" + cadena + "\n\n" + cadena1;

        return cadenafinal;
    }

    public String DFS(String cadena, int aux, int recorrido[]) {
        if (aux == 0) {
            cadena += aux;
        } else {
            cadena += "," + aux;
        }

        recorrido[aux] = 1;

        for (int i = 0; i < nVertices; i++) {
            if ((aux != i) && (MatrizAd[aux][i] != VALOR_MAX) && (recorrido[i] == 0)) {
                cadena = DFS(cadena, i, recorrido);
            }
        }
        return cadena;
    }

    public String IniciarDFS(int orig) {
        int origen = IndiceVerticeInt(orig);
        int recorrido[] = new int[getnVertices()];
        String cadena = "";

        if (origen >= 0) {
            for (int i = 0; i < nVertices; i++) {
                recorrido[i] = 0;
            }

            for (int i = 0; i < nVertices; i++) {
                if (recorrido[i] == 0) {
                    cadena = DFS(cadena, i, recorrido);
                }
            }
        }
        return cadena;
    }

    public String OutputDFS(int orig) {
        String cadena = "";
        String out1 = "";
        String out2 = "";
        String array[];
        cadena = IniciarDFS(0);
        array = cadena.split(",");

        out1 += "ID" + Integer.toString(Vertices[orig].getNumVertice() + 1);
        out2 += "ID: " + Integer.toString(Vertices[orig].getNumVertice() + 1)
                + " " + Vertices[orig].getNombre() + ", " + Vertices[orig].getUrb();
        if (!"".equals(Vertices[orig].getCalle())) {
            out2 += ", " + Vertices[orig].getCalle() + "\n";
        } else {
            out2 += "\n";
        }

        for (int i = 1; i < array.length; i++) {
            int indice = Integer.parseInt(array[i]);
            out1 += "->" + "ID" + Integer.toString(Vertices[indice].getNumVertice() + 1);
            out2 += "ID: " + Integer.toString(Vertices[indice].getNumVertice() + 1)
                    + " " + Vertices[indice].getNombre() + ", " + Vertices[indice].getUrb();
            if (!"".equals(Vertices[indice].getCalle())) {
                out2 += ", " + Vertices[indice].getCalle() + "\n";
            } else {
                out2 += "\n";
            }
        }

        cadena = "Recorrido DSF: \n" + out1 + "\n\n" + out2;

        return cadena;
    }
}
