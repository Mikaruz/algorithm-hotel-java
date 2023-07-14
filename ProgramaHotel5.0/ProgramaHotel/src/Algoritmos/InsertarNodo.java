package Algoritmos;

public class InsertarNodo {
    public Nodo InsertarNodo(Nodo inicio, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String email, String tipoDeHabitacion){
        Nodo nuevo = new Nodo(nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion);
        
        nuevo.sig = inicio;
        inicio = nuevo;
        
        return inicio;
    }
}
