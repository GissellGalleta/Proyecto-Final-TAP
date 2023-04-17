package controlador;

import arreglos.Arreglos;
import modelo.ModeloAlumno;
import modelo.ModeloCatedratico;
import modelo.ModeloEspecialidad;
import vista.VentanaAlumno;
import vista.VentanaEspecialidad;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno implements ActionListener{
    private final ModeloAlumno modeloAlumno;
    private final VentanaAlumno visionAlumno;

    public ControladorAlumno(ModeloAlumno modeloAlumno, VentanaAlumno visionAlumno) {
        this.modeloAlumno = modeloAlumno;
        this.visionAlumno = visionAlumno;

        this.visionAlumno.btnGuardar.addActionListener(this);
        this.visionAlumno.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        if (visionAlumno.btnGuardar == e.getSource()) {
            System.out.println("Nombre: " + visionAlumno.jtxNombre.getText() +
                    " \nNúmero de Control:" + Integer.parseInt(visionAlumno.jtxNumControl.getText())
                    +"\n ----------------------------------");
            Arreglos.alumno.add(new ModeloAlumno(
                    Integer.parseInt(visionAlumno.jtxNumControl.getText()),
                    visionAlumno.jtxNombre.getText(),
                    Arreglos.especialidad.stream().filter(
                            esp -> esp.getNombre().equals(
                                    visionAlumno.listaEspecialidad.getSelectedItem()
                            )
                    ).findFirst().get()
            ));
            JOptionPane.showMessageDialog(null,
                    "Catedratico registrado con EXITO!",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
        } else if (visionAlumno.btnSalir == e.getSource()) {
            Salir();
        }
    }

    public void clear () {
        visionAlumno.jtxNombre.setText("");
        visionAlumno.jtxNumControl.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}