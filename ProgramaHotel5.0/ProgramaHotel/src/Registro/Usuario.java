package Registro;

import utils.Rutinas;
import utils.UtilsCriterioOrdenamiento;

public class Usuario {

    private String nombre,calle;
    private int edad;
  
    private int criterioOrdenamiento;

    public Usuario(String nombre, int edad, String calle, int criterioOrdenamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.calle = calle;
        this.criterioOrdenamiento = criterioOrdenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getcalle() {
        return calle;
    }
    

    // Cambiar el criterio de ordenamiento desde el Main
    public void setCriterioOrdenamiento(int criterioOrdenamiento) {
        this.criterioOrdenamiento = criterioOrdenamiento;
    }

    @Override
    public String toString() {
        switch (criterioOrdenamiento) {
            case UtilsCriterioOrdenamiento.POR_NOMBRE:
                return Rutinas.PonBlancos(nombre, 50);
            case UtilsCriterioOrdenamiento.POR_ID:
                return Rutinas.PonCeros(edad, 5);
            case UtilsCriterioOrdenamiento.POR_CALLE:
                return Rutinas.PonBlancos(calle, 50);
        
            default:
                return "";
        }
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\t| Edad: " + edad + "\t| Estatura: " + calle;
    }

}
