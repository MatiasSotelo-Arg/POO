
/**
 * La clase Cuenta Corriente permite gestionar la cuenta corriente del titular,
 * verifica si puede hacer extracciones, extrae e ingresa dinero de la cuenta y 
 * imprime un mensaje con la informacion del titular.
 *
 * @author (Sotelo Matias) 
 * @version (01/09/2024)
 */
public class CuentaCorriente
{
    //Atributos
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Constructor 
     * 
     * @param p_nroCuenta nro de la cuenta corriente
     * @param p_titular titular de la cuenta corriente
     * @param p_saldo saldo de la cuenta corriente
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular)
    {
        this.setLimiteDescubierto(500.00);
        this.setSaldo(0);
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    public CuentaCorriente(int p_nroCuenta, 
                        Persona p_titular, 
                        double p_saldo) 
    {
        this.setLimiteDescubierto(500.00);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
    }

    /** METODOS */
    
    //Setters
    /** @param p_nroCuenta de la cuenta corriente. */
    private void setNroCuenta(int p_nroCuenta) 
    {
        this.nroCuenta = p_nroCuenta;
    }
    
    /** @param p_saldo saldo de la cuenta corriente. */
    private void setSaldo(double p_saldo)
    {   
        this.saldo = p_saldo;
    }
    
    /** @param p_limite limite de descubierto posible en la cuenta corriente. */
    private void setLimiteDescubierto(double p_limite) 
    {
        this.limiteDescubierto = p_limite;
    }
    
    /** @param p_titular de la cuenta corriente. */ 
    private void setTitular(Persona p_titular) 
    {
        this.titular = p_titular;
    }
    
    //Getters
    /** @return nroCuenta de la cuenta corriente. */
    public int getNroCuenta() 
    {
        return this.nroCuenta;
    }
    
    /** @return saldo saldo de la cuenta corriente. */
    public double getSaldo()
    {   
        return this.saldo;
    }
    
    /** @return extraccionesPosibles extracciones posibles de la cuenta corriente. */
    public double getLimiteDescubierto() 
    {
        return this.limiteDescubierto;
    }
    
    /** @return titular persona titular de la cuenta. */
    public Persona getTitular() 
    {
        return this.titular;
    }
    
    //Metodos
    /**
     *  Evalua si el importe a retirar no supera el saldo 
     *  más el límite de descubierto autorizado. 
     *  
     *  @return true si puede extraer
     */
    private boolean puedeExtraer(double p_importe) 
    {   
        boolean permiso = p_importe <= (this.getSaldo() + this.getLimiteDescubierto());
        
        return permiso ? true : false;
    }
    
    /** 
     * Extrae un monto pasado por parametro.
     * 
     * @param p_importe importe a extraer
     */
    private void extraccion(double p_importe) 
    {
         this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Permite extraer dinero de una cuenta corriente.
     * 
     * @param p_importe el importe a extraer
     */
    public void extraer(double p_importe) 
    {
        if(!this.puedeExtraer(p_importe)) {
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        } else {
            this.extraccion(p_importe);
            System.out.println("Extracción: " + p_importe + ", nuevo monto: " + this.getSaldo());
        }
    }
    
    /**
     * Permite depositar dinero de una cuenta corriente.
     * 
     * @param p_importe el importe a depositar
     */
    public void depositar(double p_importe) 
    {
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /** 
     * Imprime la información de la cuenta corriente,
     * Nro cuenta, saldo, titular, descubierto.
     */
    public void mostrar() 
    {
        System.out.println(" – Cuenta Corriente –" + 
                           "\nNro. Cuenta: " + this.getNroCuenta() + 
                           " - Saldo: " + this.getSaldo() +    
                           "\nTitular: " + this.getTitular().nomYApe() + 
                           "\nDescubierto: " + this.getLimiteDescubierto());
    }
}
