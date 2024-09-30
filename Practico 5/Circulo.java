
/**
 * Write a description of class Circulo here.
 * 
 * @author (Sotelo Matias) 
 * @version (30/09/2024)
 */

public class Circulo extends Elipse
{
    public Circulo(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro) 
    {
        super(p_sEjeMayor, p_sEjeMenor, p_centro);
    }

    //Metodos
    public String nombreFigura() 
    {
        return "****** Circulo ******";   
    }

}
