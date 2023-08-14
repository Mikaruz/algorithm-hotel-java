package paneles;

import javax.swing.JOptionPane;
import Algoritmos.InsertarNodo;

        
public class PanelRegistro extends javax.swing.JPanel {
    
    PanelDashboard dashboard = new PanelDashboard();
    InsertarNodo insertar = new InsertarNodo();


    public PanelRegistro() {
        initComponents();
        
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxTipoDeHabitacion = new javax.swing.JComboBox<>();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldApellidoMaterno = new javax.swing.JTextField();
        jTextFieldApellidoPaterno = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRecibo = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jButtonAñadirHuesped = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Registro:");
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, -1));

        jLabel14.setBackground(new java.awt.Color(255, 153, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Nombre(s):");
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 40));

        jLabel15.setBackground(new java.awt.Color(255, 153, 0));
        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Apellido paterno:");
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 40));

        jLabel16.setBackground(new java.awt.Color(255, 153, 0));
        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" Apellido materno:");
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 40));

        jLabel17.setBackground(new java.awt.Color(255, 153, 0));
        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" DNI:");
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, 40));

        jLabel19.setBackground(new java.awt.Color(255, 153, 0));
        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Teléfono:");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 90, 40));

        jLabel18.setBackground(new java.awt.Color(255, 153, 0));
        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" E-mail:");
        jLabel18.setOpaque(true);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 70, 40));

        jLabel20.setBackground(new java.awt.Color(255, 153, 0));
        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Tipo de habitación:");
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 160, 40));

        jComboBoxTipoDeHabitacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBoxTipoDeHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Familiar", "Matrimonial" }));
        jPanel1.add(jComboBoxTipoDeHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 161, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 161, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 161, -1));

        jTextFieldDni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 161, -1));

        jTextFieldApellidoMaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 161, -1));

        jTextFieldApellidoPaterno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 161, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 161, -1));

        jTextAreaRecibo.setEditable(false);
        jTextAreaRecibo.setColumns(20);
        jTextAreaRecibo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextAreaRecibo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRecibo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 459, 180));

        jLabel12.setBackground(new java.awt.Color(255, 153, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Recibo:");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 90, -1));

        jButtonAñadirHuesped.setBackground(new java.awt.Color(255, 153, 51));
        jButtonAñadirHuesped.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButtonAñadirHuesped.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAñadirHuesped.setText("Añadir");
        jButtonAñadirHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirHuespedActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAñadirHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoRegistro.jpg"))); // NOI18N
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
       
        dashboard.ini = dashboard.InsertarNodo1(dashboard.ini, nombre, apellidoPaterno, apellidoMaterno, dni, telefono, email, tipoDeHabitacion);
        
        LimpiarEntradasRegistro();
        dashboard.LimpiarTabla();
        dashboard.InsertarDatos();
    }//GEN-LAST:event_jButtonAñadirHuespedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirHuesped;
    private javax.swing.JComboBox<String> jComboBoxTipoDeHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaRecibo;
    private javax.swing.JTextField jTextFieldApellidoMaterno;
    private javax.swing.JTextField jTextFieldApellidoPaterno;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
