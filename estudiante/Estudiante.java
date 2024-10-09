package estudiante;

public class Estudiante {

    private String nombre;
    private int numeroIdentificacion;
    private double calificacion;


    public Estudiante() {

    }
    public Estudiante(String nombre, int numeroIdentificacion, double calificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


}
