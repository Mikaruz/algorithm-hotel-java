package ListaEnlazada;

public class EliminarNodo {
    
    public void EliminarNodo(NodoLista pFound, NodoLista ini, NodoLista fin){
        NodoLista anterior, temporal;

        anterior = ini;
        temporal = ini.sig;

        while(temporal != null && temporal != pFound){ //recorrido lineal
            anterior = anterior.sig;
            temporal = temporal.sig;
        }

        if(temporal != null){ //Elimina
            anterior.sig = temporal.sig;

            if(temporal == fin){ //Por si el nodo a elimar es el último
                fin = anterior;
            }
        }
    }
}
