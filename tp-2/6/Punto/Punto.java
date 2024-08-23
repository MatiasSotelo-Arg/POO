
/**
 * Write a description of class Punto here.
 * 
 * @author (Sotelo Matias) 
 * @version (23/08/2024)
 */
public class Punto
{
    //Atributos
    private double x;
    private double y;
    
    //Constructor 
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
    private void setX(double p_x) 
    {
        this.x = p_x;
    }
    
    private void setY(double p_y) 
    {
        this.y = p_y;  
    }
    
    public double getX() 
    {
        return this.x;
    }
    
    public double getY() 
    {
        return this.y;
    }
    
    public void desplazar(double p_dx, double p_dy) 
    {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    public String coordenadas() 
    {
        return "(" + this.getX() + " , " + this.getY() + ")";
    }
    
    public void mostrar() 
    {
        System.out.println("\nPunto. X: " + this.getX() + ", " + "Y: " + this.getY());
    }
}
