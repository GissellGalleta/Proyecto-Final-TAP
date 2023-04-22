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
        String cadena=visionAlumno.jtxNumControl.getText();
        int noControl = 0;
        boolean err = true;
        String nombre=visionAlumno.jtxNombre.getText();

        if (nombre.length()>0){

        } else if (nombre.length()==0&cadena.length()>0&Arreglos.especialidad.size()>0) {
                JOptionPane.showMessageDialog(null,
                        "Faltan Datos",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                err = false;
         }
        if (cadena.length()==0&nombre.length()==0){
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;
        } else if (cadena.length()>0&nombre.length()>0) {
            try {
                noControl = Integer.parseInt(visionAlumno.jtxNumControl.getText());
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null,
                        "Se ingreso una letra en el noControl",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                err = false;
            }
        }
        if (err==true) {
            try {
                if (visionAlumno.btnGuardar == e.getSource()) {
                    System.out.println("Nombre: " + nombre +
                            " \nNúmero de Control:" + noControl+
                            "\n Especialidad: " + visionAlumno.listaEspecialidad.getSelectedItem()
                            + "\n ----------------------------------");

                    Arreglos.alumno.add(new ModeloAlumno(noControl,
                            nombre,
                            Arreglos.especialidad.stream().filter(
                                    esp -> esp.getNombre().equals(
                                            visionAlumno.listaEspecialidad.getSelectedItem()
                                    )
                            ).findFirst().get()
                    ));
                    JOptionPane.showMessageDialog(null,
                            "Alumno registrado con EXITO!",
                            "AVISO",
                            JOptionPane.INFORMATION_MESSAGE);
                    clear();
                } else if (visionAlumno.btnSalir == e.getSource()) {
                    Salir();
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null,
                        "Faltan Datos",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
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