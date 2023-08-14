
package Algoritmos;


public class BuscarNodo {
    
    public Nodo BuscarNodo(Nodo inicio, String dato, String tipoDato){
        Nodo pos = inicio;
        
        switch(tipoDato){
            case "Nombre":
                while(pos != null && !dato.equalsIgnoreCase(pos.nombre)){
                    pos = pos.sig;
                }
            break;
            case "Apellido paterno":
                while(pos != null && !dato.equalsIgnoreCase(pos.apellidoPaterno)){
                    pos = pos.sig;
                }
            break;
            case "Apellido materno":
                while(pos != null && !dato.equalsIgnoreCase(pos.apellidoMaterno)){
                    pos = pos.sig;
                }
            break;
            case "DNI":
                while(pos != null && !dato.equalsIgnoreCase(pos.dni)){
                    pos = pos.sig;
                }
            break;
        }
        
        return pos;
    }
}
