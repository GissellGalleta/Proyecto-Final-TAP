package vista;

import javax.swing.*;

public class VentanaMateria extends JFrame {
    private JPanel panel1;
    private JPanel panelNorte;
    private JPanel panelSur;
    public JPanel panelCentro;
    public
    JTextField jtxNombre;
    public JButton btnGuardar;
    public
    JButton btnSalir;
    public
    JTextField jtxID;
    public JLabel lblMateria;
    public JLabel lblID;

    public VentanaMateria(){
        setTitle("Alta Materia");
        setContentPane(panel1);
        setSize(500,140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
