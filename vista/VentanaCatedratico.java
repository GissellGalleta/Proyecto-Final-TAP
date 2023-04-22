package vista;

import javax.swing.*;

public class VentanaCatedratico extends JFrame{
    public JPanel panel1;
    public JPanel panelCentro;
    public JPanel panelSur;
    public JPanel panelNorte;
    public JTextField jtxRFC;
    public JLabel lblRFC;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JTextField jtxNombre;
    private JLabel lblNombre;

    public VentanaCatedratico(){
        setTitle("Alta Catedratico");
        setContentPane(panel1);
        setSize(500,140);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
   // void createUIComponents(){

    //}
}
