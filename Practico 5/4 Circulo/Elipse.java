/**
 * Write a description of class Elipse here.
 * 
 * @author (Sotelo Matias) 
 * @version (30/09/2024)
 */

import java.lang.Math;

public class Elipse
{
    private double sEjeMayor;
    private double sEjeMenor;
    Punto centro; 

    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro)
    {
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
        this.setCentro(p_centro);
    }

    //Setters 
    private void setSEjeMayor(double p_sEjeMayor) 
    {
         this.sEjeMayor = p_sEjeMayor;
    }

    private void setSEjeMenor(double p_sEjeMenor) 
    {
        this.sEjeMenor = p_sEjeMenor;
    }

    private void setCentro(Punto p_centro) 
    {
        this.centro = p_centro;
    }

    //Getters
    public double getSEjeMayor() 
    {
        return this.sEjeMayor;
    }

    public double getSEjeMenor() 
    {
        return this.sEjeMenor;
    }

    public Punto getCentro() 
    {
        return this.centro;
    }

    //Metodos
    public String nombreFigura() 
    {
        return "****** Elipse ******";   
    }

    public void caracteristicas() 
    {
        System.out.println(this.nombreFigura());
        System.out.println("Centro: (5.0, 3.0) - Semieje Mayor: 20.44 - Semieje Menor: 46.86");
        System.out.println("Superficie: " + this.superficie());
    }

    public double superficie() 
    {
        if(this.getSEjeMayor() == this.getSEjeMenor()) {
            return Math.PI * Math.pow(this.getSEjeMayor(), 2);
        }  else 
        {
            return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
        }
    }

    void desplazar(double p_dx, double p_dy) 
    {
        getCentro().desplazar(p_dx, p_dy);
    } 

    /* double distanciaA(Elipse otraElipse) 
    {

    } */

    Elipse elMayor(Elipse otraElipse) 
    {
        if(this.superficie() > otraElipse.superficie())
        {
            return this;
        }
        else 
        {
            return otraElipse;
        }
    }

}
