package vista;
import arreglos.Arreglos;
import modelo.ModeloEspecialidad;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ImprimirEspecialidad extends JFrame {
    private JPanel panel1;
    private JTable tableEspecialidad;


    public ImprimirEspecialidad() {
        super("Especialidad");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);


        DefaultTableModel dtm = new DefaultTableModel(
                Arreglos.especialidad.stream()
                        .map(especialidad -> new Object[]{
                                especialidad.getNombre(),
                                especialidad.getID()
                        }).toArray(Object[][]::new),
                new Object[]{"especialidad", "ID"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableEspecialidad.setModel(dtm);
        setVisible(true);
    }
}
