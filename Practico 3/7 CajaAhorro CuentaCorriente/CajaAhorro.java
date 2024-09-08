/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (Sotelo Matias) 
 * @version (07/09/2024)
 */
public class CajaAhorro
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
    public CajaAhorro(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.00);
        this.setExtPosibles(10);
    }
    
    public CajaAhorro(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtPosibles(10);
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
    /**
     * Evalua si puede extraer un monto al saldo disponible.
     * 
     * @param p_importe el importe a extraer
     * @return boolean true o false
     */
    private boolean puedeExtraer(double p_importe) 
    {
        boolean permiso = p_importe <= this.getSaldo() && this.getExtPosibles() > 0;
        
        return permiso ? true : false;
    }
    
    /** 
     * Coordina la operacion de extraer, si no se puede imprime un mensaje, 
     * de lo contrario realiza la operacion.
     * 
     * @param p_importe el importe a extraer
     */
    public void extraer(double p_importe)
    {
        if(! this.puedeExtraer(p_importe)) 
        {   
            //Evalua cant. de extracciones
            if(this.getExtPosibles() <= 0)
            {
                System.out.println("No tiene habilitadas mas extracciones!");
            }
            
            //Evalua el monto del importe
            if(this.getSaldo() < p_importe)
            {
                System.out.println("No puede extraer mas que el saldo!");   
            }
        } else 
        {
            //Extrae un importe
            this.extraccion(p_importe);
        }
    }    

    /**
     * Realiza la extraccion actualizando el saldo 
     * y decrementa las extraccones posibles. 
     * 
     * @param p_importe el importe a extraer
     */
    public void extraccion(double p_importe) 
    {
        double nuevoImporte = this.getSaldo() - p_importe;
        int actExtracciones = this.getExtPosibles() - 1;
        
        this.setSaldo(nuevoImporte);

        this.setExtPosibles(actExtracciones);
    }
    
    /** 
     * Permite agregar un nuevo importe al saldo. 
     * 
     * @param p_importe el importe a extraer
     */
    public void depositar(double p_importe)
    {
        double nuevoMonto = this.getSaldo() + p_importe;
        
        this.setSaldo(nuevoMonto);
    }
    
    /**
     * Imprime la informacion del titular de la caja de ahorro.
     */
    public void mostrar() 
    {
        System.out.println("\n – Caja de Ahorro – " + 
        "\nNro. Cuenta: " + this.getNroCuenta() +
        " - Saldo: " + this.getSaldo() + 
        "\nTitular: " + this.titular.nomYApe() +
        "\nExtracciones posibles: " + this.getExtPosibles());
    }
}