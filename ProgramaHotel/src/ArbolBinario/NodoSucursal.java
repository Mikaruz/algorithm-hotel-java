package ArbolBinario;

public class NodoSucursal {
    private Sucursal elemento;
    private NodoSucursal izq, der;

    public NodoSucursal(Sucursal elemento) {
        this.elemento = elemento;
        izq = der = null;
    }

    public Sucursal getElemento() {
        return elemento;
    }

    public void setElemento(Sucursal elemento) {
        this.elemento = elemento;
    }

    public NodoSucursal getIzq() {
        return izq;
    }

    public void setIzq(NodoSucursal izq) {
        this.izq = izq;
    }

    public NodoSucursal getDer() {
        return der;
    }

    public void setDer(NodoSucursal der) {
        this.der = der;
    }
}
