
/**
 * La clase ArtefactoHogar representa un electrodomestico con atributos comunes
 * como marca, precio y stock. 
 * 
 * Proporciona metodos para imprimir la informacion del artefacto y calcular la cuota mensual de un crédito. 
 * Es una clase abstracta que requiere la implementacion del metodo creditoConAdicional en las subclases.
 * 
 * 
 * @author (Sotelo Matias) 
 * @version (07/10/2024)
 */
public abstract class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;


    /** 
     * Constructor de la clase ArtefactoHogar.
     *
     * @param p_marca marca del artefacto.  
     * @param p_precio precio del artefacto. 
     * @param p_stock stock del artefacto. 
     * 
     * */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock)
    {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    //Getters
    public String getMarca()
    {
        return this.marca;
    }
    
    public float getPrecio() 
    {
        return this.precio;
    }
    
    public int getStock()
    {
        return this.stock;
    }
        
    //Setters
    private void setMarca(String p_marca) 
    {
        this.marca = p_marca;
    }
    
    private void setPrecio(float p_precio) 
    {
        this.precio = p_precio;
    }
    
    private void setStock(int p_stock) 
    {
        this.stock = p_stock;
    }
    
    //Metodos
    /** 
     * Imprime la información del artefacto.
     * Muestra la marca, el precio y el stock.
     */
    public void imprimir()
    {
        System.out.println("Marca: " + this.getMarca() + 
                           " - Precio: " + this.getPrecio() + 
                           " - Stock: " + this.getStock());
    }

    /** 
     * Calcula la cuota mensual de un crédito. 
     *
     * @param p_cuota El numero de cuotas en las que se desea pagar el credito.
     * @param p_interes La tasa de interes aplicada al credito, en porcentaje.
     * @return La cantidad a pagar en cada cuota.
     */
    public float cuotaCredito(int p_cuota, float p_interes) 
    {
       float interes = (this.getPrecio() * p_interes )/ 100;
       return (this.getPrecio() + interes) / p_cuota;  
    }
    
    /** 
     * Calcula el monto del credito considerando un pago adicional.
     * 
     * @param p_cuotas El numero de cuotas en las que se desea pagar el credito.
     * @param p_interes La tasa de interes aplicada al credito, en porcentaje.
     * @return El monto del credito con el pago adicional considerado.
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);    
}
