package controlador;


import arreglos.Arreglos;
import modelo.ModeloMateria;
import vista.VentanaMateria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMateria implements ActionListener {

    private final ModeloMateria modeloMateria;
    private final VentanaMateria visionMateria;

    public ControladorMateria(ModeloMateria modeloMateria, VentanaMateria visionMateria) {
        this.modeloMateria = modeloMateria;
        this.visionMateria = visionMateria;
        this.visionMateria.btnGuardar.addActionListener(this);
        this.visionMateria.btnSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadena=visionMateria.jtxID.getText();
        String nomb=visionMateria.jtxNombre.getText();
        int id=0;
        boolean err=true;

        if (nomb.length()>0&cadena.length()==0){
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;
        } else if (nomb.length()==0&cadena.length()>0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;
        }
        if (cadena.length()==0&nomb.length()==0){
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;

        } else if (cadena.length()>0&nomb.length()>0) {
            try {
                id = Integer.parseInt(visionMateria.jtxID.getText());
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null,
                        "Se ingreso una letra en el ID",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                err = false;
            }
        }
        if (err==true) {
            if (visionMateria.btnGuardar == e.getSource()) {
                System.out.println("Materia: " + nomb
                        + "\n ID:" + id
                        + "\n ----------------------------------");
                Arreglos.materia.add(new ModeloMateria(id,
                        nomb
                ));

                JOptionPane.showMessageDialog(null,
                        "Materia registrada con EXITO!",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                clear();
            } else if (visionMateria.btnSalir == e.getSource()) {
                Salir();
            }
        }
    }

    public void clear () {
        visionMateria.jtxID.setText("");
        visionMateria.jtxNombre.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}
// modificacion

