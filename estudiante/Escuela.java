package estudiante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Escuela {
    Set<Estudiante> estudiantes;

    public Escuela() {
        this.estudiantes = new HashSet<>();
    }

    /*public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    */

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante");
         String nombre = sc.nextLine();
        System.out.println("Ingresa el numero de identificación del estudiante");
         int numeroIdentificacion = sc.nextInt();
        System.out.println("Ingresa la calificación del estudiante");
         double calificacion = sc.nextDouble();

        Estudiante estudiante = new Estudiante(nombre,numeroIdentificacion,calificacion);
        boolean estaRegistrado = false;

        for(Estudiante alumno:estudiantes){
            if(alumno.getNumeroIdentificacion() == numeroIdentificacion){

                estaRegistrado = true;
                System.out.println("El numero de identificación ya se encuentra registrado");
            }
        }
        if(!estaRegistrado){
            estudiantes.add(estudiante);
        }

    }

    public void buscarEstudiante(int identificacion){
        boolean estaEstudiante = false;
        for(Estudiante alumno:estudiantes){
            if(alumno.getNumeroIdentificacion() == identificacion){
                estaEstudiante = true;
                System.out.println("El estudiante es: " + alumno.getNombre() + "\nel numero de identificación es:" + alumno.getNumeroIdentificacion() + "\ny su calificacion es:" + alumno.getCalificacion() );
            }else{
                estaEstudiante = false;
            }
        }
        if(!estaEstudiante){
            System.out.println("El estudiante no se encuentra");
        }

    }

    public void eliminarEstudiante(int identificacion){

        for(Estudiante alumno:estudiantes){
            if(alumno.getNumeroIdentificacion() == identificacion){
                estudiantes.remove(alumno);
                System.out.println("El estudiante ha sido eliminado");
            }
        }

    }

    public void actualizarEstudiante(int identificacion,String nuevoNombre, double nuevaCalificacion){

        for(Estudiante alumno:estudiantes){
            if(alumno.getNumeroIdentificacion() == identificacion){
                estudiantes.remove(alumno);
                
                estudiantes.add(alumno);
                System.out.println("El estudiante ha sido actualizado");
            }
        }

    }













}
