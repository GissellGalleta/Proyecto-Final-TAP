package vista;

import arreglos.Arreglos;
import modelo.ModeloEspecialidad;

import javax.swing.*;

public class VentanaAlumno extends JFrame{
    private JPanel panel1;
    private JPanel panelCentro;
    private JPanel panelSur;
    private JPanel panelNorte;
    public JTextField jtxNumControl;
    public JLabel lblNumControl;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JTextField jtxNombre;
    private JLabel lblNombre;
    public JComboBox listaEspecialidad;
    private JLabel lblEspecialidad;

    public VentanaAlumno(){
        setTitle("Alta Alumno");
        setContentPane(panel1);
        setSize(500,200);
        setLocationRelativeTo(null);
        //System.out.println(Arreglos.especialidad.size());
        listaEspecialidad.removeAllItems();
        for(ModeloEspecialidad e: Arreglos.especialidad) {
            listaEspecialidad.addItem(e.getNombre());
        }
        //this.repaint();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
