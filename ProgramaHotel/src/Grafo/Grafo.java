/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Stanislao
 */
public class Grafo {

    private int nVertices;//numero de vertices que hay
    private static int MaxVertices;//maximo vertices que puede haber
    protected Vertice[] Vertices;//arreglo que tiene a los vertices 
    protected int[][] MatrizAd;//matriz de ady
    final static int VALOR_MAX = 999999999; // indicara que no existe una arista entre los vertices

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

    /*
    Este metodo se va al arreglo de vertices y compara para ver si ya existe uno
    con ese nombre y retorna su indice, de no existir retorna -1
     */
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

    // Verifica que el argumento sea un vertice valido
    public int IndiceVerticeInt(int id) {
        if (id < nVertices) {
            return id;
        } else {
            return -1;
        }

    }

    // Funcion para agregar un nuevo vertice al grafo
    public void NuevoV(String nombre, String calle, String urb) {
        boolean existe = IndiceVertice(nombre, calle, urb) >= 0;
        if (!existe) {
            Vertice newVertice = new Vertice(nombre, calle, urb);
            newVertice.setNumVertice(getnVertices());
            Vertices[nVertices] = newVertice;
            nVertices++;
        }
    }

    // Funcion para agregar una nueva arista al grafo
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

  

  




}
