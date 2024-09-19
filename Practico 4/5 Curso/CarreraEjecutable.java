
/**
 * Write a description of class Carrera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class CarreraEjecutable
{
    public static void main() {
        
       Alumno alum1 = new Alumno(123, "Matias", "Sotelo", 10, 9);
       Alumno alum2 = new Alumno(124, "Ana", "García", 8, 7);
       Alumno alum3 = new Alumno(125, "Luis", "Pérez", 9, 10);
       Alumno alum4 = new Alumno(126, "Sofia", "Martínez", 6, 8);
       Alumno alum5 = new Alumno(127, "Carlos", "Lopez", 7, 9);
       
       Curso curso = new Curso("POO");
       
       curso.inscribirAlumno(alum1);
       curso.inscribirAlumno(alum2);
       curso.inscribirAlumno(alum3);
       curso.inscribirAlumno(alum4);
       curso.inscribirAlumno(alum5);
       
       System.out.println("****--Cantidad de inscriptos:" + curso.cantidadDeAlumnos());
       curso.mostrarInscriptos();
       
       System.out.println("\n****-- Se da de baja a Pedro porque abandona el curso --****");
       curso.quitarAlumno(126);
       System.out.println("Está Sofia Martínez inscripto ?? --> " + curso.estaInscripto(126));
       curso.mostrarInscriptos();
       
       
       System.out.println("\n****-- Busca y muestra el alumno con numero de libreta 123 --****");
       
       if(curso.estaInscripto(123)) {
           curso.buscarAlumno(123).mostrar();
       }
       
       System.out.println("\n****-- Mostrar promedio del alumno 127 --****");
       curso.imprimirPromedioDelAlumno(127);
       
    }
}

