
/**
 * Write a description of class PersonaEjecutable here.
 * 
 * @author (Sotelo Matias) 
 * @version (21/08/2024)
 */
public class PersonaEjecutable
{      
    // Main
    public static void main(String [] args)
    {
        int dni = 42097348;
        String nombre = "Matias";
        String apellido = "Sotelo";
        int nacimiento = 1999;
    
        Persona p1 = new Persona(dni, nombre, apellido, nacimiento); 
        p1.mostrar();
    }
}
