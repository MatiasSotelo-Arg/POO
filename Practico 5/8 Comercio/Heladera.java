
/**
 * La clase Heladera representa un electrodomestico.
 * 
 * Hereda de ArtefactoHogar e incluye atributos especificos.
 * 
 * Proporciona metodos para imprimir la informacion detallada de la heladera,
 * calcular el credito con adicionales segun sus caracteristicas y gestionar los 
 * datos relacionados con la heladera.
 * 
 * @author (Sotelo Matias) 
 * @version (07/10/2024)
 */
public class Heladera extends ArtefactoHogar
{
    //Atributos 
    private int pies;
    private int puertas;
    private boolean compresor;

    /**
     * Constructor de la clase Heladera.
     * 
     * @param p_marca La marca de la heladera.
     * @param p_precio El precio de la heladera.
     * @param p_stock La cantidad de unidades disponibles en stock.
     * @param p_pies La cantidad de pies de la heladera.
     * @param p_puertas La cantidad de puertas de la heladera.
     * @param p_compresor Indica si la heladera tiene compresor (true) o no (false).
     */
    public Heladera(String p_marca,
                    float p_precio,
                    int p_stock,
                    int p_pies, 
                    int p_puertas,
                    boolean p_compresor)
    {
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }

    //Getters
    public int getPies()
    {
        return this.pies;
    }
    
    public int getPuertas()
    {
        return this.puertas;
    }
    
    public boolean getCompresor()
    {
        return this.compresor;
    }
    
    //Setters
    private void setPies(int p_pies) 
    {
        this.pies = p_pies;
    }
    
    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }
    
    private void setCompresor(boolean p_compresor) 
    {
        this.compresor = p_compresor;        
    }
    
    //Metodos
    /** 
     * Imprime la informacion detallada de la heladera.
     * Muestra la marca, precio, stock, la cantidad de pies,
     * la cantidad de puertas y si tiene compresor.
     */
    public void imprimir() 
    {
       String tieneCompresor = (this.getCompresor() ? "SI" : "NO");
       System.out.println("\n**** Heladera ****");
       super.imprimir();
       System.out.println("Pies: " + this.getPies());
       System.out.println("Puertas: " + this.getPuertas());
       System.out.println("Compresor: " + tieneCompresor);
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
        float montoSeguro = 50;
        
        if(!this.getCompresor())
        {
            return super.cuotaCredito(p_cuotas,p_interes);   
        } else {
            return super.cuotaCredito(p_cuotas,p_interes) + montoSeguro;
        }
    }
}
