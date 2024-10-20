/**
 * La clase Lavarropas representa un electrodomestico, Hereda de ArtefactoHogar e incluye atributos.
 * 
 * Proporciona metodos para imprimir la informacion detallada del lavarropas,
 * calcular el credito con descuentos adicionales segun sus caracteristicas y gestionar
 * los datos relacionados con el lavarropas.
 * 
 * @author (Sotelo Matias) 
 * @version (07/10/2024)
 */
public class Lavarropas extends ArtefactoHogar
{
    //Atributos 
    private int programas;
    private float kilos;
    private boolean automatico;
    
    /**
     * Constructor de la clase Lavarropas.
     *
     * @param p_marca La marca del lavarropas.
     * @param p_precio El precio del lavarropas.
     * @param p_stock La cantidad de unidades disponibles en stock.
     * @param p_programa El número de programas de lavado que ofrece el lavarropas.
     * @param p_kilos La capacidad de carga del lavarropas en kilogramos.
     * @param p_automatico Indica si el lavarropas es automático (true) o manual (false).
     */
    public Lavarropas(String p_marca,
                    float p_precio,
                    int p_stock, 
                    int p_programa,
                    float p_kilos,
                    boolean p_automatico)
    {
        super(p_marca, p_precio, p_stock);
        this.setPrograma(p_programa);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    //Getters
    public int getPrograma() 
    {
        return this.programas;
    }

    public float getKilos()
    {
        return this.kilos;
    }
    
    public boolean getAutomatico()
    {
        return this.automatico;
    }
    
    //Setters
    private void setPrograma(int p_programa) 
    {
        this.programas = p_programa;
    }
    
    private void setKilos(float p_kilos)
    {
        this.kilos = p_kilos;
    }
    
    private void setAutomatico(boolean p_automatico)
    {
        this.automatico = p_automatico;
    }
    
    //Metodos
    /**
     * Imprime la informacion detallada del lavarropas.
     * Muestra la marca, precio, stock, la cantidad de programas de lavado,
     * la capacidad de carga en kilos y si es automatico.
     */
     public void imprimir() 
    {
       String esAutomatico = (this.getAutomatico() ? "SI" : "NO");
       System.out.println("\n**** Lavarropas ****");
       super.imprimir();
       System.out.println("Programas: " + this.getPrograma());
       System.out.println("Kilos: " + this.getKilos());
       System.out.println("Compresor: " + esAutomatico);
    }
    
    /** 
     * Calcula el monto del credito considerando un pago adicional.
     * 
     * @param p_cuotas El numero de cuotas en las que se desea pagar el credito.
     * @param p_interes La tasa de interes aplicada al credito, en porcentaje.
     * @return El monto del credito con el pago adicional considerado.
     */
    public float creditoConAdicional(int p_cuotas, float p_interes)
    {
        float cuota = super.cuotaCredito(p_cuotas,p_interes);
        if(!this.getAutomatico()) 
        {
            return cuota;
        } else {
            return cuota - (cuota * 2 / 100);
        }
    }
}