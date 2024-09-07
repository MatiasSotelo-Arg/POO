
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (Sotelo Matias) 
 * @version (07/09/2024)
 */
public class CajaDeAhorro
{
    //Atributos 
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    /**
     * Constructor 
     * 
     * @param p_nroCuenta nro de la caja ahorro 
     * @param p_saldo saldo de la caja de ahorro
     * @param p_extPosibles extracciones posibles en la caja de ahorro
     * @param p_titular titular de la caja de ahorro
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular)
    {
        
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        
    }

    /** METODOS */
    
    //Setters 
    /** @param p_nroCuenta nro de la caja ahorro */
    private void setNroCuenta(int p_nroCuenta)
    {
        this.nroCuenta = p_nroCuenta;
    }
    
    /** @param p_saldo saldo de la caja de ahorro */
    private void setSaldo(double p_saldo)
    {
        this.saldo = p_saldo;
    }
    
    /** @param p_extPosibles extracciones posibles en la caja de ahorro */
    private void setExtPosibles(int p_extPosibles)
    {
        this.extraccionesPosibles = p_extPosibles;
    }
    
    /** @param p_titular titular de la caja de ahorro */
    private void setTitular(Persona p_titular)
    {
        this.titular = p_titular;    
    }
    
    //Getters
    /** @return p_nroCuenta nro de la caja ahorro */
    public int getNroCuenta() 
    {
        return this.nroCuenta;
    }
    
    /** @return p_saldo saldo de la caja de ahorro */
    public double getSaldo() 
    {
        return this.saldo;    
    }
    
    /** @return p_extPosibles extracciones posibles en la caja de ahorro */
    public int getExtPosibles() 
    {
        return this.extraccionesPosibles;    
    }
    
    /** @return p_titular titular de la caja de ahorro */
    public Persona getTitular()
    {
        return this.titular;
    }
    
    //Metodos
    /* El método puedeExtraer(p_importe) devuelve true si el importe a retirar no supera 
       el saldo disponible y si aún no usó todas las extracciones posibles. */
    
    public boolean puedeExtraer(double p_importe) 
    {
        boolean permiso = p_importe <= this.getSaldo() && this.getExtPosibles() > 0;
        
        return permiso ? true : false;
    }
    
    
    
    
    
    
    
    
}

