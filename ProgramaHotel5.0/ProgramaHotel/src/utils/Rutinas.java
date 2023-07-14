package utils;


import java.util.*;

public class Rutinas {

   
    static public String PonBlancos(String Texto, int Tamaño) {
        while (Texto.length() < Tamaño) {
            Texto += " ";
        }
        return Texto;
    }

    static public String PonCeros(int Numero, int Tamaño) {
        String Texto = Numero + "";
        while (Texto.length() < Tamaño) {
            Texto = "0" + Texto;
        }
        return Texto;
    }
    
    static public String PonCeros(double numero, int tamaño) {
    String texto = numero + "00000";
        while (texto.length() < tamaño) {
            texto = "0" + texto;
        }
        return texto;
    }
}
