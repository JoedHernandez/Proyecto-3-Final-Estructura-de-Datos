/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

//JUNG LIBRARY
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josehernandez
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    DefaultListModel modelo;

    Graph g1; //Grafo principal, ciudades y sus vuelos

    public Window() {
        initComponents();
        modelo = new DefaultListModel();
        g1 = new DirectedSparseGraph<String, RutaArista>();

        //Agregar Los Vertices(Aeropuertos)
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ciudades_lista = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        ciudades_cmBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        origen_cmBox = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        costo_total = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_escalas = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aerolineas H&G");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jButton1.setText("Buscar Vuelo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 130, 93, 23);

        jLabel3.setText("Escalas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 220, 50, 14);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 200, 300, 10);

        jScrollPane1.setViewportView(ciudades_lista);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 30, 130, 150);

        jLabel2.setText("Ciudades");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 14);

        ciudades_cmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TGU", "ATL", "SAL", "SAP", "RTB", "MIA", "MEX", "MGA", "PTY", "BOG", "PHL", "LIM", "CUN", "LAX", "SEA", "JFK", "BWI", "NAP", "AMS", "DFW", "SPS", "MAD", "HNL", "HND", "BER" }));
        ciudades_cmBox.setSelectedIndex(ciudades_cmBox.getItemCount()-1);
        ciudades_cmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudades_cmBoxActionPerformed(evt);
            }
        });
        jPanel1.add(ciudades_cmBox);
        ciudades_cmBox.setBounds(10, 80, 110, 20);

        jLabel1.setText("Ciudades a Visitar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 120, 14);

        jLabel4.setText("Origen");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 50, 14);

        origen_cmBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TGU", "ATL", "SAL", "SAP", "RTB", "MIA", "MEX", "MGA", "PTY", "BOG", "PHL", "LIM", "CUN", "LAX", "SEA", "JFK", "BWI", "NAP", "AMS", "DFW", "SPS", "MAD", "HNL", "HND", "BER" }));
        origen_cmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origen_cmBoxActionPerformed(evt);
            }
        });
        jPanel1.add(origen_cmBox);
        origen_cmBox.setBounds(10, 30, 110, 20);

        btnAgregar.setText("+");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(120, 80, 40, 30);

        jButton2.setText("Dibujar Grafo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(23, 160, 110, 23);

        jLabel5.setText("Costo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 220, 28, 14);

        costo_total.setEditable(false);
        jPanel1.add(costo_total);
        costo_total.setBounds(200, 240, 110, 20);

        jScrollPane3.setViewportView(lista_escalas);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 240, 140, 180);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Generar Grafo");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
    
        /*
         * Al dar clic a éste botón, agregamos la ciudad en el comboBox rotulada "Ciudades"
         * a la lista ciudades_lista, indicándole al programa que se desea pasar por ésa ciudad.
         * El usuario es libre de ingresar cuantas ciudades se desee, con tal que se tengan por lo menos 2 diferentes
         * ciudades ingresadas en la lista.
         */
        
        modelo.add(modelo.getSize(), ciudades_cmBox.getSelectedItem());//agregamos al modelo de la lista de ciudades
                                                                        //a recorrer.
        ciudades_lista.setModel(modelo);//asignamos éste nuevo modelo a la lista.
        
        /*
         * Removemos la ciudad agregada de las opciones del comboBox como validación con el fin de
         * eliminar la probabilidad de que el usuario ingrese la misma ciudad dos veces
         */
        ciudades_cmBox.removeItemAt(ciudades_cmBox.getSelectedIndex());
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void origen_cmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origen_cmBoxActionPerformed
      
        /*
         * Éste evento ocurre cuando el usuario selecciona la ciudad de origen, o sea, de arranque de el viaje
         * cuyo precio desea calcular. Al momento de seleccionar una ciudad de origen del comboBox rotulado "Origen",
         * se agrega ésta ciudad automáticamente a la lista de ciudades con recorrer. Ésto se hace con el objetivo 
         * de brindar al usuario una interfaz amigable que evite que el usuario de interese por apretar tantos botones,
         * y se concentre sólamente en lo que le interesa, planear su vuelo fácilmente.
         */
        
        if (!modelo.isEmpty()) {//si está vacio...
            modelo.set(0, origen_cmBox.getSelectedItem());//se asigna el item del comboBox a la primera posición.
            ciudades_lista.setModel(modelo);//se asigna éste modelo al modelo de la lista.
        } else {//si la lista ya tiene elementos
            modelo.add(0, origen_cmBox.getSelectedItem());//se agrega el item a la primera posición.
            ciudades_lista.setModel(modelo);//se le asigna éste model a la lista.
        }
    }//GEN-LAST:event_origen_cmBoxActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       
        /*
         * A través de investigaciones realizadas por nosostros, hemos sido capaces de crear un Frame que en la cual
         * apreciaremos el grafo de forma visual e interactiva. El usuario derá capáz de observar todos los aeropuertos,
         * y cada una de sus conexiones (ambas entradas y salidas), así como el peso de cada vuelo que conecta a cualquier
         * par de vértices. 
         * 
         * Es importante notar que dentro de la ventana, podemos darle ZOOM y ARRASTRAR el grafo para moverlo, 
         * comprimirlo, y/o agrandarlo dentro de la ventana para ayudar a ver mejor todas las conexiones disponibles.
         */
        InteractiveGraphView1 sgv = new InteractiveGraphView1();
        // Layout<V, E>, VisualizationComponent<V,E>
        Layout<Integer, String> layout = new CircleLayout(sgv.g1);
        layout.setSize(new Dimension(300, 300));
        VisualizationViewer<Integer, String> vv
                = new VisualizationViewer<Integer, String>(layout);
        vv.setPreferredSize(new Dimension(350, 350));
        // mostrar vertices y sus etiquetas
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        // Creamos un mouse para el grafo y lo agregamos a su componente de visualización
        DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);
        JFrame frame = new JFrame("Mapa de Ciudades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);

    }//GEN-LAST:event_jButton2MouseClicked

    private void ciudades_cmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudades_cmBoxActionPerformed
     
        /*
         * Éste evento es básicamente creado para validar que el usuario no agregue a la lista una ciudad repetida,
         * ofreciéndole un mensaje de advertencia, y deshabilitando el botón para agregar ciudades. Éste botón
         * se habilitaría nuévamente cuando el usuario haya seleccionado una ciudad válida.
         */
        
        if (ciudades_cmBox.getSelectedItem() == origen_cmBox.getSelectedItem()) {//si se ingresara una ciudad repetida...
            JOptionPane.showMessageDialog(null, "No puede visitar su ciudad de origen", "Error", JOptionPane.ERROR_MESSAGE);
            btnAgregar.setEnabled(false);//mensaje de error, y dehabilitamos el boton de agregar
        } else {
            btnAgregar.setEnabled(true);//se habilita el botón si la ciudad es válida
        }
    }//GEN-LAST:event_ciudades_cmBoxActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    
        
         /*
         * A través de investigaciones realizadas por nosostros, hemos sido capaces de crear un Frame que en la cual
         * apreciaremos el grafo de forma visual e interactiva. El usuario derá capáz de observar todos los aeropuertos,
         * y cada una de sus conexiones (ambas entradas y salidas), así como el peso de cada vuelo que conecta a cualquier
         * par de vértices. 
         * 
         * Es importante notar que dentro de la ventana, podemos darle ZOOM y ARRASTRAR el grafo para moverlo, 
         * comprimirlo, y/o agrandarlo dentro de la ventana para ayudar a ver mejor todas las conexiones disponibles.
         */
        
        InteractiveGraphView1 sgv = new InteractiveGraphView1();
        // Layout<V, E>, VisualizationComponent<V,E>
        Layout<Integer, String> layout = new CircleLayout(sgv.g1);
        layout.setSize(new Dimension(300, 300));
        VisualizationViewer<Integer, String> vv
                = new VisualizationViewer<Integer, String>(layout);
        vv.setPreferredSize(new Dimension(350, 350));
        // mostramos los vertices y sus etiquetas
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        // Creamos un mouse del grafo y lo añadimos a un componente de visualzación
        DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);
        JFrame frame = new JFrame("Mapa de Ciudades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         String one = modelo.get(0).toString();//primer elemento de la lista
        Double cost = 0.0;//elemento siguiente de la lista
        while (!modelo.isEmpty() && modelo.size() != 1) {
            String one1 = modelo.get(0).toString();
            String two = modelo.get(1).toString();
            Lista flight = caminoMasCorto(g1, one1, two);//Lista que obtiene los pesos de los nodos por los que pasa
                                                            //para la ruta más corta
            try {//Try catch para determinar si hay vuelos
                costo_total.setText(String.format("%.6g%n", flight.get(flight.size() - 1)));//Se pone el costo
                Double cost1 = Double.parseDouble(costo_total.getText());
                cost += cost1;//se adiciona al total final
                
                /*
                 * A continuación, agregamos las listas por las que pasa el metodo para añadirlas a una lista
                 * de itinerario, con la finalidad de hacer un programa que se claro con el usuario, describiendole cual
                 * ruta llega a ser la mas barata de todas (no siempre la mas barata es necesariamente la mas corta).
                 */
                DefaultListModel listModel = new DefaultListModel();
                for (int i = 0; i < flight.size() - 1; i++) {
                    listModel.addElement(flight.get(i));//se agrega al modelo que será seteado a la lista de itinerario.
                    if (flight.get(i).equals(two)) {
                        break;
                    }
                }
                this.lista_escalas.setModel(listModel);//Se pone itinerario en la lista
                modelo.remove(0);
            } catch (Exception e) {
                e.printStackTrace();
                DefaultListModel listModel = new DefaultListModel();
                listModel.addElement("No Hay Vuelos");
                this.lista_escalas.setModel(listModel);//Se pone itinerario en la lista
            }
        }
        while (!modelo.isEmpty() && modelo.size() == 1) {//recorremos la lista y vamos eliminando el elemento
                                                        //con que ya terminamos de procesar al final de cada iteración
            String two = modelo.get(0).toString();
            Lista flight = caminoMasCorto(g1, two, one);//Lista que obtiene los nodos del camino más barato
            try {//Try catch para determinar si hay vuelos
                costo_total.setText(String.format("%.6g%n", flight.get(flight.size() - 1)));//Se pone el costo
                Double cost1 = Double.parseDouble(costo_total.getText());
                cost += cost1;//se adiciona al costo final
                DefaultListModel listModel = new DefaultListModel();
                for (int i = 0; i < flight.size() - 1; i++) {
                    listModel.addElement(flight.get(i));
                    if (flight.get(i).equals(one)) {
                        break;
                    }
                }
                this.lista_escalas.setModel(listModel);//Se pone itinerario en la lista
                modelo.remove(0);//removemos el primer elemento de la lista porque ya no lo necesitamos
            } catch (Exception e) {
                e.printStackTrace();
                DefaultListModel listModel = new DefaultListModel();
                listModel.addElement("No Hay Vuelos");
                this.lista_escalas.setModel(listModel);//Se pone itinerario en la lista
            }
        }
        costo_total.setText(String.format("%.6g%n", cost));
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox ciudades_cmBox;
    private javax.swing.JList ciudades_lista;
    private javax.swing.JTextField costo_total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JList lista_escalas;
    private javax.swing.JComboBox origen_cmBox;
    // End of variables declaration//GEN-END:variables
Lista caminoMasCorto(Graph g, String source, String target) {
        /*
         * Se instancia con pilas, que contendrán el camino más corto
         * a todos los vértices. Se crea el arreglo que contendrá el costo de recorrer el 
         * camino más corto del vértice inicial hasta el destino. 
         */
        Cola[] paso = new Cola[g.getVertexCount()];//Stack para el camino más corto
        for (int i = 0; i < paso.length; i++) {//insertamos una cola en cada nodo del arreglo
            paso[i] = new Cola();//Se crea un arreglo en cada posición del arreglo
        }
        double[] valoresCaminos = new double[g.getVertexCount()];//Costos de los caminos a todos los vértices de uno inicial
        Arrays.fill(valoresCaminos, 999999999);//Llena el arreglo
        Collection vertices_c = g.getVertices();//Obtiene los vérites del grafo con el que estamos trabajando 
        Object[] vertices = vertices_c.toArray();//el toArray ingresa los vértices a un arreglo (de vértices).
        vertices_c = new TreeSet<>(vertices_c);
        String verticeCaminoCorto = "";//Vértice del camino más corto
        Cola caminoCorto = new Cola();
        vertices_c.remove(source);
        double valorCaminoCorto = 999999999;

        //cálculo del camino del vertice inicial a sus vecinos
        
        for (int i = 0; i < vertices.length; i++) {//recorremos el arreglo que creamos con el toArray
            if (!vertices[i].equals(source)) {//para no coparar con el vértice inicial
                if (g.findEdge(source, vertices[i]) != null) {//si la arista actual en efecto existe...
                    double pathValue = ((RutaArista) g.findEdge(source, vertices[i])).getCost();//Obtiene el peso de la arista
                    valoresCaminos[i] = pathValue;//agregamos ese peso (precio) al arreglo de costos
                    paso[i].queue(source);
                    paso[i].queue(vertices[i]);//Se introduce el vértice a la cola
                    if (i == 0) {
                        verticeCaminoCorto = (String) vertices[i];
                        valorCaminoCorto = pathValue;
                        caminoCorto = paso[i];
                    } else {
                        if (pathValue < valorCaminoCorto) {//Determina cual es la arista de menor costo
                            verticeCaminoCorto = (String) vertices[i];
                            valorCaminoCorto = pathValue;
                            caminoCorto = paso[i];
                        }//fin del if
                    }//fin del esle
                }//fin del if
            }//fin del if
        }//fin del for

        /*
         * Aquí calculamos el camino más corto a cada uno
         * de los vértices siendo analizados.
         */
        int iteracion = 0;
        while (vertices_c.size() > 1) {
             boolean remove = vertices_c.remove(verticeCaminoCorto);//Elimina el vértice del conjunto de vértices ya que este forma parte del camino más corto
            for (int i = 0; i < vertices.length; i++) {//determina cual de los caminos es el mác corto de todos.
                if (vertices_c.contains(vertices[i]) == true) {
                    if (g.findEdge(verticeCaminoCorto, vertices[i]) != null) {//si existe la arista...
                        double path = valorCaminoCorto + ((RutaArista) g.findEdge(verticeCaminoCorto, vertices[i])).getCost();/*
                         * Calcula el valor de traversar el camino corto, determinado 
                         * hasta X vértice, y a ésto se le suma el peso de la arista 
                         * hacia el vértice actual.
                         */

                        if (Math.min(valoresCaminos[i], path) == path) {/*
                             * Determina cual es el camino más corto usando las distancias calculadas. 
                             * Se sustituye en el arreglo de distancias si es menor, y se agrega el 
                             * vértice a la pila.
                             */

                            valoresCaminos[i] = path;//El valor calculado es ingresado al arreglo de valor de caminos más cortos
                            paso[i] = ((Cola) caminoCorto).duplicate();
                        }//fin del if
                    }//fin del if
                }//fin del if
            }//fin del for
            double new_path = 999999999;//numero intencionalmente grande utilizado para comparaciones
           
            /*
             * probamos todos los vértices restantes, con el fin de determinar el camino que cuente con el menor costo
             */
            
            double save = 9999999;//Número que se utiliza como comparación
            for (int i = 0; i < vertices.length; i++) {
                if (vertices_c.contains(vertices[i]) == true) {
                    if (valoresCaminos[i] < new_path) {
                        new_path = valoresCaminos[i];
                        verticeCaminoCorto = (String) vertices[i];
                        if (save > valoresCaminos[i]) {
                            save = valoresCaminos[i];
                            iteracion = i;
                        }//fin del if
                        if (!((Cola) paso[i]).last().equals(vertices[i])) {
                            paso[i].queue(vertices[i]);
                        }//fin del if
                        caminoCorto = paso[i];
                    }//fin del if
                }//fin del if
            }//fin del for
            valorCaminoCorto = new_path;//Asigna el nuevo valor del camino más corto
        }//fin del while

        Lista retVal = new Lista();//Lista que será retornada con el camino más corto
        retVal.init();//inicianizamos la lista
        int ite = paso[iteracion].size();
        for (int i = 0; i < ite; i++) {//insertamos los vértices del camino más corto a la lista
            retVal.insert(paso[iteracion].dequeue());
        }//fin del for
        for (int i = 0; i < paso.length; i++) {//buscamos el costo más bajo del camino más corto entre los vértices
            if (paso[i].peek().equals(source) && paso[i].last().equals(target)) {
                int jj = paso[i].size();
                for (int j = 0; j < jj; j++) {
                    if (j == (jj - 1)) {
                        retVal.insert(valoresCaminos[i]);
                        break;
                    }//fin del if

                }//fin del for
                break;
            }//fin del if
        }//fin del for
        return retVal;//Retornamos la lista
    }//fin del método caminoMasCorto
}//fin de la clase Window
