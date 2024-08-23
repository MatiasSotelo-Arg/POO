
/**
 * Write a description of class EmpleadoEjecutable here.
 * 
 * @author (Sotelo Matias) 
 * @version (22/08/2024)
 */

import java.util.Scanner;

public class EmpleadoEjecutable
{
    public static void main() 
    {
        /* CASOS DE PRUEBA HARDCODEADOS
        //1 año antiguedad
        Empleado emp1  = new Empleado(41, "Pucheta", "Nico", 10000, 2023);
        
        //5 años antiguedad
        Empleado emp2  = new Empleado(42, "Sotelo", "Matias", 10000, 2019);  
        
        //10 años antiguedad
        Empleado emp3  = new Empleado(43, "Vera", "Mora", 10000, 2014);
        
        emp1.mostrar();
        emp2.mostrar();
        emp3.mostrar();
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese cuil: ");
        long cuil = scanner.nextLong();
        scanner.nextLine(); 
        
        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese sueldo basico: ");
        int sueldoBasico = scanner.nextInt();
        
        System.out.println("Ingrese año ingreso: ");
        int anioIngreso = scanner.nextInt(); 
       
        //Instanciando Objeto
        Empleado emp1  = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        
        emp1.mostrar();
        
        System.out.println(emp1.mostrarLinea());
    }
}
