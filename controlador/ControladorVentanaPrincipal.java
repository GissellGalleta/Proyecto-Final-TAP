package controlador;

import modelo.ModeloAlumno;
import vista.VentanaAlumno;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVentanaPrincipal implements ActionListener {

    private final VentanaPrincipal ventanaPrincipal;

    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal=ventanaPrincipal;

        this.ventanaPrincipal.btnAceptar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion = ventanaPrincipal.cbxAltas.getSelectedItem().toString();
        if (opcion.equals("Alta Alumno")){
            //new VentanaAlumno();
            //new ControladorAlumno();
            VentanaAlumno v2=new VentanaAlumno();
            ModeloAlumno m1=new ModeloAlumno();
            ControladorAlumno c2=new ControladorAlumno(m1,v2);

        }
    }
}