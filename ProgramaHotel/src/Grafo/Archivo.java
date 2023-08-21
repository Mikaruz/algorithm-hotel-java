package Grafo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    public static void EscribirGrafoEnTxt() {
        Grafo mygraph = Central.getGraph();
        String cadenaClientes = Clientes();
        String caminos = Caminos(mygraph);
        File archivo;
        PrintWriter escribir;
        
        archivo = new File("ArchivoPorDefecto.txt");
        
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new PrintWriter(archivo, "utf-8");
                escribir.println();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                escribir = new PrintWriter(archivo, "utf-8");
                escribir.println("clientes");
                escribir.println(cadenaClientes);
                escribir.println("caminos");
                escribir.println(caminos);
                escribir.close();
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String Clientes() {
        Grafo mygraph = Central.getGraph();
        Vertice clientes[] = mygraph.getVertices();
        int num = mygraph.getnVertices();
        String cadenaClientes = "";

        for (int i = 0; i < num; i++) {
            cadenaClientes += Integer.toString(clientes[i].getNumVertice() + 1)
                    + "," + clientes[i].getNombre() + "," + clientes[i].getUrb();
            if (!clientes[i].getCalle().equals("")) {
                cadenaClientes += "," + clientes[i].getCalle();
            }
            if (i != num - 1) {
                cadenaClientes += "\n";
            }
        }

        return cadenaClientes;
    }

    public static String ClientesPantalla() {
        Grafo mygraph = Central.getGraph();
        Vertice clientes[] = mygraph.getVertices();
        int num = mygraph.getnVertices();
        String cadenaClientes = "Lista de Clientes:\n";

        for (int i = 0; i < num; i++) {
            cadenaClientes += "ID: " + Integer.toString(clientes[i].getNumVertice() + 1)
                    + " , " + clientes[i].getNombre() + " , " + clientes[i].getUrb();
            if (!clientes[i].getCalle().equals("")) {
                cadenaClientes += " , " + clientes[i].getCalle();
            }
            if (i != num) {
                cadenaClientes += "\n";
            }
        }
        return cadenaClientes;
    }

    public static String Caminos(Grafo g) {
        String caminos = "";
        for (int i = 1; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != g.VALOR_MAX) {
                    caminos += (j + 1) + "," + (i + 1) + "," + g.MatrizAd[i][j]
                            + "\n";
                }
            }
        }
        return caminos;
    }

    public static void copiarTxt(File archivoExterno, File archivoFijo) {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena, texto = "";

        try {
            leer = new FileReader(archivoExterno);
            almacenamiento = new BufferedReader(leer);

            try {
                while ((cadena = almacenamiento.readLine()) != null) {
                    texto += cadena + "\n";
                }
                PrintWriter escribir;
                archivoFijo.createNewFile();
                escribir = new PrintWriter(archivoFijo, "utf-8");

                escribir.println(texto);
                escribir.close();

            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean VerificarFormatoArchivo(File archivo) {
        boolean archivoValido;
        boolean tieneCaminos = false;
        boolean tieneClientes = false;
        boolean clientesValido = true;
        boolean caminosValido = true;

        String linea;
        String[] cliente;
        String[] ruta;
        FileReader leer;
        BufferedReader almacenamiento;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);

            while ((linea = almacenamiento.readLine()) != null) {

                if (!"".equals(linea)) {
                    if (linea.toLowerCase().equals("clientes")) {
                        tieneClientes = true;
                    } else if (linea.toLowerCase().equals("caminos")) {
                        tieneCaminos = true;
                    } else if (tieneClientes && !tieneCaminos) {
                        cliente = linea.split(",");
                        if (cliente.length != 3 && cliente.length != 4) {
                            clientesValido = false;
                            break;
                        }
                    } else if (tieneClientes && tieneCaminos) {
                        ruta = linea.split(",");
                        if (ruta.length != 3) {
                            caminosValido = false;
                            break;
                        }
                    }
                }

            }

            almacenamiento.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "No se puede abrir este archivo'"
                    + archivo + "'");
        } catch (IOException ex) {
            System.out.println(
                    "No se puede leer este archivo '"
                    + archivo + "'");

        }

        archivoValido = tieneClientes && tieneCaminos && clientesValido && caminosValido;
        return archivoValido;
    }
}
