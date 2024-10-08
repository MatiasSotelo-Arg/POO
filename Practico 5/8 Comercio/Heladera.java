
/**
 * Write a description of class Heladera here.
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
     * Constructor for objects of class Heladera
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
    public void imprimir() 
    {
       String tieneCompresor = (this.getCompresor() ? "SI" : "NO");
       System.out.println("\n**** Heladera ****");
       super.imprimir();
       System.out.println("Pies: " + this.getPies());
       System.out.println("Puertas: " + this.getPuertas());
       System.out.println("Compresor: " + tieneCompresor);
    }
    
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
