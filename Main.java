import arreglos.Arreglos;
import controlador.ControladorAlumno;
import controlador.ControladorCatedratico;
import controlador.ControladorVentanaPrincipal;
import modelo.ModeloAlumno;
import vista.*;
public class Main {
    public static void main(String[] args) {
        VentanaPrincipal v1=new VentanaPrincipal();
        ControladorVentanaPrincipal c1=new ControladorVentanaPrincipal(v1);
    }
}
//MEjora