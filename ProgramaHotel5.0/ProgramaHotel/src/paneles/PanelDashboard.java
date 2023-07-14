package paneles;

import Algoritmos.Nodo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import programahotel.PantallaPrincipal;


public class PanelDashboard extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    
    
    
    
    public Nodo ini, fin;
    public Nodo pFound;
    public int num = 0;
    
    
    public PanelDashboard() {
        
        initComponents();
        
            
        
        System.out.println("ararar1");
        
        model.addColumn("N°");
        model.addColumn("Nombre(s)");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("DNI");
        model.addColumn("Teléfono");
        model.addColumn("E-mail");
        model.addColumn("Tipo de habitación");
        jTableHuespedesHospedados.setModel(model); 
            
        model.addRow(new Object[]{"PRUEBA", "", "", "", "", "", "", ""});    
        
       
       InsertarDatos();
       model.addRow(new Object[]{"PRUEBA2", "", "", "", "", "", "", ""});  
    }
    
  
    
    public Nodo InsertarNodo1(Nodo inicio, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String email, String tipoDeHabitacion){
        Nodo nuevo = new Nodo(nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion);
        
        nuevo.sig = inicio;
        inicio = nuevo;
      
        return inicio;
    }
    
    public final void LimpiarTabla(){
        
        
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }        
    }
    
    

    public  void InsertarDatos(){
        String nom, aP, aM , dni, telf, email, tipoH;
        Nodo aux = ini;
        num = 0;
        
        System.out.println("Tabla nueva");
        model.addRow(new Object[]{"Prueba2uwu", "", "", "", "", "", "", ""}); 
        
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
            
            for(int i = String.valueOf(num).length(); i < 5; i++){
                numera = "" + numera;
            }
            
            for(int i = nom.length(); i < 28; i++){
                nom = "" + nom;
            }

            for(int i = aP.length(); i < 12; i++){
                aP = "" + aP;
            }
       
            for(int i = aM.length(); i < 12; i++){
                aM = "" + aM;
            }
            
            for(int i = dni.length(); i < 12; i++){
                dni = "" + dni;
            }

            for(int i = telf.length(); i < 12; i++){
                telf = "" + telf;
            }
            
            for(int i = email.length(); i < 28; i++){
                email = "" + email;
            }

            for(int i = tipoH.length(); i < 12; i++){
                tipoH = "" + tipoH;
            }         
       
            
            
             
            System.out.println(numera + " "  + nom + " "  + aP + " "  + aM + " "  + telf + " "  + email + " "  + tipoH);
            
            System.out.println("==============================================================================");
            model.addRow(new Object[]{numera, nom, aP, aM, dni, telf, email, tipoH});    
            
       
            
            aux = aux.sig;  
            
        }    
    }    
    
    void a (String numera, String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String telefono, String email, String tipoDeHabitacion){
        model.addRow(new Object[]{numera, nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion});    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonOrdenarClientes = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxModoDeOrden = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHuespedesHospedados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        jButtonOrdenarClientes.setBackground(new java.awt.Color(255, 153, 0));
        jButtonOrdenarClientes.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButtonOrdenarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrdenarClientes.setText("Ordenar");
        jButtonOrdenarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonOrdenarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 153, 0));
        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Húespedes:");
        jLabel10.setOpaque(true);
        jLabel10.setRequestFocusEnabled(false);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        jComboBoxModoDeOrden.setBackground(new java.awt.Color(255, 153, 0));
        jComboBoxModoDeOrden.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jComboBoxModoDeOrden.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxModoDeOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre(s)", "Apellido paterno", "Apellido materno" }));
        jPanel1.add(jComboBoxModoDeOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 135, -1));

        jTableHuespedesHospedados.setBackground(new java.awt.Color(255, 255, 255));
        jTableHuespedesHospedados.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTableHuespedesHospedados.setForeground(new java.awt.Color(51, 51, 51));
        jTableHuespedesHospedados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableHuespedesHospedados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableHuespedesHospedados.setInheritsPopupMenu(true);
        jTableHuespedesHospedados.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane3.setViewportView(jTableHuespedesHospedados);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1030, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoDashboard.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOrdenarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarClientesActionPerformed
        a("aea", "", "", "", "", "", "", "");
       
        long start = System.currentTimeMillis();
        
        switch(jComboBoxModoDeOrden.getSelectedItem().toString()){
            case "Nombre(s)":
//            Ordenar("Nombre");
            long endN = System.currentTimeMillis();
            double totalN = (double) (endN - start) / 1000;
            JOptionPane.showMessageDialog(this, "Los clientes han sido ordenados por sus nombres. Tiempo transcurrido: " + totalN + " segundos.", "Ordenado", JOptionPane.INFORMATION_MESSAGE);
            break;
            case "Apellido paterno":
//            Ordenar("Apellido paterno");
            long endAp = System.currentTimeMillis();
            double totalAp = (double) (endAp - start) / 1000;
            JOptionPane.showMessageDialog(this, "Los clientes han sido ordenados por sus apellidos paternos. Tiempo transcurrido: " + totalAp + " segundos.", "Ordenado", JOptionPane.INFORMATION_MESSAGE);
            break;
            case "Apellido materno":
//            Ordenar("Apellido materno");
            long endAm = System.currentTimeMillis();
            double totalAm = (double) (endAm - start) / 1000;
            JOptionPane.showMessageDialog(this, "Los clientes han sido ordenados por sus apellidos maternos. Tiempo transcurrido: " + totalAm + " segundos.", "Ordenado", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }//GEN-LAST:event_jButtonOrdenarClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOrdenarClientes;
    private javax.swing.JComboBox<String> jComboBoxModoDeOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableHuespedesHospedados;
    // End of variables declaration//GEN-END:variables
}
