/**
 * Write a description of class Comercio here.
 * 
 * @author (Sotelo Matias) 
 * @version (21/09/2024)
 */

import java.util.HashMap;
import java.util.Map;

public class Comercio
{
    //Atributos
    private String nombre; 
    private HashMap registroEmpleados;    

    //Constructor
    public Comercio(String p_nombre) 
    {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }
    
    public Comercio(String p_nombre, HashMap p_empleados) 
    {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    //Setter
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    private void setEmpleados(HashMap<Long, Empleado> p_empleado)
    {
        this.registroEmpleados = p_empleado;
    }

    //Getter
    public HashMap<Long, Empleado> getEmpleados()
    {
        return this.registroEmpleados;
    }    

    //Metodos
    public void altaEmpleadoo(Empleado p_empleado)
    {
        this.getEmpleados().put(new Long (p_empleado.getCuil()), p_empleado);
    }
    
    public Empleado bajaEmpleado(long p_cuil) 
    {
        return this.getEmpleados().remove(p_cuil);
    }
    
    public int cantidadDeEmpleados() 
    {
        return this.getEmpleados().size();
    }
    
    public boolean esEmpleado(long p_cuil) 
    {
        return this.getEmpleados().get(p_cuil) != null;
    }
    
    public Empleado buscarEmpleado(long p_cuil)
    {
        return this.getEmpleados().get(p_cuil);
    }
    
    public void sueldoNeto(long p_cuil) 
    {
        Empleado empleado = this.buscarEmpleado(p_cuil);

        System.out.println(empleado.getSueldoBasico());
    }
    
    public void nomina()
    {
        System.out.println("**** Nomina de empleados de Avanti SRL ****");

        for(Map.Entry<Long, Empleado> e : this.getEmpleados().entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue().getApellido() + ", " + e.getValue().getNombre() + "-----  $" + e.getValue().sueldoNeto());
        }

    }
}
