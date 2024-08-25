
/**
 * La clase Empleado permite a la empresa, 
 * la liquidación de sueldo de sus empleados.
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
    /** 
    *   @param cuil del empleado
    *   @param apellido del empleado
    *   @param nombre del empleado
    *   @param sueldoBasico del empleado
    *   @anioIngreso del empleado
    **/
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
    
    /** 
    *   Calcula la antiguedad del empleado 
    *   restando el año de ingreso al año actual.
    *   
    *   @return la antiguedad del empleado
    **/
    public int antiguedad() 
    {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        int antiguedad = (anioHoy - this.getAnioIngreso());
        
        return antiguedad; 
    }
    
    /** 
    *   Descuenta al sueldo base un porcentaje de 
    *   obra social y el monto de seguro de vida.
    *   
    *   @return el monto a descontar
    **/
    private double descuento() 
    {
        //monto seguro de vida
        int aporte = 1500;
        //porcentaje obra social
        int porcentaje = 2;
    
        return (this.getSueldoBasico() * porcentaje / 100) + aporte;
    }
    
    /** 
    *   Obtiene el monto adicional a pagar al empleado
    *   según sus años de antiguedad.
    *   
    *   @return monto adicional a pagar
    */
    private double adicional() 
    {
        //valor atributo antiguedad        
        int antiguedad = this.antiguedad(); 
        //valor atributo sueldo base
        double sueldoBase = this.getSueldoBasico();
        
        if(antiguedad < 2) 
        {
            return sueldoBase * 2 / 100; 
        } else if (antiguedad >= 2 && antiguedad < 10) 
        {
            return sueldoBase * 4 / 100;
        } else 
        {
            return sueldoBase * 6 / 100;
        }
    }
    
    /** 
    *   Obtiene el sueldo neto sumando al sueldo basico el 
    *   adicional y restando los descuento.
    *
    *   @return monto sueldo neto
    */
    public double sueldoNeto() 
    {
        return (this.getSueldoBasico() + this.adicional()) 
        - this.descuento();
    }

    /**
    *   Concatena nombre y apellido del 
    *   empleado.
    *
    *   @return nombre y apellido
    */
    public String nomYApe() 
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
    *   Concatena apellido y nombre del 
    *   empleado.
    *
    *   @return apellido y nombre
    */
    public String apeYNom() 
    {
        return this.getApellido() + "," + this.getNombre();
    }
    
    /**
    *   Imprime Información del empleado:  
    *   Nombre, Apellido, CUIL, Antiguedad, años servicio,
    *   Sueldo neto.
    **/
    public void mostrar() 
    {
        //Metodo nombre y apellido
        String nomYApe = this.nomYApe();
        //Atributo cuil
        long cuil = this.getCuil();
        //Metodo antiguedad
        int antiguedad = this.antiguedad();
        //Atributo sueldo neto
        double sueldoNeto = this.sueldoNeto();
        
        //Imprime Información
        System.out.println("Nombre y Apellido: " + nomYApe +
        "\nCUIL: " + cuil + "Antiguedad: " + antiguedad + " años de servicios" +
        "\nSueldo Neto: $ " + sueldoNeto);
    }
    
    /**
    *    Concatena Cuil, Apellido, Nombre y 
    *    Sueldo Neto del empleado.
    * 
    *    @return la informacion en una linea
    */   
    public String mostrarLinea() 
    {
        return this.getCuil() + " " + this.apeYNom() + " …………… $" 
        + this.sueldoNeto();
    }
}