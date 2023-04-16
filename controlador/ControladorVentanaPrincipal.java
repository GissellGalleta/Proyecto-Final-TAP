package controlador;
import modelo.ModeloGrupo;
import vista.*;
import modelo.ModeloEspecialidad;
import modelo.ModeloAlumno;
import modelo.ModeloCatedratico;
import modelo.ModeloMateria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVentanaPrincipal implements ActionListener {


    private final VentanaPrincipal ventanaPrincipal;

    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaPrincipal.btnImprimir.addActionListener(this);
        this.ventanaPrincipal.btnAceptar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ventanaPrincipal.btnImprimir) {
            String opcion = ventanaPrincipal.cbxAltas.getSelectedItem().toString();
            if(opcion.equals("Alta Catedratico")) {
                new ImprimirCatedratico();
            }if(opcion.equals("Alta Alumno")) {
                new ImprimirAlumno();
            }if(opcion.equals("Alta Grupo")) {
                new ImprimirGrupo();
            }
            if(opcion.equals("Alta Materia")) {
                new ImprimirMateria();
            }
        } else {
            String opcion = ventanaPrincipal.cbxAltas.getSelectedItem().toString();
            if (opcion.equals("Alta Alumno")) {
                //new VentanaAlumno();
                //new ControladorAlumno();
                VentanaAlumno v2=new VentanaAlumno();
                ModeloAlumno m1=new ModeloAlumno();
                ControladorAlumno c2=new ControladorAlumno(m1,v2);
            }else if(opcion.equals("Alta Catedratico")) {
                VentanaCatedratico vc=new VentanaCatedratico();
                ModeloCatedratico mc=new ModeloCatedratico();
                ControladorCatedratico cc=new ControladorCatedratico(mc,vc);
            }else if (opcion.equals("Alta Especialidad")) {
                VentanaEspecialidad ve = new VentanaEspecialidad();
                ModeloEspecialidad me = new ModeloEspecialidad();
                ControladorEspecialidad ce = new ControladorEspecialidad(me, ve);
            }else if (opcion.equals("Alta Grupo")) {
                VentanaGrupo vg = new VentanaGrupo();
                ModeloGrupo mg = new ModeloGrupo();
                ControladorGrupo cg = new ControladorGrupo(mg, vg);
            }else if  (opcion.equals("Alta Materia")) {
                VentanaMateria vm = new VentanaMateria();
                ModeloMateria mm = new ModeloMateria();
                ControladorMateria cg = new ControladorMateria(mm, vm);
            }

            }
        }

    }

//correccion