/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project3;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author josehernandez
 */
public class InteractiveGraphView1 {
    Graph<String, RutaArista> g1;
    /** Creates a new instance of SimpleGraphView */
    public InteractiveGraphView1() {
                // Graph<V, E> where V is the type of the vertices and E is the type of the edges
        g1 = new DirectedSparseGraph<String, RutaArista>();
        // Add some vertices. From above we defined these to be type Integer.
        
        //Creación e inserción al grafo de los vértices (destinos)
        g1.addVertex("TGU");//Aeropuerto de Tegucigalpa
        g1.addVertex("MIA");//Aeropuerto de Miami
        g1.addVertex("ATL");//Aeropuerto de Atlanta
        g1.addVertex("JFK");//Aeropuerto de New York City
        g1.addVertex("SAP");//Aeropuerto de San Pedro Sula
        g1.addVertex("RTB");//Aeropuerto de Roatán
        g1.addVertex("MEX");//Aeropuerto de Mexico City
        g1.addVertex("SAL");//Aeropuerto de San Salvador
        g1.addVertex("MGA");//Aeropuerto de Managua
        g1.addVertex("PTY");//Aeropuerto de Panama City
        g1.addVertex("BOG");//Aeropuerto de Bogotá
        g1.addVertex("LIM");//Aeropuerto de Lima
        g1.addVertex("CUN");//Aeropuerto de Cancun
        g1.addVertex("PHL");//Aeropuerto de Philadelphia
        g1.addVertex("LAX");//Aeropuerto de Los Angeles
        g1.addVertex("DFW");//Aeropuerto de Dallas
        g1.addVertex("SEA");//Aeropuerto de Seattle
        g1.addVertex("MAD");//Aeropuerto de Madrid
        g1.addVertex("HNL");//Aeropuerto de Honolulu
        g1.addVertex("BER");//Aeropuerto de Berlin
        g1.addVertex("HND");//Aeropuerto de Tokyo
        g1.addVertex("AMS");//Aeropuerto de Amsterdam
        g1.addVertex("NAP");//Aeropuerto de Napoli
        g1.addVertex("BWI");//Aeropuerto de Baltimore-Washington D.C.
        
        //Agregar las Aristas (Vuelos y Sus Precios)
        g1.addEdge(new RutaArista("Avianca Avianca Taca", 706.30), "TGU", "MIA");
        g1.addEdge(new RutaArista("American Airlines", 706.30), "TGU", "CUN");
        g1.addEdge(new RutaArista("Delta Airlines", 557.81), "ATL", "JFK");
        g1.addEdge(new RutaArista("American Airlines", 877.10), "TGU", "BWI");
        g1.addEdge(new RutaArista("Avianca Avianca Taca", 183.70), "TGU", "SAP");
        g1.addEdge(new RutaArista("Avianca Taca", 497.03), "SAL", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 159.00), "SAP", "RTB");
        g1.addEdge(new RutaArista("Avianca Taca", 198.20), "RTB", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 529.76), "SAP", "MGA");
        g1.addEdge(new RutaArista("American Airlines", 589.10), "MIA", "MEX");
        g1.addEdge(new RutaArista("Avianca Taca", 646.65), "MEX", "SAL");
        g1.addEdge(new RutaArista("American Airlines", 586.90), "MIA", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 417.93), "SAP", "SAL");
        g1.addEdge(new RutaArista("Avianca Taca", 431.73), "MGA", "SAL");
        g1.addEdge(new RutaArista("Avianca Taca", 520.33), "SAL", "PTY");
        g1.addEdge(new RutaArista("Avianca Taca", 441.93), "SAL", "MGA");
        g1.addEdge(new RutaArista("American Airlines", 548.66), "PTY", "MIA");
        g1.addEdge(new RutaArista("Avianca Avianca Taca", 520.33), "PTY", "BOG");
        g1.addEdge(new RutaArista("Avianca Taca", 638.13), "BOG", "LIM");
        g1.addEdge(new RutaArista("Avianca Taca", 554.96), "PHL", "ATL");
        g1.addEdge(new RutaArista("Avianca Taca", 641.81), "TGU", "ATL");
        g1.addEdge(new RutaArista("Avianca Taca", 1738.36), "LIM", "TGU");
        g1.addEdge(new RutaArista("Avianca Taca", 194.88), "TGU", "RTB");
        g1.addEdge(new RutaArista("Avianca Taca", 897.20), "TGU", "BOG");
        g1.addEdge(new RutaArista("United", 859.00), "CUN", "SAP");
        g1.addEdge(new RutaArista("American Airlines", 543.25), "MIA", "PHL");
        g1.addEdge(new RutaArista("Copa Airlines", 427.49), "SAP", "MEX");
        g1.addEdge(new RutaArista("Copa Airlines", 651.80), "SAP", "PTY");
        g1.addEdge(new RutaArista("Copa Airlines", 1133.40), "TGU", "LAX");
        g1.addEdge(new RutaArista("Copa Airlines", 1123.40), "LAX", "SAP");
        g1.addEdge(new RutaArista("American Airlines", 483.55), "SEA", "DFW");
        g1.addEdge(new RutaArista("American Airlines", 381.00), "MIA", "JFK");
        g1.addEdge(new RutaArista("American Airlines", 2912.00), "JFK", "MAD");
        g1.addEdge(new RutaArista("American Airlines", 488.00), "MEX", "BWI");
        g1.addEdge(new RutaArista("American Airlines", 266.00), "BWI", "LAX");
        g1.addEdge(new RutaArista("American Airlines", 406.00), "LAX", "HNL");
        g1.addEdge(new RutaArista("American Airlines", 425.00), "MIA", "SEA");
        g1.addEdge(new RutaArista("American Airlines", 2907.00), "MIA", "BER");
        g1.addEdge(new RutaArista("easyJet", 300.34), "BER", "MAD");
        g1.addEdge(new RutaArista("Delta", 2006.00), "JFK", "HND");
        g1.addEdge(new RutaArista("American Airlines", 453.45), "NAP", "AMS");
        g1.addEdge(new RutaArista("American Airlines", 3074.80), "AMS", "JFK");
        g1.addEdge(new RutaArista("American Airlines", 528.36), "DFW", "MIA");
        g1.addEdge(new RutaArista("American Airlines", 3754.47), "MIA", "AMS");
        g1.addEdge(new RutaArista("Spirit", 190.32), "SAP", "MIA");
        g1.addEdge(new RutaArista("Spirit", 405.82), "SAL", "JFK");
        g1.addEdge(new RutaArista("easyJet", 383.13), "MAD", "NAP");
        g1.addEdge(new RutaArista("United", 304.00), "HNL", "HND");
        g1.addEdge(new RutaArista("United", 307.00), "HND", "HNL");
        g1.addEdge(new RutaArista("American Airlines", 788.00), "HND", "LAX");
        g1.addEdge(new RutaArista("American Airlines", 408.00), "HNL", "LAX");
 
    }
    
}
