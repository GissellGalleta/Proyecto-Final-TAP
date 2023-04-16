package modelo;


public class ModeloGrupo {
    public static String hora;
    public static int clave, salon;
    public static ModeloAlumno modeloAlumno;
    public static ModeloMateria modeloMateria;
    public static ModeloCatedratico modeloCatedratico;
    public ModeloGrupo() {
    }

    public ModeloGrupo(int clave, String hora, int salon,ModeloAlumno modeloAlumno,
                       ModeloMateria modeloMateria,ModeloCatedratico modeloCatedratico ) {
        this.clave = clave;
        this.hora = hora;
        this.salon = salon;
        this.modeloAlumno=modeloAlumno;
        this.modeloMateria=modeloMateria;
        this.modeloCatedratico=modeloCatedratico;
    }


    public static int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public static String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public static int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public static ModeloAlumno getModeloAlumno() {
        return modeloAlumno;
    }

    public static void setModeloAlumno(ModeloAlumno modeloAlumno) {
        ModeloGrupo.modeloAlumno = modeloAlumno;
    }

    public static ModeloCatedratico getModeloCatedratico() {
        return modeloCatedratico;
    }

    public static void setModeloCatedratico(ModeloCatedratico modeloCatedratico) {
        ModeloGrupo.modeloCatedratico = modeloCatedratico;
    }

    public static ModeloMateria getModeloMateria() {
        return modeloMateria;
    }

    public static void setModeloMateria(ModeloMateria modeloMateria) {
        ModeloGrupo.modeloMateria = modeloMateria;
    }

    @Override
    public String toString() {
        return "ModeloGrupo{" +
                "Clave='" + clave + '\'' +
                ", Hora=" + hora +
                ", Salon=" + salon +
                '}';
    }

    public void imprimir(){
        System.out.println(toString());
    }

}