package Algoritmos;

import Algoritmos.Nodo;
import programahotel.Pantalla;
public class EliminarNodo {
    
    public void Eliminar(Nodo pFound, Nodo ini, Nodo fin){
        
        Nodo anterior, temporal;
        if(ini == fin && pFound == ini){
            System.out.println(":VVV1");
            ini = fin = null;
            
        }
        else if(pFound == ini){
            System.out.println(":VVV2");
            ini = ini.sig;
        }
        else{
            System.out.println(":VVV3");
                
            anterior = ini;
            temporal = ini.sig;
                
            while(temporal != null && temporal != pFound){
                System.out.println(":VVV4");
                anterior = anterior.sig;
                temporal = temporal.sig;
            }
                
            if(temporal != null){
                System.out.println(":VVV5");
                anterior.sig = temporal.sig;
                    
                if(temporal == fin){
                    System.out.println(":VVV6");
                    fin = anterior;
                }
            }
        }
      
//        LimpiarTabla();
//        InsertarDatosTabla();   
    }
}
