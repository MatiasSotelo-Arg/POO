
/**
 * Write a description of class PuntoEjecutable here.
 * 
 * @author (Sotelo Matias) 
 * @version (23/08/2024)
 */
import java.util.*;

public class PuntoEjecutable
{
    public static void main(String [] args) 
    {
        Scanner scanner = new Scanner(System.in);        
        
        double x, y;
        
        //Instancio Objeto 1
        Punto p1 = new Punto();
        
        System.out.print("Punto p1 sin parametros\n");
        p1.mostrar();
        
        //Instancio Objeto 2
        System.out.print("\nPunto p2 con parametros\n");
        
        System.out.print("Ingrese X: ");
        x = scanner.nextDouble();
        
        System.out.print("Ingrese Y: ");
        y = scanner.nextDouble();
       
        Punto p2 = new Punto(x,y);
        
        p2.mostrar();
        
        System.out.print("\nDesplazar punto p2\n");
        System.out.print("X: ");
        x = scanner.nextDouble();
        
        System.out.print("Y: ");
        y = scanner.nextDouble();
        
        p2.desplazar(x,y);
        
        System.out.print("\nPunto p2 desplazado\n");
        p2.mostrar();
        
        System.out.println("\nCoordenadas");
        System.out.println("p1: " + p1.coordenadas());
        System.out.println("p2: " + p2.coordenadas());
    }
}
