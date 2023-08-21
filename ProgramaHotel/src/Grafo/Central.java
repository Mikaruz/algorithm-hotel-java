package Grafo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Central {
    public static Grafo graph = new Grafo(100);
    public static String Actual = "Enunciado.txt";
    public static boolean Iniciado = false;
    
    public static String getActual() {
        return Actual;
    }
    
    public static void setActual(String Actual) {
        Central.Actual = Actual;
    }
    
    public static Grafo getGraph() {
        return graph;
    }
    
    public static void setGraph(Grafo graph) {
        Central.graph = graph;
    }
    
    public static boolean getIniciado() {
        return Iniciado;
    }
    
    public static void setInciado(boolean Inciado) {
        Central.Iniciado = Inciado;
    }

    public static void CargarGrafo1() {
        Grafo mygraph = new Grafo(1000);
        File miArchivo;
        String nombre, calle, urb, line, cadena[];
        int v1, v2, distancia;
        miArchivo = new File("ArchivoPorDefecto.txt");
        boolean lineaClientes = false;
        boolean lineaCaminos = false;
        
        try {
            FileReader fileReader = new FileReader(miArchivo);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.equals("")) {
                        if (line.toLowerCase().equals("clientes")) {
                            lineaClientes = true;
                            line = bufferedReader.readLine();
                        }
                        if (line.toLowerCase().equals("caminos")) {
                            lineaClientes = false;
                            line = bufferedReader.readLine();
                            lineaCaminos = true;
                        }
                        if (lineaClientes) {
                            line = line.replace(", ", ",");
                            cadena = line.split(",");
                            nombre = cadena[1];
                            urb = cadena[2];
                            if (cadena.length > 3) {
                                calle = cadena[3];
                            } else {
                                calle = "";
                            }
                            mygraph.NuevoV(nombre, calle, urb);
                        } else if (lineaCaminos) {
                            line = line.replace(", ", ",");
                            cadena = line.split(",");
                            String vertice1 = cadena[0];
                            String vertice2 = cadena[0];
                            if (!vertice1.equals("") && !vertice2.equals("")) {
                                v1 = Integer.parseInt(cadena[0]) - 1;
                                v2 = Integer.parseInt(cadena[1]) - 1;
                                distancia = Integer.parseInt(cadena[2]);
                                mygraph.NuevoA(v1, v2, distancia);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se puede abrir este archivo '" + miArchivo + "'");
        } catch (IOException ex) {
            System.out.println("No se puede leer este archivo '" + miArchivo + "'");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex);
        }
        Central.setGraph(mygraph);
    }
}
