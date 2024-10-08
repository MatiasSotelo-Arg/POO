
/**
 * Write a description of class Executable here.
 * 
 * @author (Sotelo Matias) 
 * @version (30/09/2024)
 */

import java.util.Calendar;

public class Executable
{
    public static void main() 
    {   

    Punto punto = new Punto();
            
    // Definición de los parámetros
    double ejeMayorCirculo = 5.0; 
    double ejeMenorCirculo = 5.0; 
    Punto centroCirculo = punto;

    double ejeMayorElipse = 8.0; 
    double ejeMenorElipse = 4.0; 
    punto.desplazar(2,3);
    Punto centroElipse = punto;

    // Creación de los objetos
    Circulo circulo = new Circulo(ejeMayorCirculo, ejeMenorCirculo, centroCirculo);
    Elipse elipse = new Elipse(ejeMayorElipse, ejeMenorElipse, centroElipse);

    circulo.caracteristicas();
    elipse.caracteristicas();

    }
}
