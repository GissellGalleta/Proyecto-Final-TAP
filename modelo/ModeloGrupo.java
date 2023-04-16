package modelo;


public class ModeloGrupo {
    public static String hora;
    public static int clave, salon;
    public ModeloGrupo() {
    }

    public ModeloGrupo(int clave, String hora, int salon) {
        this.clave = clave;
        this.hora = hora;
        this.salon = salon;
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