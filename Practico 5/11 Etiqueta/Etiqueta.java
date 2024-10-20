
/**
 * La clase abstracta Etiqueta representa un tipo general de etiqueta con un costo asociado.
 *
 * Proporciona metodos para obtener el costo, mostrar la representación en forma de cadena 
 * y definir el precio basado en la cantidad solicitada. 
 * 
 * 
 * @author (Sotelo Matias) 
 * @version (14/10/2024)
 */
public abstract class Etiqueta 
{
    //Atributos
    private double costo;
    
    /**
     * Constructor de la clase Etiqueta.
     *
     * @param p_costo El costo de la etiqueta.
     */
    public Etiqueta(double p_costo)
    {
        this.setCosto(p_costo);
    }

    //Getters
    public double getCosto() 
    {
        return this.costo;
    }
    
    //Setters
    private void setCosto(double p_costo)
    {
        this.costo = p_costo;
    }
       
    //Metodos
    /**
     * Devuelve una representacion en forma de cadena de la etiqueta,
     * incluyendo su tipo y costo.
     *
     * @return Una cadena que representa el tipo y el costo de la etiqueta.
     */
    public String toString() 
    {
        if(this.tipo().equals("Premium")) 
        {
            return ("tipo " + this.tipo() + " - Costo: $" + this.getCosto());
        } else {
            return ("tipo " + this.tipo() + " - Costo: $" + this.getCosto());
        }
    }
    
    //Metodos Abstractos 
    /**
     * Calcula el precio de la etiqueta basado en la cantidad solicitada.
     *
     * @param p_q La cantidad de etiquetas.
     * @return El precio total para la cantidad solicitada.
     */
    public abstract double precio(int p_q);  

    /**
     * Devuelve el tipo de etiqueta.
     *
     * @return Una cadena que representa el tipo de etiqueta.
     */
    protected abstract String tipo();
}
    
