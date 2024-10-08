
/**
 * Write a description of class Lavarropas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lavarropas extends ArtefactoHogar
{
    //Atributos 
    private int programas;
    private float kilos;
    private boolean automatico;
    
    /**
     * Constructor for objects of class Lavarropas
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
     public void imprimir() 
    {
       String esAutomatico = (this.getAutomatico() ? "SI" : "NO");
       System.out.println("\n**** Lavarropas ****");
       super.imprimir();
       System.out.println("Programas: " + this.getPrograma());
       System.out.println("Kilos: " + this.getKilos());
       System.out.println("Compresor: " + esAutomatico);
    }
    
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