package estudiante;

public class MainEstudiante {

   public static void main(String[] args){
     Escuela registro = new Escuela();
     registro.agregarEstudiante();
     registro.agregarEstudiante();
     //System.out.println(registro.getEstudiantes());
     registro.buscarEstudiante(10020);

   }
}
