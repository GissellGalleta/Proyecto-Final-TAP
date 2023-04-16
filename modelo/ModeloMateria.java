package modelo;

public class ModeloMateria {

    private static int id;
    private static String nombre;

    public ModeloMateria() {
    }

    public ModeloMateria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre='" + nombre + '\'' +'}';
    }

    public void imprimir(){
        System.out.println(toString());
    }
}