package Algoritmos;

public class OrdenarNodo {
    
    public boolean flag = false;
    
    public void Ordenar(String tipoDato, Nodo ini){
        String aux;
        
        Nodo antp = ini;
        Nodo p = ini.sig;
        
        switch(tipoDato){
            case "Nombre":
                if(ini.sig != null){
                    while(p != null){
                        if(antp.nombre.compareTo(p.nombre) > 0){                             
                            aux = p.nombre;
                            p.nombre = antp.nombre;
                            antp.nombre = aux;
                 
                            aux = p.apellidoPaterno;
                            p.apellidoPaterno = antp.apellidoPaterno;
                            antp.apellidoPaterno = aux;

                            aux = p.apellidoMaterno;
                            p.apellidoMaterno = antp.apellidoMaterno;
                            antp.apellidoMaterno = aux;

                            aux = p.dni;
                            p.dni = antp.dni;
                            antp.dni = aux;

                            aux = p.telefono;
                            p.telefono = antp.telefono;
                            antp.telefono = aux;

                            aux = p.email;
                            p.email = antp.email;
                            antp.email = aux;

                            aux = p.tipoDeHabitacion;
                            p.tipoDeHabitacion = antp.tipoDeHabitacion;
                            antp.tipoDeHabitacion = aux;

                            if(p == ini.sig){
                                antp = p;
                                p = p.sig;           
                            }
                            else{
                                antp = ini;
                                p = ini.sig;
                            }
                        }
                        else{
                            antp = p;
                            p = p.sig;
                        }
                    }    
                }
            break;
            case "Apellido paterno":
                if(ini.sig != null){
                    while(p != null){
                        if(antp.apellidoPaterno.compareTo(p.apellidoPaterno) > 0){                             
                            aux = p.nombre;
                            p.nombre = antp.nombre;
                            antp.nombre = aux;
                            
                            aux = p.apellidoPaterno;
                            p.apellidoPaterno = antp.apellidoPaterno;
                            antp.apellidoPaterno = aux;

                            aux = p.apellidoMaterno;
                            p.apellidoMaterno = antp.apellidoMaterno;
                            antp.apellidoMaterno = aux;

                            aux = p.dni;
                            p.dni = antp.dni;
                            antp.dni = aux;

                            aux = p.telefono;
                            p.telefono = antp.telefono;
                            antp.telefono = aux;

                            aux = p.email;
                            p.email = antp.email;
                            antp.email = aux;

                            aux = p.tipoDeHabitacion;
                            p.tipoDeHabitacion = antp.tipoDeHabitacion;
                            antp.tipoDeHabitacion = aux;

                            if(p == ini.sig){
                                antp = p;
                                p = p.sig;           
                            }
                            else{
                                antp = ini;
                                p = ini.sig;
                            }
                        }
                        else{
                            antp = p;
                            p = p.sig;
                        }
                    }    
                }
            break;
            case "Apellido materno":
                if(ini.sig != null){
                    while(p != null){
                        if(antp.apellidoMaterno.compareTo(p.apellidoMaterno) > 0){                             
                            aux = p.nombre;
                            p.nombre = antp.nombre;
                            antp.nombre = aux;
                       
                            aux = p.apellidoPaterno;
                            p.apellidoPaterno = antp.apellidoPaterno;
                            antp.apellidoPaterno = aux;

                            aux = p.apellidoMaterno;
                            p.apellidoMaterno = antp.apellidoMaterno;
                            antp.apellidoMaterno = aux;

                            aux = p.dni;
                            p.dni = antp.dni;
                            antp.dni = aux;

                            aux = p.telefono;
                            p.telefono = antp.telefono;
                            antp.telefono = aux;

                            aux = p.email;
                            p.email = antp.email;
                            antp.email = aux;

                            aux = p.tipoDeHabitacion;
                            p.tipoDeHabitacion = antp.tipoDeHabitacion;
                            antp.tipoDeHabitacion = aux;

                            if(p == ini.sig){
                                antp = p;
                                p = p.sig;           
                            }
                            else{
                                antp = ini;
                                p = ini.sig;
                            }
                        }
                        else{
                            antp = p;
                            p = p.sig;
                        }
                    }    
                }
            break;
        }   
    } 
}
