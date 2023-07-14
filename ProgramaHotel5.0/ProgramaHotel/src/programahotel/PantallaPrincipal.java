package programahotel;

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

public class PantallaPrincipal extends javax.swing.JFrame {
        
    
    
    public PantallaPrincipal() {
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
       
        
        this.setLocationRelativeTo(null); 
        
        
        
        new CambiaPanel(PanelPrincipal, new paneles.PanelDashboard());
       
        
        
 
   
        
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
        PanelPrincipal = new javax.swing.JPanel();

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
        getContentPane().add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 70));

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
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 30, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programahotel/BarraSuperior.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1090, 100));

        PanelPrincipal.setBackground(new java.awt.Color(255, 51, 51));
        PanelPrincipal.setLayout(new javax.swing.BoxLayout(PanelPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 1090, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelSalirMouseClicked

    Color colorNoSeleccionado = new Color(255, 204, 51);
    Color colorSeleccionado = new Color(255, 194, 0);
    
    private void jPanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDashboardMouseClicked
        new CambiaPanel(PanelPrincipal, new paneles.PanelDashboard());
    }//GEN-LAST:event_jPanelDashboardMouseClicked

    private void jPanelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRegistroMouseClicked
        new CambiaPanel(PanelPrincipal, new paneles.PanelRegistro());
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
     
        
    }//GEN-LAST:event_jPanelBuscarMouseClicked

    private void jPanelBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuscarMouseMoved
        jPanelBuscar.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelBuscarMouseMoved

    private void jPanelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBuscarMouseExited
        jPanelBuscar.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelBuscarMouseExited

    private void jPanelOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdenarMouseClicked
        
        
        new menu();
    }//GEN-LAST:event_jPanelOrdenarMouseClicked

    private void jPanelOrdenarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdenarMouseMoved
        jPanelOrdenar.setBackground(colorSeleccionado);
    }//GEN-LAST:event_jPanelOrdenarMouseMoved

    private void jPanelOrdenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelOrdenarMouseExited
        jPanelOrdenar.setBackground(colorNoSeleccionado);
    }//GEN-LAST:event_jPanelOrdenarMouseExited

    private void jPanelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEliminarMouseClicked
        
        
        
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

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelEliminar;
    private javax.swing.JPanel jPanelOrdenar;
    private javax.swing.JPanel jPanelRegistro;
    // End of variables declaration//GEN-END:variables
}
