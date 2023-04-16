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
        if (vistaEspecialidad.btnGuardar == e.getSource()) {
            System.out.println("Nombre: " + vistaEspecialidad.jtxNombre.getText() + " ID :"+ Integer.parseInt (vistaEspecialidad.jtxID.getText()));
            Arreglos.especialidad.add(new ModeloEspecialidad(
                    Integer.parseInt (vistaEspecialidad.jtxID.getText()),
                    vistaEspecialidad.jtxNombre.getText()
            ));
            JOptionPane.showMessageDialog(null,
                    "Especialidad registrado con EXITO!",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
        } else if (vistaEspecialidad.btnSalir == e.getSource()) {
            Salir();
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



