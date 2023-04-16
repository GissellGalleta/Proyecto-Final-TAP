package modelo;

public class ModeloAlumno {
    private static int numControl;
    private static String nombre;
    private static ModeloEspecialidad modeloEspecialidad;

    public ModeloAlumno() {
    }


    public ModeloAlumno(int numControl, String nombre, ModeloEspecialidad modeloEspecialidad) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.modeloEspecialidad = modeloEspecialidad;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public static ModeloEspecialidad getModeloEspecialidad() {
        return modeloEspecialidad;
    }

    public void setModeloEspecialidad(ModeloEspecialidad modeloEspecialidad) {
        this.modeloEspecialidad = modeloEspecialidad;
    }

    @Override
    public String toString() {
        return "ModeloAlumno{" +
                "numControl=" + numControl +
                ", nombre='" + nombre + '\'' +
                ", Especialidad=" + modeloEspecialidad +
                '}';
    }

    public void imprmir() {
        System.out.println(toString());
    }
}