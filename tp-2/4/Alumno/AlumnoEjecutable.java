/**
 *  La clase AlumnoEjecutable recibe los datos como argumentos
 *  del metodo main, e instancia el objeto alumno.
 * 
 *  @author (Sotelo Matias) 
 *  @version (25/08/2024)
 */
public class AlumnoEjecutable
{
    public static void main(String [] args)
    {    
        //Cast de los valores para atributos 
        int lu = Integer.valueOf(args[0]);
        String nombre = String.valueOf(args[1]);
        String apellido = String.valueOf(args[2]);
        double nota1 = Double.valueOf(args[3]);
        double nota2 = Double.valueOf(args[4]);
        
        //Instancia objeto Alumno
        Alumno alumno1 = new Alumno(lu,nombre,apellido,nota1,nota2);
        alumno1.mostrar();   
    }
}