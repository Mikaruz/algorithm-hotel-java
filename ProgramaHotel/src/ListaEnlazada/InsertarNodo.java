package ListaEnlazada;

public class InsertarNodo {
    public NodoLista InsertarNodo(NodoLista inicio, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String email, String tipoDeHabitacion){
        NodoLista nuevo = new NodoLista(nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion);
        
        nuevo.sig = inicio;
        inicio = nuevo;
        
        return inicio;
    }
}
