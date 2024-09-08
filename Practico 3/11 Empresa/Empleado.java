/**
 *  La clase Empeado representa la informacion personal de un empleado, 
 *  almacena CUIL, nombre, apellido, sueldo básico y fecha de ingreso.
 *  Contiene metodos para calcular antiguedad, sueldo neto, y mostrar
 *  la información del empleado en distintos formatos.
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
        this.setFechaIngreso(fecha);
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
    public Calendar getFechaIngreso() 
    {
        return this.fechaIngreso;    
    }
    
    //Metodos
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
        
        int antiguedad = (anioHoy - this.getFechaIngreso().get(Calendar.YEAR));
        
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
        return this.getCuil() + " " + this.apeYNom() 
        + " …………… $" + this.sueldoNeto();
    }
    
    /**
    * Verifica si la fecha de hoy coincide con la fecha de ingreso del empleado.
    * 
    * @return true si la fecha actual es el aniversario del empleado, 
    *         false en caso contrario.
    */
     public boolean esAniversario(){
        Calendar fechaHoy = new GregorianCalendar();
        
        //Fecha de hoy
        int mes = fechaHoy.get(Calendar.MONTH);
        int dia = fechaHoy.get(Calendar.DAY_OF_MONTH);
        
        //Aniversario de la persona
        int mesPersona = this.getFechaIngreso().get(Calendar.MONTH);
        int diaPersona = this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
        
        return (mes == mesPersona) && (dia == diaPersona);
    }
}
