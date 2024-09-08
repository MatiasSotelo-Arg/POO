
/**
 * Write a description of class Banco here.
 * 
 * @author (Sotelo Matias) 
 * @version (01/09/2024)
 */

import java.util.Scanner;

public class Banco
{
    public static void main(String [] args) 
    { 
        /* 
            Implementar una clase ejecutable Banco, donde instancie 1 caja de ahorro y 1 
            cuenta corriente, ambas para un mismo titular. 

            Luego realice depósitos y extracciones, con los importes necesarios para 
            verificar todas las opciones.
            
            Ingresar los datos por teclado, utilizando la clase Scanner
        */
           
        Scanner teclado = new Scanner(System.in);           
        
        System.out.println("Datos Titular\nDNI: ");
        int dni = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Apellido: ");
        String apellido = teclado.nextLine();
        
        System.out.println("Año Nacimiento: ");
        int anioNacimiento = teclado.nextInt();
        teclado.nextLine(); 
        
        Persona titular = new Persona(dni,nombre,apellido,anioNacimiento);
        
        int nroCuenta = 0;
        int montoDepositar = 0;
        
        System.out.println("Nueva Cuenta Corriente\nNro Cuenta: ");
        nroCuenta = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Monto Inicial: ");
        montoDepositar = teclado.nextInt();
        teclado.nextLine();
        
        CuentaCorriente cc = new CuentaCorriente(nroCuenta,titular,montoDepositar);
         
        System.out.println("Nueva Caja de Ahorro\nNro Cuenta: ");
        nroCuenta = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Monto Inicial: ");
        montoDepositar = teclado.nextInt();
        teclado.nextLine();
        
        CajaAhorro ca = new CajaAhorro(nroCuenta,titular,montoDepositar);
               
        /* 
        // Casos de prueba 
        Persona titular = new Persona(123,"Matias", "Sotelo", 1999);
        CuentaCorriente cc = new CuentaCorriente(001,titular,1000.00);
        CajaAhorro ca = new CajaAhorro(001,titular,2000.00);
        */
           
        titular.mostrar();
       
        //Cuenta Corriente
        cc.mostrar();
        System.out.println();
        cc.extraer(1600.00);
        System.out.println();
        cc.extraer(1400);
        cc.extraer(100);
        System.out.println();
        cc.mostrar();
        
        //Caja de Ahorro 
        ca.mostrar();
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.extraer(10);
        ca.depositar(100);
        ca.mostrar();
    }
}
