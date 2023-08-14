package Algoritmos;

public class Nodo {
    public String nombre; 
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String dni;
    public String telefono;
    public String email;
    public String tipoDeHabitacion;
        
    public Nodo sig; 

    public Nodo(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String email, String tipoDeHabitacion){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.tipoDeHabitacion = tipoDeHabitacion;
    }
}
