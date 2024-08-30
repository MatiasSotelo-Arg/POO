
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
    /**
    *	@param p_nombre nombre del laboratorio. 
    *	@param p_domicilio domicilio del laboratorio . 
    *	@param p_telefono telefono del laboratorio.
    *	@param p_compraMin compra minima de la empresa.
    *	@param p_diaEnt dia de entrega.
    */
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
    /**  @param p_nombre nombre del laboratorio. */
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    /**  @param p_domicilio domicilio del laboratorio .*/
    private void setDomicilio(String p_domicilio) 
    {
        this.domicilio = p_domicilio;    
    }
    
    /**  @param p_telefono telefono del laboratorio. */
    private void setTelefono(String p_telefono) 
    {
        this.telefono = p_telefono;
    }
    
    /**  @param p_compraMin compra minima de la empresa. */
    private void setCompraMinima(int p_compraMinima) 
    {
        this.compraMinima = p_compraMinima;
    }

    /**  @param p_diaEnt dia de entrega. */
    private void setDiaEntrega(int p_diaEntrega) 
    {
        this.diaEntrega = p_diaEntrega;
    }
    
    /** @return nombre del laboratorio. */
    public String getNombre() 
    {
        return this.nombre;
    }

    /** @return domicilio del laboratorio. */    
    public String getDomicilio() 
    {
        return this.domicilio;
    }
    
    /** @return telefono del laboratorio. */
    public String getTelefono() 
    {
        return this.telefono;
    }
    
    /**
    *	Modifica el monto de la compra mínima.
    *	@param p_compraMin compra minima
    */
    public void nuevaCompraMinima(int p_compraMin) 
    {
        this.setCompraMinima(p_compraMin);
    }
    
    /**
    *	Permite cambiar el dia de entrega.
    *	@param p_compraMin monto compra minima
    */
    public void nuevoDiaEntrega(int p_diaEnt) 
    {
        this.setCompraMinima(p_diaEnt);
    }
    
    /**
    *	Concatena nombre del laboratorio, domicilio y telefono
    *	del laboratorio.
    *
    *	@return informacion del laboratorio
    */
    public String mostrar() 
    {
        return "Laboratorio: " + this.getNombre() + "\n" + "Domicilio: " 
        + this.getDomicilio() + " - " + "Telefono: " + this.getTelefono();
    }
}