
/**
 * La clase Cocina representa un electrodomestico con atributos especificos
 * como hornallas, calorias y dimensiones. 
 * 
 * Hereda de ArtefactoHogar y proporciona metodos para imprimir la informacion del producto y calcular la cuota de credito.
 * 
 * @author Sotelo Matias
 * @version 07/10/2024
 */

public class Cocina extends ArtefactoHogar 
{
    //Atributos
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /**
     * Constructor de la clase Cocina.
     *
     * @param p_marca La marca de la cocina.
     * @param p_precio El precio de la cocina.
     * @param p_stock La cantidad de unidades disponibles en stock.
     * @param p_hornallas El numero de hornallas de la cocina.
     * @param p_calorias Las calorias generadas por la cocina.
     * @param p_dimensiones Las dimensiones de la cocina.
     */
    public Cocina(String p_marca,
                  float p_precio,
                  int p_stock,
                  int p_hornallas, 
                  int p_calorias, 
                  String p_dimensiones)
    {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    
    //Getters 
    public int getHornallas()
    {
        return this.hornallas;
    }
    
    public int getCalorias()
    {
        return this.calorias;
    }
    
    public String getDimensiones()
    {
        return this.dimensiones;
    }
    
    //Setters 
    private void setHornallas(int p_hornallas) 
    {
        this.hornallas = p_hornallas;
    }
    
    private void setCalorias(int p_calorias) 
    {
        this.calorias = p_calorias;
    }
    
    private void setDimensiones(String p_dimensiones) 
    {
        this.dimensiones = p_dimensiones;
    }
    
    //Metodos
    /**
     * Imprime en la informacion detallada de la cocina.
     * Muestra la marca, precio, stock, el numero de hornallas,
     * las calorias y las dimensiones de la cocina.
     */ 
    @Override
    public void imprimir() 
    {
       System.out.println("\n**** Cocina ****");
       super.imprimir();
       System.out.println("Hornallas: " + this.getHornallas());
       System.out.println("Calorias: " + this.getCalorias());
       System.out.println("Dimensiones: " + this.getDimensiones());
    }
    
    /** 
     * Calcula el monto del credito considerando un pago adicional.
     * 
     * @param p_cuotas El numero de cuotas en las que se desea pagar el credito.
     * @param p_interes La tasa de interes aplicada al credito, en porcentaje.
     * @return El monto del credito con el pago adicional considerado.
     */
    @Override
    public float creditoConAdicional(int p_cuotas, float p_interes)
    {
        return super.cuotaCredito(p_cuotas,p_interes);
    }
}
