
/**
 *	La Clase Punto permite crear, desplazar y mostrar 
 *	las coordenadas de un punto.
 * 
 *	@author (Sotelo Matias) 
 *	@version (23/08/2024)
 */
public class Punto
{
    //Atributos
    private double x;
    private double y;
    
    //Constructor 
    /**
    *	@param p_x eje x del punto
    *	@param p_y eje y del punto
    public Punto()
    {
        this.setX(0);
        this.setY(0);
    }
    
    public Punto(double p_x, double p_y) 
    {
        this.setX(p_x);
        this.setY(p_y);
    }

    //Metodos
    /** @param p_x */
    private void setX(double p_x) 
    {
        this.x = p_x;
    }
    
    /** @param p_y */
    private void setY(double p_y) 
    {
        this.y = p_y;  
    }
    
    /** @return x */
    public double getX() 
    {
        return this.x;
    }
    
    /** @param y */
    public double getY() 
    {
        return this.y;
    }
    
    /** 
    *	Suma el valor a desplazar a las 
    *	actuales coordenadas.	
    *
    *	@param p_dx
    *   @param p_dy
    */
    public void desplazar(double p_dx, double p_dy) 
    {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /** 
    *	Concatena los valores actuales 
    *	de las coordenadas.	
    *
    *	@return un string con las coordenadas
    */
    public String coordenadas() 
    {
        return "(" + this.getX() + " , " + this.getY() + ")";
    }
    
    /** 
    *	Imprime los valores actuales 
    *	de las coordenadas.	
    *
    */
    public void mostrar() 
    {
        System.out.println("\nPunto. X: " + this.getX() + ", " + "Y: " + this.getY());
    }
}
