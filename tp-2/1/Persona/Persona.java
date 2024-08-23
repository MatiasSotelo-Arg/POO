/* Persona
    -nroDni: int
    -nombre: String
    -apellido: String
    -anioNacimiento: int
    +Persona(p_dni: int, p_nombre: String, p_apellido: String, p_anio: int)
    -setDNI(p_dni: int): void
    -setNombre(p_nombre: String): void
    -setApellido(p_apellido: String): void
    -setAnioNacimiento(p_anio: int): void
    +getDNI(): int
    +getNombre(): String
    +getApellido(): String
    +getAnioNacimiento(): int
    +edad(): int
    +nomYApe(): String
    +apeYNom(): String
    +mostrar(): void
    
    import java.util.*;
    
    Calendar fechaHoy = new GregorianCalendar();
    int anioHoy = fechaHoy.get(Calendar.YEAR);
*/



/**
 * Write a description of class Persona here.
 * 
 * @author (Matias Sotelo) 
 * @version (21/08/2024)
 */

// Import
import java.util.*;

public class Persona
{
    // Atributos 
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    // Constructor 
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    // Metodos
    private void setDNI(int p_dni) 
    {
        this.nroDni = p_dni;
    }
       
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio) 
    {
        this.anioNacimiento = p_anio;
    }
    
    public int getDNI() 
    {
        return this.nroDni;
    }
    
    public String getNombre() 
    {
        return this.nombre;
    }
    
    public String getApellido() 
    {
        return this.apellido;
    }
    
    public int getAnioNacimiento()
    {
        return this.anioNacimiento;
    }
    
    public int edad() 
    {
        Calendar fechaHoy = new GregorianCalendar();

        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = (anioHoy - getAnioNacimiento());
    
        return edad;
    }
    
    public String nomYApe() 
    {   
        return this.getNombre() + " " + 
        this.getApellido();  
    }
    
    public String apeYNom() 
    {
        return this.getApellido() + " " +
        this.getNombre(); 
    }
    
    public void mostrar() 
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe() + "\nDNI: " + 
        this.getDNI() + " Edad: " + this.edad() + " años");
    }
}
