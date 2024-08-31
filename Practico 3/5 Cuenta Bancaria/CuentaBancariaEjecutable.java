
/**
 * Write a description of class CuentaBancariaEjecutable here.
 * 
 * @author (Sotelo Matias) 
 * @version (30/08/2024)
 */
public class CuentaBancariaEjecutable
{
    public static void main(String [] args) 
    {
        //Casos de pruebas
        Persona titular = new Persona(1234,"Matias","Sotelo",1999);
        CuentaBancaria cuenta = new CuentaBancaria(001,titular);
        
        cuenta.mostrar();
        
        System.out.println();
        
        System.out.println(cuenta.toString());
        
        cuenta.depositar(1000);
        System.out.println(cuenta.toString());
        
        cuenta.extraer(300);
        System.out.println(cuenta.toString());
    }
}
