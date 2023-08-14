package programahotel;

import Algoritmos.BuscarNodo;
import Algoritmos.ClientesAleatorios;
import Algoritmos.EliminarNodo;
import Algoritmos.InsertarNodo;
import Algoritmos.Nodo;
import Algoritmos.OrdenarNodo;

import Grafo.Central;
import static Grafo.Central.graph;
import static Grafo.DibujarGrafo.Dibujar;
import Registro.menu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

public class Pantalla extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    
    BuscarNodo buscar = new BuscarNodo();
    EliminarNodo eliminar = new EliminarNodo();
    InsertarNodo insertar = new InsertarNodo();
    OrdenarNodo orden = new OrdenarNodo();
    
    public Nodo ini, fin;
    public Nodo pFound;
    
    int num = 0;
    
    public Pantalla() {
        boolean PrimeraVezInciado = Central.getIniciado();
        
        if (!PrimeraVezInciado){
            String archivoActual = Central.getActual();
            File porDefecto = new File("ArchivoPorDefecto.txt");
            File actual = new File(archivoActual);
          
            Central.CargarGrafo1();
            Central.setInciado(true);
        }

        this.setUndecorated(true);
        
        initComponents();
        
        model.addColumn("N°");
        model.addColumn("Nombre(s)");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("DNI");
        model.addColumn("Teléfono");
        model.addColumn("E-mail");
        model.addColumn("Tipo de habitación");
        
        jTableHuespedes.setModel(model); 
        
        this.setLocationRelativeTo(null); 
        jButtonEliminarCliente.setEnabled(false);
        
        InsertarClientesAleatorios(10);
    }

    final void InsertarClientesAleatorios(int cantidad){
        String[] nombresGenerados = ClientesAleatorios.generarNombresAleatorios(cantidad);
        String[] apellidoPaternosGenerados = ClientesAleatorios.generarApellidosPaternosAleatorios(cantidad);
        String[] apellidosMaternosGenerados = ClientesAleatorios.generarApellidosMaternosAleatorios(cantidad);
        String[] DNIGenerados = ClientesAleatorios.generarDNIAleatorios(cantidad);
        String[] telefonosGenerados = ClientesAleatorios.generarTelefonosAleatorios(cantidad);
        String[] correosGenerados = ClientesAleatorios.generarCorreosAleatorios(cantidad);
        String[] habitacionesGeneradas = ClientesAleatorios.generarHabitacionesAleatorias(cantidad);
        
        for(int i = 0; i < nombresGenerados.length; i++) {
                ini = insertar.InsertarNodo(ini, nombresGenerados[i], apellidoPaternosGenerados[i], apellidosMaternosGenerados[i], DNIGenerados[i], telefonosGenerados[i],
                        (apellidoPaternosGenerados[i] + apellidosMaternosGenerados[i] + correosGenerados[i]).toLowerCase(), habitacionesGeneradas[i]);
        }
        
        InsertarDatosTabla();
    }
    
    void LimpiarEntradasRegistro(){
        jTextFieldNombre.setText("");
        jTextFieldApellidoPaterno.setText("");
        jTextFieldApellidoMaterno.setText("");
        jTextFieldDni.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmail.setText("");
        jComboBoxTipoDeHabitacion.setSelectedItem("Individual");
        jTextFieldNombre.requestFocus();
    }    
    
    public void LimpiarTabla(){
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }        
    }

    void ImprimirRecibo(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String email, String tipoDeHabitacion){
        jTextAreaRecibo.setText("=================================================================\n" +
                "=================================================================\n" +
                "Cliente: " + nombre + "\n" +
                "Apellidos: " + apellidoPaterno + " " + apellidoMaterno + "\n" +
                "DNI: " + dni + "\n" +
                "Teléfono: " + telefono + "\n" +
                "E-mail: " + email + "\n" +
                "Tipo de habitación: " + tipoDeHabitacion + "\n" +
                "=================================================================\n" +
                "=================================================================\n");
    }
   
    public void InsertarDatosTabla(){
        String nom, aP, aM , dni, telf, email, tipoH;
        Nodo aux = ini;
        num = 0;
      
        while(aux != null){
            nom = aux.nombre;
            aP = aux.apellidoPaterno;
            aM = aux.apellidoMaterno;
            dni = aux.dni;
            telf = aux.telefono;
            email = aux.email;
            tipoH = aux.tipoDeHabitacion;
            
            num++;
            
            String numera = String.valueOf(num);
                
            model.addRow(new Object[]{numera, nom, aP, aM, dni, telf, email, tipoH});                
            
            aux = aux.sig;    
        }    
    }    

    void Eliminar(Nodo pFound){   
        if(ini == fin && pFound == ini){
            ini = fin = null;
        }
        else if(pFound == ini){
            ini = ini.sig;
        }
        else{
            Nodo anterior, temporal;
                
            anterior = ini;
            temporal = ini.sig;
                
            while(temporal != null && temporal != pFound){
                anterior = anterior.sig;
                temporal = temporal.sig;
            }
                
            if(temporal != null){
                anterior.sig = temporal.sig;
                    
                if(temporal == fin){
                    fin = anterior;
                }
            }
        }
      
        LimpiarTabla();
        InsertarDatosTabla();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelOrdenar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelBuscar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelEliminar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanelRegistro = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHuespedes = new javax.swing.JTable();
        jButtonOrdenarClientes = new javax.swing.JButton();
        jComboBoxModoDeOrden = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidoPaterno = new javax.swing.JTextField();
        jTextFieldApellidoMaterno = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxTipoDeHabitacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRecibo = new javax.swing.JTextArea();
        jButtonAñadirHuesped = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBusqueda = new javax.swing.JTextArea();
        jComboBoxClientesDatos = new javax.swing.JComboBox<>();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldBuscarCliente = new javax.swing.JTextField();
        jButtonEliminarCliente = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel4.setText("Hotel ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/LogoHotel.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 70, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/LogoHotelFondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 201));

        jPanelOrdenar.setBackground(new java.awt.Color(255, 204, 51));
        jPanelOrdenar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelOrdenarMouseMoved(evt);
            }
        });
        jPanelOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelOrdenarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelOrdenarMouseExited(evt);
            }
        });
        jPanelOrdenar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel5.setText("Registro Sucursales");
        jPanelOrdenar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 22));

        jPanel2.add(jPanelOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 250, 50));

        jPanelDashboard.setBackground(new java.awt.Color(255, 204, 51));
        jPanelDashboard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelDashboardMouseMoved(evt);
            }
        });
        jPanelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDashboardMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelDashboardMouseExited(evt);
            }
        });
        jPanelDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel6.setText("Dashboard");
        jPanelDashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 22));

        jPanel2.add(jPanelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 50));

        jPanelBuscar.setBackground(new java.awt.Color(255, 204, 51));
        jPanelBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelBuscarMouseMoved(evt);
            }
        });
        jPanelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBuscarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBuscarMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel7.setText("Administrar");

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel7)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, -1));

        jPanelEliminar.setBackground(new java.awt.Color(255, 204, 51));
        jPanelEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelEliminarMouseMoved(evt);
            }
        });
        jPanelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelEliminarMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel8.setText("Ver Mapa");

        javax.swing.GroupLayout jPanelEliminarLayout = new javax.swing.GroupLayout(jPanelEliminar);
        jPanelEliminar.setLayout(jPanelEliminarLayout);
        jPanelEliminarLayout.setHorizontalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel8)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanelEliminarLayout.setVerticalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        jPanelRegistro.setBackground(new java.awt.Color(255, 204, 51));
        jPanelRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelRegistroMouseMoved(evt);
            }
        });
        jPanelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRegistroMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRegistroMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel11.setText("Registro");

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel11)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 680));

        jLabelMinimizar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setText("_");
        jLabelMinimizar.setToolTipText("");
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 30, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jLabelSalir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalir.setText("X");
        jLabelSalir.setToolTipText("");
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 30, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/BarraSuperior.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1100, 60));

        jPanel8.setBackground(new java.awt.Color(255, 101, 38));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 153, 0));
        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Húespedes:");
        jLabel10.setOpaque(true);
        jLabel10.setRequestFocusEnabled(false);
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, -1));
        jLabel10.getAccessibleContext().setAccessibleName("huespedes");

        jTableHuespedes.setBackground(new java.awt.Color(255, 255, 255));
        jTableHuespedes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTableHuespedes.setForeground(new java.awt.Color(51, 51, 51));
        jTableHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableHuespedes.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane3.setViewportView(jTableHuespedes);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 1010, 430));

        jButtonOrdenarClientes.setBackground(new java.awt.Color(255, 153, 0));
        jButtonOrdenarClientes.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonOrdenarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrdenarClientes.setText("Ordenar");
        jButtonOrdenarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarClientesActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonOrdenarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jComboBoxModoDeOrden.setBackground(new java.awt.Color(255, 153, 0));
        jComboBoxModoDeOrden.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jComboBoxModoDeOrden.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxModoDeOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre(s)", "Apellido paterno", "Apellido materno" }));
        jPanel8.add(jComboBoxModoDeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 135, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/FondoDashboard.jpg"))); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 600));

        jTabbedPane1.addTab("Dashboard", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 101, 38));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 153, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Recibo:");
        jLabel12.setOpaque(true);
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 90, -1));

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Registro:");
        jLabel13.setOpaque(true);
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, -1));

        jLabel14.setBackground(new java.awt.Color(255, 153, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Nombre(s):");
        jLabel14.setOpaque(true);
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 40));

        jLabel15.setBackground(new java.awt.Color(255, 153, 0));
        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Apellido paterno:");
        jLabel15.setOpaque(true);
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 40));

        jLabel16.setBackground(new java.awt.Color(255, 153, 0));
        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" Apellido materno:");
        jLabel16.setOpaque(true);
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 40));

        jLabel17.setBackground(new java.awt.Color(255, 153, 0));
        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" DNI:");
        jLabel17.setOpaque(true);
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, 40));

        jLabel18.setBackground(new java.awt.Color(255, 153, 0));
        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" E-mail:");
        jLabel18.setOpaque(true);
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 70, 40));

        jLabel19.setBackground(new java.awt.Color(255, 153, 0));
        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Teléfono:");
        jLabel19.setOpaque(true);
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 90, 40));

        jTextFieldNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel9.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 161, -1));

        jTextFieldApellidoPaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel9.add(jTextFieldApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 161, -1));

        jTextFieldApellidoMaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel9.add(jTextFieldApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 161, -1));

        jTextFieldDni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel9.add(jTextFieldDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 161, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel9.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 161, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel9.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 161, -1));

        jLabel20.setBackground(new java.awt.Color(255, 153, 0));
        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Tipo de habitación:");
        jLabel20.setOpaque(true);
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 160, 40));

        jComboBoxTipoDeHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxTipoDeHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Familiar", "Matrimonial" }));
        jPanel9.add(jComboBoxTipoDeHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 161, -1));

        jTextAreaRecibo.setEditable(false);
        jTextAreaRecibo.setColumns(20);
        jTextAreaRecibo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextAreaRecibo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRecibo);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 459, 180));

        jButtonAñadirHuesped.setBackground(new java.awt.Color(255, 153, 51));
        jButtonAñadirHuesped.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonAñadirHuesped.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAñadirHuesped.setText("Añadir");
        jButtonAñadirHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirHuespedActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonAñadirHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 110, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/FondoRegistro.jpg"))); // NOI18N
        jLabel27.setText("jLabel27");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1100, 590));

        jTabbedPane1.addTab("Registro", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 101, 38));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(255, 153, 0));
        jLabel24.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText(" Buscar: ");
        jLabel24.setOpaque(true);
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTextAreaBusqueda.setEditable(false);
        jTextAreaBusqueda.setColumns(20);
        jTextAreaBusqueda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextAreaBusqueda.setRows(5);
        jScrollPane2.setViewportView(jTextAreaBusqueda);

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 480, 190));

        jComboBoxClientesDatos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxClientesDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre(s)", "Apellido paterno", "Apellido materno", "DNI" }));
        jPanel10.add(jComboBoxClientesDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, -1));

        jButtonBuscarCliente.setBackground(new java.awt.Color(255, 153, 0));
        jButtonBuscarCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarCliente.setText("Buscar");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 110, 60));

        jLabel25.setBackground(new java.awt.Color(255, 153, 0));
        jLabel25.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(" Buscar por:");
        jLabel25.setOpaque(true);
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 100, 40));

        jTextFieldBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel10.add(jTextFieldBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 150, -1));

        jButtonEliminarCliente.setBackground(new java.awt.Color(255, 153, 0));
        jButtonEliminarCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarCliente.setText("Eliminar");
        jButtonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarClienteActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 110, 60));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/FondoBuscar.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 1600, 680));

        jTabbedPane1.addTab("Buscar", jPanel10);

        jPanel7.setBackground(new java.awt.Color(255, 101, 38));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Grafo", jPanel7);

        jPanel1.setBackground(new java.awt.Color(255, 101, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel21.setText("jLabel21");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel22.setText("jLabel22");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel26.setText("Sucursales:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTabbedPane1.addTab("Sucursales", jPanel1);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("tab6", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 1110, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    Color colorNoSeleccionado = new Color(255, 204, 51);
    Color colorSeleccionado = new Color(255, 194, 0);
    
    private void jPanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDashboardMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanelDashboardMouseClicked

    private void jPanelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistroMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanelRegistroMouseClicked

    private void jPanelDashboardMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDashboardMouseMoved
        jPanelDashboard.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelDashboardMouseMoved

    private void jPanelDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDashboardMouseExited
        jPanelDashboard.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelDashboardMouseExited

    private void jPanelRegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistroMouseMoved
        jPanelRegistro.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelRegistroMouseMoved
   
    private void jPanelRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistroMouseExited
        jPanelRegistro.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelRegistroMouseExited

    private void jPanelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuscarMouseClicked
        jTabbedPane1.setSelectedIndex(2);
        
        
    }//GEN-LAST:event_jPanelBuscarMouseClicked

    private void jPanelBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuscarMouseMoved
        jPanelBuscar.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelBuscarMouseMoved

    private void jPanelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuscarMouseExited
        jPanelBuscar.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelBuscarMouseExited

    private void jPanelOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdenarMouseClicked
        jTabbedPane1.setSelectedIndex(3);
        
        new menu();
    }//GEN-LAST:event_jPanelOrdenarMouseClicked

    private void jPanelOrdenarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdenarMouseMoved
        jPanelOrdenar.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelOrdenarMouseMoved

    private void jPanelOrdenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdenarMouseExited
        jPanelOrdenar.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelOrdenarMouseExited

    private void jPanelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEliminarMouseClicked
        jTabbedPane1.setSelectedIndex(4);
        
        Dibujar(graph);
    }//GEN-LAST:event_jPanelEliminarMouseClicked

    private void jPanelEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEliminarMouseMoved
        jPanelEliminar.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelEliminarMouseMoved

    private void jPanelEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEliminarMouseExited
        jPanelEliminar.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelEliminarMouseExited

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jButtonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarClienteActionPerformed
        long start = System.currentTimeMillis();

        eliminar.Eliminar(pFound, ini, fin);
        
        LimpiarTabla();
        InsertarDatosTabla();   

        if(ini == null){
            JOptionPane.showMessageDialog(this, "Sin clientes", "Tabla vacía", JOptionPane.WARNING_MESSAGE);
        }

        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;

        JOptionPane.showMessageDialog(this, "Tiempo transcurrido: " + total + " segundos.", "Cliente eliminado", JOptionPane.INFORMATION_MESSAGE);
        jTextAreaBusqueda.setText("");

        jButtonEliminarCliente.setEnabled(false);
    }//GEN-LAST:event_jButtonEliminarClienteActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        String datoBuscar = jTextFieldBuscarCliente.getText();
        String datoNoEncontrado = null;

        long start = System.currentTimeMillis();

        if(datoBuscar.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Ingrese un dato por favor");
        }
        else{
            switch(jComboBoxClientesDatos.getSelectedItem().toString()){
                case "Nombre(s)":
                pFound = buscar.BuscarNodo(ini, datoBuscar, "Nombre");
                datoNoEncontrado = "nombre";
                break;
                case "Apellido paterno":
                pFound = buscar.BuscarNodo(ini, datoBuscar, "Apellido paterno");
                datoNoEncontrado = "apellido paterno";
                break;
                case "Apellido materno":
                pFound = buscar.BuscarNodo(ini, datoBuscar, "Apellido materno");
                datoNoEncontrado = "apellido materno";
                break;
                case "DNI":
                pFound = buscar.BuscarNodo(ini, datoBuscar, "DNI");
                datoNoEncontrado = "DNI";
                break;
            }

            if(pFound != null){
                jTextAreaBusqueda.setText("=================================================================\n" +
                    "=================================================================\n" +
                    "Cliente: " + pFound.nombre + "\n" +
                    "Apellidos: " + pFound.apellidoPaterno + " " + pFound.apellidoMaterno + "\n" +
                    "DNI: " + pFound.dni + "\n" +
                    "Teléfono: " + pFound.telefono + "\n" +
                    "E-mail: " + pFound.email + "\n" +
                    "Tipo de habitación: " + pFound.tipoDeHabitacion + "\n" +
                    "=================================================================\n" +
                    "=================================================================\n");

                long end = System.currentTimeMillis();
                double total = (double) (end - start) / 1000;

                JOptionPane.showMessageDialog(this, "Tiempo transcurrido: " + total + " segundos.", "Cliente encontrado", JOptionPane.INFORMATION_MESSAGE);
                jButtonEliminarCliente.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "El " + datoNoEncontrado + " " + datoBuscar + " no está en la tabla.", "Cliente no encontrado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButtonAñadirHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirHuespedActionPerformed
        String nombre = jTextFieldNombre.getText();
        String apellidoPaterno = jTextFieldApellidoPaterno.getText();
        String apellidoMaterno = jTextFieldApellidoMaterno.getText();
        String dni = jTextFieldDni.getText();
        String telefono = jTextFieldTelefono.getText();
        String email = jTextFieldEmail.getText();
        String tipoDeHabitacion = jComboBoxTipoDeHabitacion.getSelectedItem().toString();

        JOptionPane.showMessageDialog(this, "Cliente: " + nombre + " " + apellidoPaterno + " registrado con éxito");

        ImprimirRecibo(nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion);

        ini = insertar.InsertarNodo(ini, nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion);
        
        LimpiarEntradasRegistro();
        LimpiarTabla();
    }//GEN-LAST:event_jButtonAñadirHuespedActionPerformed

    private void jButtonOrdenarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarClientesActionPerformed
        long start = System.currentTimeMillis();
        
        if(ini != null){
            LimpiarTabla();
        
            switch(jComboBoxModoDeOrden.getSelectedItem().toString()){
                case "Nombre(s)":
                    orden.Ordenar("Nombre", ini);
                    InsertarDatosTabla();
                    long endN = System.currentTimeMillis();
                    double totalN = (double) (endN - start) / 1000;
                    JOptionPane.showMessageDialog(this, "Los clientes han sido ordenados por sus nombres. Tiempo transcurrido: " + totalN + " segundos.", "Ordenado", JOptionPane.INFORMATION_MESSAGE);
                break;
                case "Apellido paterno":
                    orden.Ordenar("Apellido paterno", ini);
                    InsertarDatosTabla();
                    long endAp = System.currentTimeMillis();
                    double totalAp = (double) (endAp - start) / 1000;
                    JOptionPane.showMessageDialog(this, "Los clientes han sido ordenados por sus apellidos paternos. Tiempo transcurrido: " + totalAp + " segundos.", "Ordenado", JOptionPane.INFORMATION_MESSAGE);
                break;
                case "Apellido materno":
                    orden.Ordenar("Apellido materno", ini);
                    InsertarDatosTabla();
                    long endAm = System.currentTimeMillis();
                    double totalAm = (double) (endAm - start) / 1000;
                    JOptionPane.showMessageDialog(this, "Los clientes han sido ordenados por sus apellidos maternos. Tiempo transcurrido: " + totalAm + " segundos.", "Ordenado", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay clientes", "Tabla vacía", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonOrdenarClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAñadirHuesped;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonEliminarCliente;
    private javax.swing.JButton jButtonOrdenarClientes;
    private javax.swing.JComboBox<String> jComboBoxClientesDatos;
    private javax.swing.JComboBox<String> jComboBoxModoDeOrden;
    private javax.swing.JComboBox<String> jComboBoxTipoDeHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelEliminar;
    private javax.swing.JPanel jPanelOrdenar;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableHuespedes;
    private javax.swing.JTextArea jTextAreaBusqueda;
    private javax.swing.JTextArea jTextAreaRecibo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldApellidoMaterno;
    private javax.swing.JTextField jTextFieldApellidoPaterno;
    private javax.swing.JTextField jTextFieldBuscarCliente;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
