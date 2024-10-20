
/**
 * La clase Alojamiento representa un tipo de alojamiento con un nombre, 
 * precio base, duracion de alquiler y una lista de servicios adicionales.
 *
 * Permite gestionar la adicion y eliminacion de servicios, calcular costos 
 * y listar los servicios disponibles. 
 * 
 * Es una clase abstracta que requiere implementacion para contar 
 * alojamientos de tipo especifico.
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
     * Constructor de la clase Alojamiento.
     *
     * @param p_nombre El nombre del alojamiento.
     * @param p_precioBase El precio base por noche del alojamiento.
     * @param p_diasAlquiler La cantidad de dias que se desea alquilar el alojamiento.
     */
    public Alojamiento(String p_nombre, 
                       double p_precioBase,
                       int p_diasAlquiler)
    {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setServicios(new ArrayList<Servicio>());
    }

    /**
     * Constructor de la clase Alojamiento.
     *
     * @param p_nombre El nombre del alojamiento.
     * @param p_precioBase El precio base por noche del alojamiento.
     * @param p_diasAlquiler La cantidad de dias que se desea alquilar el alojamiento.
     * @param p_servicios Una lista de servicios disponibles para el alojamiento.
     */
    public Alojamiento(String p_nombre, 
                       double p_precioBase,
                       int p_diasAlquiler,
                       ArrayList<Servicio> p_servicios)
    {
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
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
    /**
     * Agrega un servicio a la lista de servicios del alojamiento.
     *
     * @param p_servicio El servicio a agregar.
     * @return true si el servicio fue agregado con exito, false si el servicio ya existe en la lista.
     */ 
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

    /**
     * Quita un servicio de la lista de servicios del alojamiento.
     *
     * @param p_servicios El servicio a quitar.
     * @return true si el servicio fue eliminado con exito; false si el servicio no esta en la lista.
     */
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

    /**
     * Lista todos los servicios disponibles del alojamiento,
     * mostrando la descripcion y el precio de cada uno.
     */
    public double costoServicios() 
    {
        double total = 0;

        for(Servicio servicios: this.getServicios()) 
        {
            total += servicios.getPrecio();
        }
        
        return total;
    }

    /**
     * Liquida el costo total del alojamiento,
     * mostrando el nombre, el costo por los días de alquiler
     * y la lista de servicios asociados.
     */
    public void liquidar() {
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + (this.costo() - this.costoServicios())+" alquiler"); 
        this.listarServicios();
    }

    /**
     * Calcula el costo total del alojamiento
     * multiplicando el precio base por la cantidad de dias de alquiler.
     *
     * @return El costo total del alojamiento.
     */
    public double costo()
    {
        return this.getPrecioBase() * this.getDiasAlquiler();
    }


    //Metodos Abstractos   
    /**
     * Cuenta la cantidad de alojamientos de tipo "Hotel".
     *
     * @param p_alojamiento El tipo de alojamiento a contar.
     * @return 1 si el alojamiento es un "Hotel" de lo contrario 0.
     */  
    public abstract int contar(String p_alojamiento);
}
