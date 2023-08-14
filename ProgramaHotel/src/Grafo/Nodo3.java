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
public class Nodo3 {

    private Object dato;
    private Nodo3 pNext;

    public Nodo3(Object dato) {
        this.dato = dato;
        pNext = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo3 getPnext() {
        return pNext;
    }

    public void setPnext(Nodo3 pnext) {
        this.pNext = pnext;
    }
}
