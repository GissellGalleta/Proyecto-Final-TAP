package vista;

import arreglos.Arreglos;
import modelo.ModeloAlumno;
import modelo.ModeloCatedratico;
import modelo.ModeloMateria;

import javax.swing.*;

public class VentanaGrupo extends JFrame {
    private JPanel panel1;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JLabel lblClave;
    public JTextField jtxtClave;
    public JLabel lblHora;
    public JTextField jtxtHora;
    public JLabel lblSalon;
    public JTextField jtxtSalon;
    public JComboBox cbxCatedratico;
    public JComboBox cbxMateria;
    public JComboBox cbxAlumno;
    private JLabel lblCatedratico;
    private JLabel lblAlumno;
    private JLabel lblMateria;

    public VentanaGrupo(){
        setTitle("Alta Grupo");
        setContentPane(panel1);
        setSize(500, 200);
        setLocationRelativeTo(null);
        cbxAlumno.removeAllItems();
        for(ModeloAlumno e: Arreglos.alumno) {
            cbxAlumno.addItem(e.getNombre());
        }
        cbxMateria.removeAllItems();
        for(ModeloMateria e: Arreglos.materia) {
            cbxMateria.addItem(e.getNombre());
        }
        cbxCatedratico.removeAllItems();
        for(ModeloCatedratico e: Arreglos.catedratico) {
            cbxCatedratico.addItem(e.getNombre());
        }
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
