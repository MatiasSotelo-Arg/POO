
/**
 * Write a description of class Empleado here.
 * 
 * @author (Sotelo Matias) 
 * @version (02/09/2024)
 */

//Librerias
import java.util.*;

//Class
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
     * Constructor 
     * 
     * @param p_cuil cuil del empleado.
     * @param p_nombre nombre del empleado.
     * @param p_apellido del empleado. 
     * @param p_importe importe del sueldo basico. 
     * @param p_anio anio de ingreso de la persona.
     */
    public Empleado(long p_cuil, 
                    String p_nombre, 
                    String p_apellido,
                    double p_importe,
                    int p_anio)
    {
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_anio);
    }
    
    public Empleado(long p_cuil, 
                    String p_nombre, 
                    String p_apellido,
                    double p_importe,
                    Calendar p_fecha)
    {
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    /** METODOS */
    
    //Setters
    /** @param p_cuil cuil del empleado. */
    private void setCuil(long p_cuil) 
    {
        this.cuil = p_cuil;
    }
    
    /** @param p_nombre nombre del empleado. */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    /** @param p_apellido del empleado. */
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    
    /** @param p_importe importe del sueldo basico. */
    private void setSueldoBasico(double p_importe)
    {
        this.sueldoBasico = p_importe;
    }
    
    /** @param p_anio anio de ingreso de la persona. */
    private void setFechaIngreso(Calendar p_anio)
    {
        this.fechaIngreso = p_anio;
    }
    
    /** @param p_anio anio de ingreso de la persona. */
    private void setFechaIngreso(int p_anio)
    {
        Calendar fecha = Calendar.getInstance();
        fecha.set(p_anio,1,1);
        setFechaIngreso(fecha);
    }
    
    //Getters
    /** @return p_cuil cuil del empleado. */
    public long getCuil()
    {
        return this.cuil;
    }
    
    /** @return p_nombre nombre del empleado. */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /** @return p_apellido del empleado. */
    public String getApellido()
    {
        return this.apellido;
    }
    
    /** @return p_importe importe del sueldo basico. */
    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }
    
    /** @return p_anio anio de ingreso de la persona. */
    public int getFechaIngreso() 
    {
        return this.fechaIngreso.get(Calendar.YEAR);    
    }
    
    //Metodos
    
}
