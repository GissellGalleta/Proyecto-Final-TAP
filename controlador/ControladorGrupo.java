package controlador;

import arreglos.Arreglos;
import modelo.ModeloGrupo;
import vista.VentanaGrupo;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class  ControladorGrupo implements ActionListener {

    private final ModeloGrupo modeloGrupo;
    private final VentanaGrupo visionGrupo;

    public ControladorGrupo(ModeloGrupo modeloGrupo, VentanaGrupo visionGrupo) {
        this.modeloGrupo =modeloGrupo;
        this.visionGrupo =visionGrupo;

        this.visionGrupo.btnGuardar.addActionListener(this);
        this.visionGrupo.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (visionGrupo.btnGuardar == e.getSource()) {
            System.out.println("Clave: " + Integer.parseInt(visionGrupo.jtxtClave.getText())
                    + " Hora: " + visionGrupo.jtxtHora.getText() + " Salon: "
                    + Integer.parseInt(visionGrupo.jtxtSalon.getText()));
            Arreglos.grupo.add(new ModeloGrupo(
                    Integer.parseInt(visionGrupo.jtxtClave.getText()),
                    visionGrupo.jtxtHora.getText(),
                    Integer.parseInt(visionGrupo.jtxtSalon.getText())

            ));


            JOptionPane.showMessageDialog(null,
                    "Registro Guardado!",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();

        } else if (visionGrupo.btnSalir == e.getSource()) {
            Salir();
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