package controlador;

import arreglos.Arreglos;
import modelo.ModeloAlumno;
import modelo.ModeloCatedratico;
import modelo.ModeloGrupo;
import modelo.ModeloMateria;
import vista.VentanaGrupo;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class  ControladorGrupo implements ActionListener {

    private final ModeloGrupo modeloGrupo;
    private final VentanaGrupo visionGrupo;

    public ControladorGrupo(ModeloGrupo modeloGrupo, VentanaGrupo visionGrupo) {
        this.modeloGrupo = modeloGrupo;
        this.visionGrupo = visionGrupo;

        this.visionGrupo.btnGuardar.addActionListener(this);
        this.visionGrupo.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String hora=visionGrupo.jtxtHora.getText();
        String clavecad=visionGrupo.jtxtClave.getText();
        String saloncad=visionGrupo.jtxtSalon.getText();
        boolean err=true;
        int clave=0;
        int salon=0;

        if (hora.length()>0&clavecad.length()>0&saloncad.length()>0) {
            try {
                salon = Integer.parseInt(visionGrupo.jtxtSalon.getText());
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null,
                        "Se ingreso una letra en el salon",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                err = false;
            }
        } else if (hora.length()>0&clavecad.length()>0&saloncad.length()==0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err=false;
        } else if (hora.length()>0&clavecad.length()==0&saloncad.length()>0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err=false;
        } else if (hora.length()==0&clavecad.length()==0&saloncad.length()==0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err=false;
        }
        if (hora.length()>0&clavecad.length()>0&saloncad.length()>0){
            try {
                clave=Integer.parseInt(visionGrupo.jtxtClave.getText());
            }catch (Exception error){
                JOptionPane.showMessageDialog(null,
                        "Se ingreso una letra en la clave",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                err=false;
            }
        } else if (hora.length()==0&clavecad.length()>0&saloncad.length()>0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err=false;
        }

        if (err==true) {
            try {
            if (visionGrupo.btnGuardar == e.getSource()) {
                System.out.println("Clave: " + clave
                        + "\n Hora: " + hora + "\n Salon: "
                        + salon +"\n Alumno: "+
                        visionGrupo.cbxAlumno.getSelectedItem() +
                        "\nMateria: "+visionGrupo.cbxMateria.getSelectedItem() +
                        "\nCatedratico: "+visionGrupo.cbxCatedratico.getSelectedItem()
                        + "\n ----------------------------------");
                Arreglos.grupo.add(new ModeloGrupo(
                        Integer.parseInt(visionGrupo.jtxtClave.getText()),
                        visionGrupo.jtxtHora.getText(),
                        Integer.parseInt(visionGrupo.jtxtSalon.getText()),
                        Arreglos.alumno.stream().filter(
                                alum -> alum.getNombre().equals(
                                        visionGrupo.cbxAlumno.getSelectedItem()
                                )
                        ).findFirst().get(),
                        Arreglos.materia.stream().filter(
                                mat -> mat.getNombre().equals(
                                        visionGrupo.cbxMateria.getSelectedItem()
                                )
                        ).findFirst().get(),
                        Arreglos.catedratico.stream().filter(
                                cat -> cat.getNombre().equals(
                                        visionGrupo.cbxCatedratico.getSelectedItem()
                                )
                        ).findFirst().get()

                ));

                JOptionPane.showMessageDialog(null,
                        "Grupo registrado con EXITO!",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                clear();

            } else if (visionGrupo.btnSalir == e.getSource()) {
                Salir();
            }
        }catch (Exception error) {
                JOptionPane.showMessageDialog(null,
                        "Faltan Datos",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public void clear() {
        visionGrupo.jtxtClave.setText("");
        visionGrupo.jtxtHora.setText("");
        visionGrupo.jtxtSalon.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}
