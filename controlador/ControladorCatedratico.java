package controlador;

import arreglos.Arreglos;
import modelo.ModeloCatedratico;
import vista.VentanaCatedratico;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCatedratico implements ActionListener {

    private final ModeloCatedratico modeloCatedratico;
    private final VentanaCatedratico vistaCatedratico;

    public ControladorCatedratico(ModeloCatedratico modeloCatedratico, VentanaCatedratico vistaCatedratico) {
        this.modeloCatedratico = modeloCatedratico;
        this.vistaCatedratico = vistaCatedratico;

        this.vistaCatedratico.btnGuardar.addActionListener(this);
        this.vistaCatedratico.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        String nom = vistaCatedratico.jtxNombre.getText();
        String rfc = vistaCatedratico.jtxRFC.getText();
        boolean err = true;
        if (rfc.length() > 0&nom.length()>0) {

        } else if (rfc.length() == 0&nom.length()==0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;
        }

        if (rfc.length() > 0) {

        } else if (rfc.length() == 0&nom.length()>0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;
        }
        if (nom.length() > 0) {

        } else if (nom.length() == 0&rfc.length()>0) {
            JOptionPane.showMessageDialog(null,
                    "Faltan Datos",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            err = false;
        }

        if (err == true) {
            if (vistaCatedratico.btnGuardar == e.getSource()) { // quite Integer.parseInt --------v
                System.out.println("Nombre: " + nom
                        + " \nRFC:" + rfc
                        + "\n ----------------------------------");

                Arreglos.catedratico.add(new ModeloCatedratico(
                        rfc,
                        nom
                ));
                JOptionPane.showMessageDialog(null,
                        "Catedratico registrado con EXITO!",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
                clear();

            } else if (vistaCatedratico.btnSalir == e.getSource()) {
                Salir();
            }
        }
    }
    public void clear () {
        vistaCatedratico.jtxNombre.setText("");
        vistaCatedratico.jtxRFC.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}