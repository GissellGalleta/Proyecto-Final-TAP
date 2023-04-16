package vista;
import arreglos.Arreglos;
import modelo.ModeloCatedratico;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ImprimirCatedratico extends JFrame {
    private JPanel panel1;
    private JTable TablaCate;

    public ImprimirCatedratico() {
        super("Catedraticos");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);


        DefaultTableModel dtm = new DefaultTableModel(
                Arreglos.catedratico.stream()
                        .map(catedratico -> new Object[]{
                                ModeloCatedratico.getRFC(),
                                ModeloCatedratico.getNombre()
                        }).toArray(Object[][]::new),
                new Object[]{"RFC", "Nombre"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TablaCate.setModel(dtm);
        setVisible(true);
    }
}
