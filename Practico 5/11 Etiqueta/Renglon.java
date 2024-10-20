
/**
 * La clase Renglon representa un registro de una cantidad de etiquetas y su importe total.
 * 
 * Incluye una etiqueta asociada y permite mostrar los detalles del renglon, 
 * la cantidad y el precio total. 
 * 
 * @author (Sotelo Matias) 
 * @version (14/10/2024)
 */

public class Renglon
{
    private int cantidad;
    private double importe;
    
    private Etiqueta item;
    
    /**
     * Constructor de la clase Renglon.
     *
     * @param p_cantidad La cantidad de etiquetas en el renglon.
     * @param p_importe El importe total del renglon.
     * @param p_item La etiqueta asociada a este renglon.
     */
    public Renglon(int p_cantidad, 
                   double p_importe,
                   Etiqueta p_item)
    {
        this.setCantidad(p_cantidad);
        this.setImporte(p_importe);
        this.setItem(p_item);
    }

    //Getters
    public int getCantidad() 
    {
        return this.cantidad = cantidad;
    }
    
    public double getImporte() 
    {
        return this.importe = importe; 
    }
    
    public Etiqueta getItem() 
    {
        return this.item;
    }
    
    //Setters
    private void setCantidad(int p_cantidad) 
    {
        this.cantidad = p_cantidad; 
    }
    
    private void setImporte(double p_importe) 
    {
        this.importe = p_importe;
    }
    
    private void setItem(Etiqueta p_item) 
    {
        this.item = p_item;
    }
    
    //Metodos
    /**
     * Muestra los detalles del renglon, incluyendo la cantidad de etiquetas,
     * la informacióon de la etiqueta y el precio total para esa cantidad.
     */
    public void mostrar() 
    {
        Etiqueta item = this.getItem(); 
        System.out.println(this.getCantidad() + " Etiquetas de " + item.toString());  
        System.out.println("Precio: $ " + item.precio(this.getCantidad()));
    }
}
