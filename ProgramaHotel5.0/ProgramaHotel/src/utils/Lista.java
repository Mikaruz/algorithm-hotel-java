package utils;

public class Lista<T> {

    private Nodo2<T> Frente;
    private Nodo2<T> Fin;
    public T Dr;

    public Lista() {
        Frente = Fin = null;
        Dr = null;
    }

    public boolean InsertaOrdenado(T Dato) {
        if (Dato == null) {
            return false;
        }
        Nodo2<T> Nuevo;
        try {
            Nuevo = new Nodo2<T>(Dato);
        } catch (Exception e) {
            return false;
        }
        // primer nodo de la lista
        if (Frente == null) {
            Frente = Fin = Nuevo;
            return true;
        }
        String IdNuevo = Dato.toString();

        Nodo2<T> Aux = Frente;
        Nodo2<T> Ant = null;
        while (Aux != null && Aux.Info.toString().compareTo(IdNuevo) <= 0) {
            Ant = Aux;
            Aux = Aux.getSig();
        }
        // Inicio de la lista
        if (Ant == null) {
            Nuevo.setSig(Frente);
            Frente = Nuevo;
            return true;
        }
        // FInal de la lista
        if (Aux == null) {
            Fin.setSig(Nuevo);
            Fin = Nuevo;
            return true;
        }
        // entre dos nodos
        Ant.setSig(Nuevo);
        Nuevo.setSig(Aux);

        return true;
    }

    public boolean InsertaFrente(T Dato) {
        if (Dato == null) {
            return false;
        }
        Nodo2<T> Nuevo = new Nodo2<T>(Dato);

        if (Frente == null) {
            Frente = Fin = Nuevo;
        } else {
            Nuevo.setSig(Frente);
            Frente = Nuevo;
        }
        return true;
    }

    public boolean InsertaFin(T Dato) {
        if (Dato == null) {
            return false;
        }
        Nodo2<T> Nuevo;
        try {
            Nuevo = new Nodo2<T>(Dato);
        } catch (Exception e) {
            return false;
        }

        if (Frente == null) {
            Frente = Fin = Nuevo;
        } else {
            Fin.setSig(Nuevo);
            Fin = Nuevo;
        }
        return true;
    }

    public int Length() {
        Nodo2<T> Aux = Frente;
        int Cont = 0;
        while (Aux != null) {
            Cont++;
            Aux = Aux.getSig();
        }
        return Cont;
    }

    public boolean Retira(int Posicion) {
        if (Posicion > Length()) {
            return false;
        }
        Nodo2<T> Aux = Frente;
        Nodo2<T> Ant = null;
        for (int i = 1; i < Posicion; i++) {
            Ant = Aux;
            Aux = Aux.getSig();
        }
        EliminaNodo(Aux, Ant);
        return true;

    }

    public boolean Retira(T Dato) {
        String IdNodo = Dato.toString();

        Nodo2<T> Aux = Frente;
        Nodo2<T> Ant = null;
        String IdNodoActual;
        boolean Band = false;
        while (Aux != null) {
            IdNodoActual = Aux.Info.toString();
            if (IdNodo.compareToIgnoreCase(IdNodoActual) == 0) {
                Band = true;
                break;
            }
            Ant = Aux;
            Aux = Aux.getSig();
        }
        if (!Band) {
            return false;
        }
        EliminaNodo(Aux, Ant);

        return true;
    }

    private void EliminaNodo(Nodo2<T> Aux, Nodo2<T> Ant) {
        Dr = Aux.Info;
        //�nico nodo de la lista
        if (Frente == Fin) {
            Frente = Fin = null;
            return;
        }
        // Primero de la lista
        if (Aux == Frente) {
            Frente = Frente.getSig();
            return;
        }
        // �ltimo de la lista
        if (Aux == Fin) {
            Ant.setSig(null);
            Fin = Ant;
            return;
        }
        // entre dos nodos
        Ant.setSig(Aux.getSig());
    }

    public Nodo2<T> getFrente() {
        return Frente;
    }

    public Nodo2<T> getFin() {
        return Fin;
    }
}