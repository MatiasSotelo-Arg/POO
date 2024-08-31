/**
 * La clase CuentaBancaria gestiona las cuentas bancarias, 
 * permite crear una nueva, hacer depositos, extraer dinero, 
 * imprimir info de la cuenta, concatena info de la cuenta.
 * 
 * @author (Sotelo Matias) 
 * @version (30/08/2024)
 */
public class CuentaBancaria
{
    //Atributos
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor 
     * 
     * @param p_nroCuenta numero de cuenta bancaria
     * @param p_titular titular de la cuenta bancaria
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.titular = p_titular;
    }
    
    public CuentaBancaria(int p_nroCuenta, 
                          Persona p_titular,
                          double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
    }
    
    /** METODOS */
    
    //Setters
    /** @param p_nroCuenta numero de cuenta bancaria **/
    private void setNroCuenta(int p_nroCuenta) 
    {
        this.nroCuenta = p_nroCuenta;    
    }
    
    /** @param p_saldo de la cuenta bancaria */
    private void setSaldo(double p_saldo) 
    {
        this.saldo = p_saldo;
    }
    
    //Getters
    /** @return p_nroCuenta numero de cuenta bancaria **/
    private int getNroCuenta() 
    {
        return this.nroCuenta;
    }
    
    /** @return p_saldo de la cuenta bancaria */
    private double getSaldo() 
    {
        return this.saldo;
    }
    
    //Metodos 
    /**
     * Agrega el importe pasado por parametro 
     * al saldo actual de la cuenta. 
     * 
     * @param p_importe el importe a aumentar
     * @return saldo el saldo actualizado
     */
    public double depositar(double p_importe) 
    {
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     * Extrae el importe pasado por parametro
     * al saldo actual de la cuenta.
     *
     * @param p_importe el importe extraido
     * @return saldo el saldo actualizado
     */
    public double extraer(double p_importe) 
    {
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
        
    /**
     * Imprime en pantalla Info de cuenta Bancaria
     * Titular, Nombre, Apellido, Edad, Saldo.
     */
    public void mostrar() 
    {
        System.out.println("- Cuenta Bancaria -\nTitular: " + 
        titular.nomYApe() + " (" + titular.edad() + "años)\n" +
        "Saldo: " + this.getSaldo());
    }
    
    /**
     * Concatena numero cuenta, nombre, apellido y saldo.
     * 
     * @return texto un texto con la info. concatenada
     */
    public String toString() 
    {
        return this.getNroCuenta() + " " + titular.nomYApe() + 
        " " + this.getSaldo();
    }
}
