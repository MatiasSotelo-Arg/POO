
/**
 * Write a description of class Banco here.
 * 
 * @author (Sotelo Matias) 
 * @version (01/09/2024)
 */
public class Banco
{
    public static void main(String [] args) 
    {
        /* Casos de prueba */
        Persona titular = new Persona(123,"Matias", "Sotelo", 1999);
        //Cuenta Corriente
        CuentaCorriente cc = new CuentaCorriente(001,titular,1000.00);
        
        cc.mostrar();
        System.out.println();
        cc.extraer(1600.00);
        System.out.println();
        cc.extraer(1400);
        cc.extraer(100);
        System.out.println();
        cc.mostrar();
        
    }
}
