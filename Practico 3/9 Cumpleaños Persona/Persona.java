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
    private Calendar fechaNacimiento;
    
    // Constructor 
    /** 
     * @param p_dni dni de la persona
     * @param p_nombre de la persona
     * @param p_apellido de la persona
     * @param p_anio de la persona
     */
    public Persona(int p_dni, 
                   String p_nombre, 
                   String p_apellido, 
                   int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_anio);
    }
    
    public Persona(int p_dni, 
                   String p_nombre, 
                   String p_apellido, 
                   Calendar p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_anio);
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
    private void setFechaNacimiento(Calendar p_anio) 
    {
        this.fechaNacimiento = p_anio;
    }
    
    private void setFechaNacimiento(int p_anio) 
    {
        Calendar fecha = Calendar.getInstance();
        fecha.set(p_anio,1,1);
        this.setFechaNacimiento(fecha);
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
    public Calendar getFechaNacimiento()
    {
        return this.fechaNacimiento;
    }
    
    /** 
     * Resta el año de nacimiento al año actual.
     * 
     * @return la edad de la persona **/
    public int edad() 
    {
        Calendar fechaHoy = new GregorianCalendar();

        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = (anioHoy - this.getFechaNacimiento().YEAR);
    
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
    
    /**
     * Comprueba si es el cumpleaño de la persona. 
     * 
     * @return boolean true o false
     */
    public boolean esCumpleanio() 
    {
        Calendar fecha = new GregorianCalendar();
        
        //Cumpleaños Persona 
        int diaPersona = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        int mesPersona = this.getFechaNacimiento().get(Calendar.MONTH);
        
        //Fecha actual 
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        
        //Verifica si coinciden las fechas
        boolean coincideDia = dia == diaPersona ;
        boolean coincideMes = mes == mesPersona;
        
        return coincideDia && coincideMes;
    } 
    
    
    
    
    
}