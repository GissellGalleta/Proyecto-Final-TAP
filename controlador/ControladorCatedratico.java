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
    public void actionPerformed (ActionEvent e){
        if (vistaCatedratico.btnGuardar == e.getSource()) { // quite Integer.parseInt --------v
            System.out.println("Nombre: " + vistaCatedratico.jtxNombre.getText()
                    + " \nRFC:" + (vistaCatedratico.jtxRFC.getText())
                    +"\n ----------------------------------");
            Arreglos.catedratico.add(new ModeloCatedratico(
                    vistaCatedratico.jtxRFC.getText(),
                    vistaCatedratico.jtxNombre.getText()
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

    public void clear () {
        vistaCatedratico.jtxNombre.setText("");
        vistaCatedratico.jtxRFC.setText("");
    }

    public void Salir () {
        System.exit(0);
    }
}