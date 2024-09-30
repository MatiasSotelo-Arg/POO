
/**
 * La clase Circulo: permite saber las caracteristicas de dos circulos
 * como su perimetro, area y compararlo con otro circulo
 * 
 * @author (Sotelo Matias) 
 * @version (05/09/24)
 */

public class Circulo
{    
    public double radio;
    public Punto centro;
    
    /**
     * @param p_radio radio del circulo
     * @param p_centro centro del circulo
    */
    public Circulo (double p_radio, Punto p_centro)
    {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    public Circulo(){
        this.centro = new Punto();
        this.radio = 0;
    }
    
    //Setters
    private void setRadio(double p_radio)
    {
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_centro)
    {
        this.centro = p_centro;
    }
    
    //Getters 
    public double getRadio()
    {
        return this.radio;
    }
    
    public Punto getCentro()
    {
        return this.centro;
    }
    
    //Metodos
    /**
     * desplaza el centro del circulo utilizando el 
     * metodo de la clase punto
    */
    public void desplazar(double p_dx, double p_dy)
    {
        centro.desplazar(p_dx, p_dy);
    }
    
    /**
     * calcula el permitro del circulo
     * @return retorna el permitro del circulo
    */
    public double perimetro()
    {
        double perimetro = 2 * Math.PI * getRadio();
        return perimetro;
    }
    
    /**
     * calcula el area del circulo
     * @return retorna el area del circulo
    */
    public double superficie()
    {
        double area = Math.PI * Math.pow(getRadio(),2);
        return area;
    }
    
    /**
     * imprime las caracteristeicas del circulo. Centro/Radio/Perimetro/Area
    */
    public void caracteristicas()
    {
        System.out.println( "\n****** Circulo ****** \n " + "Centro: " 
        + getCentro()  + "- Radio: " + getRadio() + "\nSuperficie: " 
        + this.superficie() + "-Perimetro: " + this.perimetro() );
    }
    
    /**
     * calcula la distancia entre los centros de dos circulos 
     * @return retorna la distancia de un centro a otro
    */
    public double distanciaA(Circulo otroCirculo)
    {
        double x = this.getCentro().getX() - otroCirculo.getCentro().getX() ;
        double y = this.getCentro().getY() - otroCirculo.getCentro().getY() ;
        double cuadradoX = Math.pow(x, 2);
        double cuadradoY = Math.pow(y, 2);
        return Math.sqrt(cuadradoX + cuadradoY);
    }
    
    /**
     * Compara este círculo con otro círculo y devuelve el 
     * círculo con la mayor superficie.
     * @param otroCirculo El otro círculo con el que se compara
     * @return El círculo con la mayor superficie
     */
    public Circulo elMayor(Circulo otroCirculo)
    {
        if (this.superficie() > otroCirculo.superficie()){
            return this;
        }else{
            return  otroCirculo;
        }
    }
}

