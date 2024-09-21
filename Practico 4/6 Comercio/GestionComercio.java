
/**
 * Write a description of class GestionComercio here.
 * 
 * @author (Sotelo Matias) 
 * @version (21/09/2024)
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GestionComercio
{
    static void main() 
    {
        // Nuevo Comercio
        Comercio comercio = new Comercio("Comercio");
        
        // Empleados
        Empleado empleado1 = new Empleado(20304050607L, "Emi", "Pérez", 50000.00, new GregorianCalendar(2023, Calendar.JANUARY, 15));
        Empleado empleado2 = new Empleado(20304050608L, "Ana", "Gómez", 60000.00, new GregorianCalendar(2023, Calendar.FEBRUARY, 10));
        Empleado empleado3 = new Empleado(20304050609L, "Luis", "Martínez", 55000.00, new GregorianCalendar(2023, Calendar.MARCH, 20));
        Empleado empleado4 = new Empleado(20304050610L, "Sofía", "López", 70000.00, new GregorianCalendar(2023, Calendar.APRIL, 5));
        Empleado empleado5 = new Empleado(20304050611L, "Carlos", "Fernández", 65000.00, new GregorianCalendar(2023, Calendar.MAY, 25));

        // Altas empleados
        comercio.altaEmpleadoo(empleado1);
        comercio.altaEmpleadoo(empleado2);
        comercio.altaEmpleadoo(empleado3);
        comercio.altaEmpleadoo(empleado4);
        comercio.altaEmpleadoo(empleado5);

        // Mostrar Nomina
        comercio.nomina();
        
        // Cant Empleados
        System.out.println("Cantidad de empleados: " + comercio.cantidadDeEmpleados());

        // Existe Empleado
        System.out.println("¿Es empleado? " + comercio.esEmpleado(20304050611L));

        // Buscar empleado
        System.out.println(comercio.buscarEmpleado(20304050607L).getNombre());
        
        // Mostrar sueldo neto de un empleado
        System.out.print("Sueldo neto de Emi: ");
        comercio.sueldoNeto(20304050607L);

        // Baja a un empleado
        comercio.bajaEmpleado(20304050611L);
        System.out.println("Cantidad de empleados: " + comercio.cantidadDeEmpleados());

    }
}
