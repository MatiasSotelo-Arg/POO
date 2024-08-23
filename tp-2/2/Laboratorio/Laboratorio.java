
/**
 * Write a description of class Laboratorio here.
 * 
 * @author (Sotelo Matias) 
 * @version (21/08/2024)
 */
public class Laboratorio
{
    //Atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    //Constructor
    public Laboratorio(String p_nombre, String p_domicilio, 
    String p_telefono,int p_compraMinima, int p_diaEntrega)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    
    public Laboratorio(String p_nombre, String p_domicilio,
    String p_telefono) 
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }

    //Metodos
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio) 
    {
        this.domicilio = p_domicilio;    
    }
    
    private void setTelefono(String p_telefono) 
    {
        this.telefono = p_telefono;
    }
    
    private void setCompraMinima(int p_compraMinima) 
    {
        this.compraMinima = p_compraMinima;
    }
    
    private void setDiaEntrega(int p_diaEntrega) 
    {
        this.diaEntrega = p_diaEntrega;
    }
    
    public String getNombre() 
    {
        return this.nombre;
    }
    
    public String getDomicilio() 
    {
        return this.domicilio;
    }
    
    public String getTelefono() 
    {
        return this.telefono;
    }
    
    public void nuevaCompraMinima(int p_compraMin) 
    {
        this.setCompraMinima(p_compraMin);
    }
    
    public void nuevoDiaEntrega(int p_diaEnt) 
    {
        this.setCompraMinima(p_diaEnt);
    }
    
    public String mostrar() 
    {
        return "Laboratorio: " + this.getNombre() + "\n" + "Domicilio: " 
        + this.getDomicilio() + " - " + "Telefono: " + this.getTelefono();
    }
}