package ArbolBinario;

import javax.swing.table.DefaultTableModel;

public class ArbolSucursal {
    private NodoSucursal raiz;

    public ArbolSucursal() {
        raiz = null;
    }

    public NodoSucursal getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoSucursal raiz) {
        this.raiz = raiz;
    }
    
    public NodoSucursal Agregar(NodoSucursal nodo, Sucursal elemento) {
        if(nodo == null) {
            NodoSucursal Nuevo = new NodoSucursal(elemento);
            return Nuevo;
        }
        else {
            if(elemento.getID().compareTo(nodo.getElemento().getID())>0) {
                nodo.setDer(Agregar(nodo.getDer(), elemento));
            }
            else {
                nodo.setIzq(Agregar(nodo.getIzq(), elemento));
            }
        }
        return nodo;
    }

    public NodoSucursal BuscarID(String dato) {
        NodoSucursal aux = raiz;
        while(aux != null) {
            if(aux.getElemento().getID().startsWith(dato)){
                return aux;
            }
            else {
                if(dato.compareTo(aux.getElemento().getID()) > 0) {
                    aux = aux.getDer();
                }
                else {
                    aux = aux.getIzq();
                }
            }
        }
        return null;
    }

    public void ListarInOrden(NodoSucursal Nodo, DefaultTableModel modTabla) { //Procesa el subárbol izquierdo, luego el nodo raíz, luego el derecho
        if(Nodo != null) {
            ListarInOrden(Nodo.getIzq(), modTabla);
            modTabla.addRow(Nodo.getElemento().getRegistro());
            ListarInOrden(Nodo.getDer(), modTabla);
        }
    }

    public NodoSucursal BuscarMayorIzquierda(NodoSucursal aux) {
        if(aux != null) {
            while(aux.getDer() != null) {
                aux = aux.getDer();
            }
        }
        return aux;
    }

    public NodoSucursal EliminarMayorIzquierda(NodoSucursal aux) {
        if(aux == null) {
            return null;
        }
        else if(aux.getDer() != null) {
            aux.setDer(EliminarMayorIzquierda(aux.getDer()));
            return aux;
        }
        return aux.getIzq();
    }

    public NodoSucursal Eliminar(NodoSucursal Auxiliar, String Dato) {
        if(Auxiliar == null) {
            return null;
        }
        if(Dato.compareTo(Auxiliar.getElemento().getID())<0) {
            Auxiliar.setIzq(Eliminar(Auxiliar.getIzq(), Dato));
        }
        else if(Dato.compareTo(Auxiliar.getElemento().getID())>0) {
            Auxiliar.setDer(Eliminar(Auxiliar.getDer(), Dato));
        }
        else if(Auxiliar.getIzq() != null && Auxiliar.getDer() != null) {
            Auxiliar.setElemento(BuscarMayorIzquierda(Auxiliar.getIzq()).getElemento());
            Auxiliar.setIzq(EliminarMayorIzquierda(Auxiliar.getIzq()));
        }
        else {
            Auxiliar = (Auxiliar.getIzq() != null) ? Auxiliar.getIzq() : Auxiliar.getDer();
        }
        
        return Auxiliar;
    }
}
