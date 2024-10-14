
/**
 * Write a description of class Alojamiento here.
 * 
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */

import java.util.ArrayList; 

public abstract class Alojamiento
{
    //Atributos
    private String nombre;
    private double precioBase;
    private int diasAlquiler;

    private ArrayList<Servicio> servicios;

    /**
     * Constructor for objects of class Alojamiento
     */
    public Alojamiento(String p_nombre, 
                       double p_precioBase,
                       int p_diasAlquiler)
    {
        this.setServicios(new ArrayList<Servicio>());
    }

    public Alojamiento(String p_nombre, 
                       double p_precioBase,
                       int p_diasAlquiler,
                       ArrayList<Servicio> p_servicios)
    {
        this.setServicios(p_servicios);
    }


    //Getters
    public String getNombre() 
    {
        return this.nombre;
    }

    public double getPrecioBase() 
    {
        return this.precioBase;
    }

    public double getDiasAlquiler() 
    {
        return this.diasAlquiler;
    }

    public ArrayList<Servicio> getServicios() 
    {
        return this.servicios;
    }
    
    //Setters
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    private void setPrecioBase(double p_precioBase)
    {
        this.precioBase = p_precioBase;
    }

    private void setDiasAlquiler(int p_diasAlquiler)
    {
        this.diasAlquiler = p_diasAlquiler;
    }

    private void setServicios(ArrayList<Servicio> p_servicios) 
    {
        this.servicios = p_servicios;
    }

    //Metodos 
    public boolean agregarServicio(Servicio p_servicio) 
    {
        ArrayList<Servicio> servicios = this.getServicios(); 
        if(!servicios.contains(p_servicio)) 
        {
            servicios.add(p_servicio);
            return true; 
        } else {
            return false;
        }
    }

    public boolean quitarServicio(Servicio p_servicios) 
    {
        ArrayList<Servicio> servicios = this.getServicios();
        if(servicios.contains(p_servicios))
        {
            servicios.remove(p_servicios);
            return true;
        } else 
        {
            return false;
        }
    }

    public void listarServicios() 
    {
        for(Servicio servicios: this.getServicios()) 
        {
            System.out.println(servicios.getDescripcion() + ": $" + servicios.getPrecio());
        }
    }

    public double costoServicios() 
    {
        double total = 0;

        for(Servicio servicios: this.getServicios()) 
        {
            total = total + servicios.getPrecio();
        }
        
        return total;
    }

    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + "dias: $" + this.costo() +"alquiler"); 
        this.listarServicios();

    }

    public double costo()
    {
        return this.getPrecioBase() * this.getDiasAlquiler();
    }

    //Metodos Abstractos     
    public abstract int contar(String p_alojamiento);
}
