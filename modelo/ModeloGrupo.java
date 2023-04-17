package modelo;


import java.util.ArrayList;

public class ModeloGrupo {
    public String hora;
    public int clave, salon;
    public ModeloAlumno modeloAlumno;
    public ModeloMateria modeloMateria;
    public ModeloCatedratico modeloCatedratico;
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


    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

   public ModeloAlumno getModeloAlumno() {
        return modeloAlumno;
    }

    public void setModeloAlumno(ModeloAlumno modeloAlumno) {
        this.modeloAlumno = modeloAlumno;
    }

    public ModeloCatedratico getModeloCatedratico() {
        return modeloCatedratico;
    }

    public void setModeloCatedratico(ModeloCatedratico modeloCatedratico) {
        this.modeloCatedratico = modeloCatedratico;
    }

    public ModeloMateria getModeloMateria() {
        return modeloMateria;
    }

    public void setModeloMateria(ModeloMateria modeloMateria) {
        this.modeloMateria = modeloMateria;
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