
/**
 * Write a description of class ArtefactoHogar here.
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
     * Constructor for objects of class ArtefactoHogar
     */
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
    public void imprimir()
    {
        System.out.println("Marca: " + this.getMarca() + 
                           " - Precio: " + this.getPrecio() + 
                           " - Stock: " + this.getStock());
    }

    /* al precio original se agrega el interés y 
     * se divide por el número de cuotas pactadas. */
    public float cuotaCredito(int p_cuota, float p_interes) 
    {
       float interes = (this.getPrecio() * p_interes )/ 100;
       return (this.getPrecio() + interes) / p_cuota;  
    }
    
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);    
}
