
/**
 * Write a description of class Empleado here.
 * 
 * @author (Sotelo Matias) 
 * @version (22/08/2024)
 */

import java.util.*;

public class Empleado
{
    //Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    
    //Constructor
    public Empleado(long p_cuil, String p_apellido, String p_nombre, 
    double p_importe, int p_anio)
    {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_anio);
    }

    //Metodos
    private void setCuil(long p_cuil) 
    {
        this.cuil = p_cuil;
    }
    
    private void setApellido(String p_apellido) 
    {
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    private void setSueldoBasico(double p_sueldoBasico) 
    {
        this.sueldoBasico = p_sueldoBasico;
    }
    
    private void setAnioIngreso(int p_anioIngreso) 
    {
        this.anioIngreso = p_anioIngreso;
    }
    
    public long getCuil()
    {
        return this.cuil;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }

    public double getSueldoBasico()
    {
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso()
    {
        return this.anioIngreso;
    }
    
    public int antiguedad() 
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        int antiguedad = (anioHoy - this.getAnioIngreso());
        
        return antiguedad; 
    }
    
    private double descuento() 
    {
        double descuento = (this.getSueldoBasico() * 2 / 100) + 1500;
        
        return descuento;
    }
    
    private double adicional() 
    {
        double adicional = 0;
        
        int antiguedad = this.antiguedad(); 
        double sueldoBase = this.getSueldoBasico();
        
        if(antiguedad < 2) 
        {
            adicional = sueldoBase * 2 / 100; 
        } else if (antiguedad >= 2 && antiguedad < 10) 
        {
            adicional = sueldoBase * 4 / 100;
        } else 
        {
            adicional = sueldoBase * 6 / 100;
        }
    
        return adicional;
    }
    
    public double sueldoNeto() 
    {
        return (this.getSueldoBasico() + this.adicional()) 
        - this.descuento();
    }

    public String nomYApe() 
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    public String apeYNom() 
    {
        return this.getApellido() + "," + this.getNombre();
    }
    
    public void mostrar() 
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe() +
        "\nCUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() 
        + " años de servicio\nSueldo Neto: $ " + this.sueldoNeto());
        System.out.println();
    }
    
    public String mostrarLinea() 
    {
        return this.getCuil() + " " + this.apeYNom() + " …………… $" 
        + this.sueldoNeto();
    }
}