/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Luis Stanislao
 */
public class Vertice {//Vertice se refiere a cada cliente y su informacion

    private String Nombre;
    private int NumVertice;
    private String Calle;
    private String Urb;

    public Vertice(String Nombre, String Calle, String Urb) {
        this.Nombre = Nombre;
        NumVertice = -1;
        this.Calle = Calle;
        this.Urb = Urb;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumVertice() {
        return NumVertice;
    }

    public void setNumVertice(int NumVertice) {
        this.NumVertice = NumVertice;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getUrb() {
        return Urb;
    }

    public void setUrb(String Urb) {
        this.Urb = Urb;
    }
}
