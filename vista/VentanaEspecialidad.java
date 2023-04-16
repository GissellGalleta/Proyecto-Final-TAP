package vista;

import javax.swing.*;

public class VentanaEspecialidad extends JFrame{
    private JPanel panel1;
    private JPanel panelCentro;
    private JPanel panelSur;
    private JPanel panelNorte;
    public JTextField jtxID;
    public JLabel lblID;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JTextField jtxNombre;
    private JLabel lblNombre;

    public VentanaEspecialidad(){
        setTitle("Alta Especialidad");
        setContentPane(panel1);
        setSize(500,140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //*//
    }
}