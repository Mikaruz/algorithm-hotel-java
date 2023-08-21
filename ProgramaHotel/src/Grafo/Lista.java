package Grafo;

public class Lista {
    private Nodo pInicio;
    private Nodo pFinal;
    private int Size;

    public Nodo getpInicio() {
        return pInicio;
    }

    public void setpInicio(Nodo pInicio) {
        this.pInicio = pInicio;
    }

    public Nodo getpFinal() {
        return pFinal;
    }

    public void setpFinal(Nodo pFinal) {
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

    public Nodo Proximo(Nodo posicion) {
        if (!EsVacio()) {
            if (posicion != null) {
                posicion = posicion.getPnext();
                return posicion;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public Nodo Anterior(Nodo posicion) {
        if (!EsVacio()) {
            Nodo aux = getpInicio();
            Nodo ant = getpInicio();
            boolean encontrado = false;
            
            if (aux == posicion) {
                return null;
            } else {
                while (aux != null && encontrado == false) {
                    aux = Proximo(aux);
                    if (aux == posicion) {
                        encontrado = true;
                        return ant;
                    } else {
                        ant = Proximo(ant);
                    }
                }
            }
            return null;
        } else {
            return null;
        }
    }

    public void Encolar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (EsVacio()) {
            setpInicio(nuevo);

        } else {
            Nodo aux = getpFinal();
            aux.setPnext(nuevo);
        }
        setpFinal(nuevo);
        setSize(getSize() + 1);
    }

    public Object LeerCabeza() {
        return getpInicio().getDato();
    }

    public void Desencolar() {
        if (!EsVacio()) {
            setpInicio(getpInicio().getPnext());
            if (getpInicio() == null) {
                setpFinal(null);
            }
            setSize(getSize() - 1);
        }
    }

    public void Apilar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (EsVacio()) {

            setpInicio(nuevo);
            setpFinal(nuevo);
        } else {
            Nodo aux = getpInicio();
            nuevo.setPnext(aux);
            setpInicio(nuevo);
        }
        setSize(getSize() + 1);
    }

    public void Desapilar() {
        Desencolar();
    }

    public Object LeerTope() {
        return getpInicio().getDato();
    }
}