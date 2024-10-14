
/**
 * Write a description of class Servicio here.
 * 
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */
public class Servicio
{
    //Atributos
    private String descripcion;
    private double precio;

    /**
     * Constructor for objects of class Servicio
     */
    public Servicio(String p_descripcion, double p_precio)
    {
       this.setDescripcion(p_descripcion);
       this.setPrecio(p_precio);
    }

    //Getters
    public String getDescripcion() 
    {
        return this.descripcion;
    }

    public double getPrecio() 
    {
        return this.precio;
    }

    //Setters
    private void setDescripcion(String p_descripcion)
    {
        this.descripcion = p_descripcion;
    }

    private void setPrecio(double p_precio)
    {
        this.precio = p_precio;
    }
}
