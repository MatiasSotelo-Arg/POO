/**
 * La clase Comun extiende la clase Etiqueta y representa un tipo de etiqueta 
 * con un costo adicional. 
 * 
 * Calcula el precio total de las etiquetas aplicando 
 * descuentos según la cantidad solicitada. 
 * 
 * Proporciona metodos para obtener el tipo de etiqueta y una representacion en forma de cadena.
 * 
 * @author (Sotelo Matias) 
 * @version (14/10/2024)
 */

public class Comun extends Etiqueta
{
    //Atributos
    private double plus;

    /**
     * Constructor de la clase Comun.
     *
     * @param p_costo El costo base de la etiqueta.
     * @param p_plus Un costo adicional para la etiqueta.
     */
    public Comun(double p_costo, double p_plus)
    {
        super(p_costo);
        this.setPlus(p_plus);
    }

    //Getters
    public double getPlus()
    {
        return this.plus;
    }
    
    //Setters
    private void setPlus(double p_plus) 
    {
        this.plus = p_plus;
    }
    
    //Metodos 
    /**
     * Calcula el descuento aplicable segun la cantidad de etiquetas solicitadas.
     *
     * @param p_q La cantidad de etiquetas.
     * @return El porcentaje de descuento correspondiente.
     */
    private double descuento(int p_q) //recibe cant
    {
        if(p_q >= 1 && p_q <= 10) 
        {
            return 0;
        } else if(p_q >= 11 && p_q <= 50) {
            return 0.02;
        } else if(p_q >= 51 && p_q <= 100) 
        {
            return 0.05;
        } else {
            return (p_q / 10) * 0.01;
        }
    }
    
    //Metodos Abstractos
    /**
     * Calcula el precio total de las etiquetas, incluyendo costos adicionales
     * y aplicando el descuento correspondiente segun la cantidad solicitada.
     *
     * @param p_q La cantidad de etiquetas.
     * @return El precio total después de aplicar el descuento.
     */
    public double precio(int p_q) 
    {
        double subTotal = super.getCosto() * p_q + this.getPlus();
        return subTotal - (subTotal * this.descuento(p_q));
    }

    /**
     * Devuelve el tipo de etiqueta, en este caso "Comun".
     *
     * @return Una cadena que representa el tipo de la etiqueta.
     */
    protected String tipo() 
    {
        return "Comun"; 
    }
    
    /**
     * Devuelve una representacion en forma de cadena de la etiqueta Comun,
     * incluyendo el tipo de etiqueta y el costo adicional.
     *
     * @return Una cadena que representa el tipo, costo y diseño de la etiqueta.
     */
    @Override
    public String toString() {
        return super.toString() + " - Diseño: " + this.getPlus();
    }
}
