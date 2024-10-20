
/**
 * La clase Premium representa etiquetas de alta calidad con un costo base y 
 * un numero variable de colores. 
 *
 * Calcula un costo adicional basado en la cantidad de colores y proporciona metodos para calcular el precio total 
 * y obtener informacion sobre la etiqueta.
 * 
 * @author (Sotelo Matias) 
 * @version (14/10/2024)
 */
public class Premium extends Etiqueta
{
    //Atributos
    private int colores;

    /**
     * Constructor de la clase Premium.
     *
     * @param p_costo El costo base de la etiqueta.
     * @param p_colores El numero de colores de la etiqueta.
     */
    public Premium(double p_costo, int p_colores)
    {
        super(p_costo);
        this.setColores(p_colores);
    }

    //Getters
    public int getColores()
    {
        return this.colores;
    }
    
    //Setters
    private void setColores(int p_colores)
    {
        this.colores = p_colores;
    }
    
    //Metodos
    /**
     * Calcula el costo adicional segun el numero de colores de la etiqueta.
     *
     * @return El porcentaje adicional a aplicar al costo base de la etiqueta.
     */
    private double adicional()
    {
        int cantColores = this.getColores();
        
        if(cantColores == 1)
        {
            return 0;
        } else if(cantColores == 2)
        {
            return 0.05;
        } else if(cantColores == 3) 
        {
            return 0.07;
        } else {
            return cantColores * 0.03;
        }
    }
    
    //Metodos Abstractos
    /**
     * Calcula el precio total de las etiquetas Premium, 
     * incluyendo el costo base y el costo adicional según la cantidad de colores.
     *
     * @param p_q La cantidad de etiquetas.
     * @return El precio total despues de aplicar el costo adicional.
     */
    public double precio(int p_q) 
    {
        double subTotal = super.getCosto() * p_q;
        return subTotal + subTotal * this.adicional(); 
    }
    
    /**
     * Devuelve el tipo de etiqueta, en este caso "Premium".
     *
     * @return Una cadena que representa el tipo de la etiqueta.
     */
    protected String tipo() 
    {
        return "Premium"; 
    }
    
    /**
     * Devuelve una representacion en forma de cadena de la etiqueta Premium,
     * incluyendo el tipo de etiqueta y el numero de colores.
     *
     * @return Una cadena que representa el tipo, costo y colores de la etiqueta.
     */
    @Override
    public String toString() {
        return super.toString() + " - Colores: " + this.getColores();
    }
}
