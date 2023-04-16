package vista;

import arreglos.Arreglos;
import modelo.ModeloAlumno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ImprimirAlumno extends JFrame{
    private JPanel panel1;
    private JTable tableAlumno;
    public ImprimirAlumno() {
        super("Alumnos");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);


        DefaultTableModel dtm = new DefaultTableModel(
                Arreglos.alumno.stream()
                        .map(alumno -> new Object[]{
                                ModeloAlumno.getNumControl(),
                                ModeloAlumno.getNombre(),
                                ModeloAlumno.getModeloEspecialidad().getID(),
                                ModeloAlumno.getModeloEspecialidad().getNombre()

                        }).toArray(Object[][]::new),
                new Object[]{"noControl", "Nombre","ID","Especialidad"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableAlumno.setModel(dtm);
        setVisible(true);
    }
}
