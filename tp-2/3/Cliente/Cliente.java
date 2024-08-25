/**
 *	La Clase Cliente permite llevar el seguimiento del
 *	saldo de un cliente con la posibilidad de agregar un
 *	saldo nuevo al ya existente.
 * 
 *	@author (Sotelo Matias) 
 *	@version (22/08/2024)
 */

public class Cliente
{
    //Atributos
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    //Constructor
    /**
    * @param p_nroDNI: numero del cliente . 
    * @param p_apellido : apellido del cliente . 
    * @param p_nombre : nombre del cliente.
    * @param p_saldo : saldo del cliente.
    */  
    public Cliente(int p_dni, String p_apellido, 
    String p_nombre, double p_importe)
    {
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }

    //Metodos
    /** @param p_dni : DNI del cliente .*/
    private void setDni(int p_dni) 
    {
        this.nroDNI = p_dni;
    }

    /**@param p_apellido : apellido del cliente .*/
    private void setApellido(String p_apellido) 
    {
        this.apellido = p_apellido;
    }
    
    /**@param p_nombre : nombre del cliente.*/
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    /**@param p_saldo : saldo del cliente.*/
    private void setSaldo(double p_importe)
    {
        this.saldo = p_importe;
    }
    
    /** @return el dni del cliente  */
    public int getDni() 
    {
        return this.nroDNI;
    }
    
    /** @return el nombre del cliente  */
    public String getNombre() 
    {
        return this.nombre;
    }
    
    /** @return el apellido del cliente */
    public String getApellido() 
    {
        return this.apellido;
    }
    
    /** @return el saldo del cliente */
    public double getSaldo() 
    {
        return this.saldo;
    }
    
    /** 
    *   Concatena el apellido y nombre del cliente.
    * 
    *   @return apellido y nombre 
    **/
    public String apeYNom() 
    {
        return this.getApellido() + " " + this.getNombre();
    }   
    
    /**  
    *  Concatena el nombre y apellido del cliente.
    *
    *  @return el nombre y apellido 
    **/
    public String nomYApe() 
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /** 
    *   Reemplaza el saldo actual por p_importe y devuelve el nuevo saldo.
    * 
    *   @return retorna el saldo 
    *   @param p_importe importe nuevo 
    */
    public double nuevoSaldo(double p_importe) 
    {
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    /** 
    *   Suma el saldo existente con el importe agregado
    * 
    *   @return retorna el saldo 
    *   @param  p_importe importe nuevo 
    */
    public double agregaSaldo(double p_importe)
    {
        double nuevoImporte = this.getSaldo() + p_importe;
        this.nuevoSaldo(nuevoImporte);
        return this.getSaldo(); 
    }

    /** Imprime la información del cliente Nombre y Apellido, 
    *   DNI, saldo.
    */
    public void mostrar() 
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe() + " (" 
        + this.getDni() + ")\nSaldo: $" + this.getSaldo());
    } 
}
