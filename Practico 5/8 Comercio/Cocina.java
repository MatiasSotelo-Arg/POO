
/**
 * Write a description of class Cocina here.
 * 
 * @author (Sotelo Matias) 
 * @version (07/10/2024)
 */
public class Cocina extends ArtefactoHogar 
{
    //Atributos
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /** Constructor 
           
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
    public void imprimir() 
    {
       System.out.println("\n**** Cocina ****");
       super.imprimir();
       System.out.println("Hornallas: " + this.getHornallas());
       System.out.println("Calorias: " + this.getCalorias());
       System.out.println("Dimensiones: " + this.getDimensiones());
    }
    
    public float creditoConAdicional(int p_cuotas, float p_interes)
    {
        return super.cuotaCredito(p_cuotas,p_interes);
    }
}
