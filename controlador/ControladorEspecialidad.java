package controlador;

import arreglos.Arreglos;
import modelo.ModeloEspecialidad;
import vista.VentanaEspecialidad;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControladorEspecialidad implements ActionListener {
    private final ModeloEspecialidad modeloEspecialidad;
    private final VentanaEspecialidad vistaEspecialidad;

    public ControladorEspecialidad(ModeloEspecialidad modeloEspecialidad, VentanaEspecialidad vistaEspecialidad) {
        this.modeloEspecialidad = modeloEspecialidad;
        this.vistaEspecialidad = vistaEspecialidad;

        this.vistaEspecialidad.btnGuardar.addActionListener(this);
        this.vistaEspecialidad.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        String cadena=vistaEspecialidad.jtxID.getText();
        String nomb=vistaEspecialidad.jtxNombre.getText();
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
                id = Integer.parseInt(vistaEspecialidad.jtxID.getText());
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null,
                        "Se ingreso una letra en el ID",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                err = false;
            }
        }
        if (err==true) {
            if (vistaEspecialidad.btnGuardar == e.getSource()) {
                System.out.println("Nombre: " + nomb
                        + "\n ID :" + id
                        + "\n ----------------------------------");
                Arreglos.especialidad.add(new ModeloEspecialidad(
                        id,
                        nomb
                ));
                JOptionPane.showMessageDialog(null,
                        "Especialidad registrada con EXITO!",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                clear();
            } else if (vistaEspecialidad.btnSalir == e.getSource()) {
                Salir();
            }
        }
    }


    public void clear () {
        vistaEspecialidad.jtxNombre.setText("");
        vistaEspecialidad.jtxID.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}



