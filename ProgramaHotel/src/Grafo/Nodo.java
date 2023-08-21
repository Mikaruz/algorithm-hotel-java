package Grafo;

public class Nodo {
    private Object dato;
    private Nodo pNext;

    public Nodo(Object dato) {
        this.dato = dato;
        pNext = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getPnext() {
        return pNext;
    }

    public void setPnext(Nodo pnext) {
        this.pNext = pnext;
    }
}
