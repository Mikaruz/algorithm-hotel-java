
package Grafo;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;

/**
 *
 * @author orian
 */
public abstract class DibujarGrafo implements ViewerListener {

    /*
    En esta clase se utiliza la libreria GraphStream (http://graphstream-project.org/) 
    para representar el grafo de forma grafica.
    
    La libreria deberia estar ya configurada al abrir el proyecto, en caso contrario las carpetas
    donde estan los archivos .jar de la libreria forman parte del zip. Solamente
    hay que agregar en las librerias del proyecto los archivos llamados: gs-algo-1.3, 
    gs-core-1.3 y gs-ui-1.3. Dichos archivos se encuentran en carpetas con el 
    mismo nombre.
     */

 /* Aqui se especifica todo lo referente al estilo de los vertices y aristas 
    al graficar*/
    protected static String estilo = ""
            + " node {"
            + "     fill-mode: gradient-diagonal1;"
            + "     fill-color: rgb(0,118,137), rgb(144,212,222);"
            + "     text-size: 15%;"
            + "     text-alignment: center;"
            + "     size: 0.05%;"
            + "     text-style: bold;"
            + "     text-color: rgb(255,255,255);"
            + "     stroke-color: black;"
            + "     stroke-mode: plain;"
            + "     stroke-width: 0.003%;"
            + " }"
            + " node.marked {"
            + "     fill-mode: gradient-diagonal1;"
            + "     text-alignment: center;"
            + "     fill-color: rgb(182,229,88), rgb(116, 151, 47);"
            + "     text-size: 15%;"
            + "     text-style: bold;"
            + "     size: 0.05%;"
            + "     stroke-color: black;"
            + "     stroke-mode: plain;"
            + "     stroke-width: 0.003%;"
            + " }"
            + " edge {"
            + "     text-size: 10%;"
            + "     size: 0.0045%;"
            + "     text-alignment: along;"
            + "     text-padding: 0.0065%, 0%;"
            + "     text-background-mode: rounded-box;"
            + "     text-background-color: rgb(255,255,255);"
            + " }"
            + " edge.marked {"
            + "     fill-color: rgb(197,242,93);"
            + "     size: 0.006%;"
            + "     text-size: 10%;"
            + "     text-alignment: under;"
            + "     text-padding: 0.0065%, 0%;"
            + "     text-background-mode: rounded-box;"
            + "     text-background-color: rgb(255,255,255);"
            + " }";


    /* 
    Esta funcion se encarga de representar graficamente el grafo recibido 
    como argumento
     */
    public static void Dibujar(Grafo g) {

        Graph graph = new SingleGraph("Clientes");

        graph.addAttribute("ui.stylesheet", estilo);

        /* A partir del grafo recibido agrego los vertices y aristas en un nuevo
        grafo que pertenece a la clase grafo de la libreria*/
        for (int i = 0; i < g.getnVertices(); i++) {
            Node n = graph.addNode(g.Vertices[i].getNombre());
            n.addAttribute("ui.label", i + 1);
        }

        for (int i = 0; i < g.getnVertices(); i++) {
            for (int j = 0; j < i; j++) {
                if (g.MatrizAd[i][j] != 0 && g.MatrizAd[i][j] != g.VALOR_MAX) {
                    String a = Integer.toString(i);
                    String b = Integer.toString(j);
                    Edge e = graph.addEdge(a + "-" + b, g.Vertices[i].getNombre(), g.Vertices[j].getNombre());
                    e.addAttribute("ui.label", g.MatrizAd[i][j]);
                }
            }
        }
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

        //Una vez que el grafo esta construido, lo muestro al usuario
        Viewer viewer = graph.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);

    }
      }
