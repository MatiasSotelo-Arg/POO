
/**
 * Write a description of class ClienteEjecutable here.
 * 
 * @author (Sotelo Matias) 
 * @version (22/08/2024)
 */
public class ClienteEjecutable
{
    public static void main(String [] args) 
    {
        //cast valores para atributos
        int dni = Integer.valueOf(args[0]);
        String apellido = String.valueOf(args[1]);
        String nombre = String.valueOf(args[2]);
        double saldo = Double.valueOf(args[3]);
        
        //creo objeto
        Cliente cli1 = new Cliente(dni,apellido,nombre,saldo);
        
        cli1.mostrar();
        
        //agrego saldo
        cli1.agregaSaldo(50.0);
        
        //muestro cliente actualizado 
        System.out.println("\ncliente actualizado");
        cli1.mostrar();
    }
}
