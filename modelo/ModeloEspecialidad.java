package modelo;

public class ModeloEspecialidad{
    public static int ID;
    public static String nombre;

    public ModeloEspecialidad(){}

    public ModeloEspecialidad(int ID, String nombre){
        this.ID=ID;
        this.nombre=nombre;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public static int getID() {
        return ID;
    }

    public void setID(int ID ) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Modelo Especialidad{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public void imprmir(){
        System.out.println(toString());

    }
}