package utils;

public class Nodo2<T> {

    public T Info;
    private Nodo2<T> Sig;

    public Nodo2(T D) {
        Info = D;
        Sig = null;
    }

    public Nodo2<T> getSig() {
        return Sig;
    }

    public void setSig(Nodo2<T> Ap) {
        Sig = Ap;
    }
}
