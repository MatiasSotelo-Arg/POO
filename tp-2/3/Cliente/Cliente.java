/**
 * Write a description of class Cliente here.
 * 
 * @author (Sotelo Matias) 
 * @version (22/08/2024)
 */
public class Cliente
{
    //Atributos
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    //Constructor
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
    private void setDni(int p_dni) 
    {
        this.nroDNI = p_dni;
    }
    
    private void setApellido(String p_apellido) 
    {
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    private void setSaldo(double p_importe)
    {
        this.saldo = p_importe;
    }
    
    public int getDni() 
    {
        return this.nroDNI;
    }
    
    public String getNombre() 
    {
        return this.nombre;
    }
    
    public String getApellido() 
    {
        return this.apellido;
    }
    
    public double getSaldo() 
    {
        return this.saldo;
    }
    
    public String apeYNom() 
    {
        return this.getApellido() + " " + this.getNombre();
    }   
    
    public String nomYApe() 
    {
        return this.getNombre() + " " + this.getApellido();
    }
    
    public double nuevoSaldo(double p_importe) 
    {
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    public double agregaSaldo(double p_importe)
    {
        double nuevoImporte = this.getSaldo() + p_importe;
        this.nuevoSaldo(nuevoImporte);
        return this.getSaldo(); 
    }

    public void mostrar() 
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe() + " (" 
        + this.getDni() + ")\nSaldo: $" + this.getSaldo());
    } 
}
