
package Registro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import utils.Lista;
import utils.Nodo2;
import utils.Ordenamiento;
import utils.UtilsCriterioOrdenamiento;

/**
 *
 * @author PC
 */
public class menu extends JFrame implements ActionListener {

    private JTextField txtNombre, txtID, txtCalle;
    private JRadioButton rdBtnNombre, rdBtnID, rdBtnCalle;
    private ButtonGroup grupoRdBtn;
    private JButton btnAñadir, btnConsultar, btnLimpiar;
    private JDialog modalResultados;

    private Lista<Usuario> lista = new Lista<>();
    private int criterioAux = UtilsCriterioOrdenamiento.POR_NOMBRE; // Default

    public menu() {
        super("Registro de Sucursales");
        hazInterfaz();
        hazEscuchas();
    }

    private void hazInterfaz() {
//
        // Radio Button criterio de ordenamiento
        rdBtnID = new JRadioButton("ID");
        rdBtnNombre = new JRadioButton("Nombre", true);
        rdBtnCalle = new JRadioButton("Direccion");
       

        grupoRdBtn = new ButtonGroup();
        grupoRdBtn.add(rdBtnNombre);
        grupoRdBtn.add(rdBtnID);
        grupoRdBtn.add(rdBtnCalle);
      
        JPanel panelRdBtn = new JPanel();
        panelRdBtn.setLayout(new FlowLayout());
        panelRdBtn.add(rdBtnNombre);
        panelRdBtn.add(rdBtnID);
        panelRdBtn.add(rdBtnCalle);
   
        add(panelRdBtn, BorderLayout.NORTH);


        // Formulario
        JPanel panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(0, 2, 20, 10));
        panelForm.add(new JLabel("ID  ", SwingConstants.RIGHT));
        txtID = new JTextField();
        panelForm.add(txtID);
        panelForm.add(new JLabel("Empresa  ", SwingConstants.RIGHT));
        txtNombre = new JTextField();
        panelForm.add(txtNombre);
        panelForm.add(new JLabel("Calle  ", SwingConstants.RIGHT));
        txtCalle = new JTextField();
        panelForm.add(txtCalle);
        add(panelForm, BorderLayout.CENTER);

        // Botones 
        btnAñadir = new JButton("Añadir");
        btnConsultar = new JButton("Consultar");
        btnLimpiar = new JButton("Limpiar");

        JPanel panelBtn = new JPanel();
        panelBtn.add(btnAñadir);
        panelBtn.add(btnConsultar);
        panelBtn.add(btnLimpiar);
        add(panelBtn, BorderLayout.SOUTH);
        
        // Configuración JFrame
        setSize(400, 200);
        setLocationRelativeTo(null); // Centrar
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtNombre.requestFocus();
    }

    private void hazEscuchas() {
        // RadioButton
        rdBtnNombre.addActionListener(this);
       rdBtnID.addActionListener(this);
        rdBtnCalle.addActionListener(this);
    

        // Button
        btnAñadir.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() instanceof JRadioButton) {
            JRadioButton RadioButton = (JRadioButton) evt.getSource();
            if (RadioButton == rdBtnNombre) {
                criterioAux = UtilsCriterioOrdenamiento.POR_NOMBRE;
            }
            if (RadioButton == rdBtnID) {
                criterioAux = UtilsCriterioOrdenamiento.POR_ID;
            }
            if (RadioButton == rdBtnCalle) {
                criterioAux = UtilsCriterioOrdenamiento.POR_CALLE;
            }

            Ordenamiento.ordenamientoIntercambio(lista, criterioAux);
            return;
        }

        if (evt.getSource() instanceof JButton) {
            JButton Button = (JButton) evt.getSource();
            if (Button == btnAñadir) {
                lista.InsertaOrdenado(new Usuario(txtNombre.getText(), Integer.parseInt(txtID.getText()), (txtCalle.getText()), criterioAux));
                limpiarCampos();
                return;
            }
            if (Button == btnConsultar) {
                new ModalResultados();
                return;
            }
            if (Button == btnLimpiar) {
                limpiarCampos();
                return;
            }
        }

    }

    private void limpiarCampos() {
        txtNombre.setText(null);
        txtID.setText(null);
        txtCalle.setText(null);
        txtNombre.requestFocus();
    }

    private class ModalResultados extends JDialog {

        private DefaultTableModel modeloTabla;
        private JTable tablaResultados;
        private JScrollPane scrollPane;
        private String[] nombres;
        private Integer[] ID;
        private String[] Calle;

        public ModalResultados() {
            setTitle("Tabla de Resultados");
            modeloTabla = new DefaultTableModel();
            tablaResultados = new JTable(modeloTabla);
            scrollPane = new JScrollPane(tablaResultados);

            rellenarResultados();
            add(scrollPane);

            setSize(300, 400);
            setModal(true);
            setLocationRelativeTo(null);
            setVisible(true);
        }

        private void rellenarResultados() {
            nombres = new String[lista.Length()];
            ID = new Integer[lista.Length()];
            Calle = new String[lista.Length()];

            Nodo2<Usuario> aux = lista.getFrente();
            int i = 0;
            while (aux != null) {
                nombres[i] = aux.Info.getNombre();
                ID[i] = aux.Info.getEdad();
                Calle[i] = aux.Info.getcalle();
                i++;
                aux = aux.getSig();
            }
            modeloTabla.addColumn("ID", ID);
            modeloTabla.addColumn("Nombre", nombres);
            modeloTabla.addColumn("Calle", Calle);
            
            
   
        }

    }
}
