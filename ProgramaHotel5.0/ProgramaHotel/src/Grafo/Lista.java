/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Luis Stanislao
 */
public class Lista {//Clase lista y sus primitivas para tratarla como un pila y como una cola

    private Nodo3 pInicio;
    private Nodo3 pFinal;
    private int Size;

    public Nodo3 getpInicio() {
        return pInicio;
    }

    public void setpInicio(Nodo3 pInicio) {
        this.pInicio = pInicio;
    }

    public Nodo3 getpFinal() {
        return pFinal;
    }

    public void setpFinal(Nodo3 pFinal) {
        this.pFinal = pFinal;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public boolean EsVacio() {
        return pInicio == null;
    }





}
