
/**
 * Write a description of class Alumno here.
 * 
 * @author (Sotelo Matias) 
 * @version (23/08/2024)
 */
public class Alumno
{
    //Atributos
        private int lu;
        private String nombre;
        private String apellido;
        private double nota1 = 0;
        private double nota2 = 0;
        
    //Constructor
    Alumno (int p_lu, String p_nombre, String p_apellido, double p_nota1, double p_nota2)
    {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }
    
    //Metodos
    private void setLu(int p_lu)
    {
        this.lu = p_lu;
    }
    
    private void setNombre( String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }
    
    private void setNota1(double p_nota1)
    {
        this.nota1 = p_nota1;
    }
    
    private void setNota2(double p_nota2)
    {
        this.nota2 = p_nota2;
    }
    
    public int getLu()
    {
        return this.lu;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public double getNota1()
    {
        return this.nota1;
    }
    
    public double getNota2()
    {
        return this.nota2;
    }
    
    private boolean aprueba()
    {
        if(this.promedio( this.getNota1(), this.getNota2()) > 7 
        && this.getNota1() > 6 && this.getNota2() > 6 )
        {
            return true;
        }else
        {
            return false;
        }
        
    }
    
    public double promedio(double nota1, double nota2)
    {
        return (this.getNota1() + this.getNota2()) / 2;
    }
    
    private String leyendaAprueba()
    {
        if(this.aprueba())
        {
            return "APROBADO";        
        }else
        {
            return "DESAPROBADO";
        }
    }
    
    public String nomYApe(String nombre, String Apellido)
    {
        return  this.getNombre() + " " + this.getApellido();
    }
    
    public String apeYNom(String nombre, String Apellido)
    {
        return  this.getApellido() + " " + this.getNombre();
    }
    
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe(nombre, apellido) + "\n" +
        "LU: " + this.getLu() + "Notas: " + this.getNota1() + "-" + this.getNota2() + "\n" + 
        "PROMEDIO: " + this.promedio(nota1, nota2) + "-" + this.leyendaAprueba());    
    }
    
}
