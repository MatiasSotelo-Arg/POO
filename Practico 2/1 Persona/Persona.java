/**
 * La Clase Persona: Permite gestionar la información de una 
 * persona y mostrarlos (nombre, apellido, dni y edad).
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
    /** 
     * @param p_dni dni de la persona
     * @param p_nombre de la persona
     * @param p_apellido de la persona
     * @param p_anio de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    // Metodos
    /** @param p_dni dni de la persona **/
    private void setDNI(int p_dni) 
    {
        this.nroDni = p_dni;
    }
       
    /** @param p_nombre de la persona **/
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    /** @param p_apellido de la persona **/
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    
    /** @param p_anio de la persona **/
    private void setAnioNacimiento(int p_anio) 
    {
        this.anioNacimiento = p_anio;
    }
    
    /** @return el dni de la persona **/
    public int getDNI() 
    {
        return this.nroDni;
    }
    
    /** @return el nombre de la persona **/
    public String getNombre() 
    {
        return this.nombre;
    }
    
    /** @return el apellido de la persona **/
    public String getApellido() 
    {
        return this.apellido;
    }
    
    /** @return el año de nacimiento de la persona **/
    public int getAnioNacimiento()
    {
        return this.anioNacimiento;
    }
    
    /** 
     * Resta el año de nacimiento al año actual.
     * 
     * @return la edad de la persona **/
    public int edad() 
    {
        Calendar fechaHoy = new GregorianCalendar();

        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = (anioHoy - getAnioNacimiento());
    
        return edad;
    }
    
    /**  
     * Concatena el nombre y apellido de la persona.
     * @return el nombre y apellido **/
    public String nomYApe() 
    {   
        return this.getNombre() + " " + 
        this.getApellido();  
    }
    
    /** 
     * Concatena el apellido y nombre de la persona.
     * @return apellido y nombre **/
    public String apeYNom() 
    {
        return this.getApellido() + " " +
        this.getNombre(); 
    }
    
    /** Imprime la información de la persona Nombre, Apellido, DNI, Edad.**/
    public void mostrar() 
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe() + "\nDNI: " + 
        this.getDNI() + " Edad: " + this.edad() + " años");
    }
}
