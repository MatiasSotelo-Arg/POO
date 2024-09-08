
/**
 * 
 * 
 * @author (Sotelo Matias) 
 * @version (08/09/2024)
 */

import java.util.*;

public class EmpleadoEjecutable
{
    public static void main() 
    {
       //Fecha de ingreso
       Calendar ingreso = Calendar.getInstance();
       //MES y DIA debe ser igual a la fecha actual para que sea el aniversario
       ingreso.set(2022,Calendar.SEPTEMBER,8);  
       
       //Teclado   
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Nuevo Empleado\nCuil: ");
       int cuil = teclado.nextInt();
       teclado.nextLine();
       
       System.out.println("Nombre: ");
       String nombre = teclado.nextLine();
       
       System.out.println("Apellido: ");
       String apellido = teclado.nextLine();
       
       System.out.println("Sueldo Basico: ");
       double sueldoBasico = teclado.nextDouble();
       
       //Instancia Empleado
       Empleado empleado = new Empleado(cuil,nombre,apellido,sueldoBasico,ingreso);
       
       if(empleado.esAniversario())
       {
           System.out.println("Es aniversario");
           System.out.println("Se puede ir " + empleado.antiguedad() + " hs antes");  
       } else 
       {
           System.out.println("No es aniversario");
       }
       
            
    }
}
