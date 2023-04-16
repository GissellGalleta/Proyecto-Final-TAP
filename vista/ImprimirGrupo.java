package vista;

import arreglos.Arreglos;
import modelo.ModeloGrupo;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class ImprimirGrupo extends JFrame {
    private JPanel panel1;
    private JTable TablaGrup;

    public ImprimirGrupo() {
        super("Grupos");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);


        DefaultTableModel dtm = new DefaultTableModel(
                Arreglos.grupo.stream()
                        .map( grupo -> new Object[]{
                                ModeloGrupo.getClave(),
                                ModeloGrupo.getHora(),
                                ModeloGrupo.getSalon()
                        }).toArray(Object[][]::new),
                new Object[]{"Clave", "Hora", "Salon"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TablaGrup.setModel(dtm);
        setVisible(true);
    }


}
