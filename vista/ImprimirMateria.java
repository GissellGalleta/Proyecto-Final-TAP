package vista;
import arreglos.Arreglos;
import modelo.ModeloMateria;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ImprimirMateria extends JFrame{
    private JPanel panel1;
    private JTable table1;
    public ImprimirMateria() {
        super("Materia");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);


        DefaultTableModel dtm = new DefaultTableModel(
                Arreglos.materia.stream()
                        .map(materia -> new Object[]{
                                ModeloMateria.getNombre(),
                                ModeloMateria.getId()
                        }).toArray(Object[][]::new),
                new Object[]{"Materia", "ID"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(dtm);
        setVisible(true);
    }
}