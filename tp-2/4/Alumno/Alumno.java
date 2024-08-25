
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
    /**
    *	@param p_lu : libreta del alumno del alumno. 
    *	@param p_nombre : nombre de del alumno. 
    *	@param p_apellido : apellido del alumno.
    *	@param p_nota1 : primera nota del alumno.
    *	@param p_nota1 : segunda nota del alumno.
    */
    Alumno (int p_lu, String p_nombre, String p_apellido, double p_nota1, double p_nota2)
    {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(p_nota1);
        this.setNota2(p_nota2);
    }
    
    //Metodos
    /** @param p_lu libreta del alumno **/
    private void setLu(int p_lu)
    {
        this.lu = p_lu;
    }
    
    /** @param  p_nombre nombre del alumno **/
    private void setNombre( String p_nombre)
    {
        this.nombre = p_nombre;
    }
    
    /** @param p_apellido apellido del alumno **/
    private void setApellido(String p_apellido)
    {
        this.apellido = p_apellido;
    }

    /** @param  p_nota1 primer nota del alumno **/
    private void setNota1(double p_nota1)
    {
        this.nota1 = p_nota1;
    }
    
    /** @param  p_nota2 segunda nota del alumno **/
    private void setNota2(double p_nota2)
    {
        this.nota2 = p_nota2;
    }
    
    /** @return libreta del alumno **/
    public int getLu()
    {
        return this.lu;
    }
    
    /** @return nombre del alumno **/
    public String getNombre()
    {
        return this.nombre;
    }

    /** @return apellido del alumno **/    
    public String getApellido()
    {
        return this.apellido;
    }
    
    /** @return primer nota del alumno **/
    public double getNota1()
    {
        return this.nota1;
    }
    
    /** @return segunda nota del alumno **/
    public double getNota2()
    {
        return this.nota2;
    }
    
    /** 
    *	Evalua si el promedio es > 7 y ambas notas 
    *	son > a 6. 
    *
    *	@return true o false 
    */
    private boolean aprueba()
    {
        if(this.promedio(this.getNota1(), this.getNota2()) > 7 
        && this.getNota1() > 6 && this.getNota2() > 6 )
        {
            return true;
        }else
        {
            return false;
        }
    }

    /** 
    *	Calcula el promedio del alumno según sus notas.
    *
    *	@return promedio de las notas
    */
    public double promedio(double nota1, double nota2)
    {
        return (this.getNota1() + this.getNota2()) / 2;
    }
    
    /** 
    *	Imprime Leyenda informando si el alumno
    *	aprobó o desaprobó.
    *
    *	@return leyenda 
    */
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
    
	
    /**  
    *	Concatena el nombre y apellido del Alumno.
    *
    *	@return nombre y apellido 
    */
    public String nomYApe(String nombre, String Apellido)
    {
        return  this.getNombre() + " " + this.getApellido();
    }
    
    /**  
    *	Concatena el apellido y nombre del Alumno.
    *	
    *	@return apellido y nombre 
    */
    public String apeYNom(String nombre, String Apellido)
    {
        return  this.getApellido() + " " + this.getNombre();
    }
    
    /** 
    *	Imprime la informacion del alumno,
    *	Nombre, Apellido, Notas, Promedio, Leyenda. 
    */
    public void mostrar()
    {
        System.out.println("Nombre y Apellido: " + this.nomYApe(nombre, apellido) + "\n" +
        "LU: " + this.getLu() + "Notas: " + this.getNota1() + "-" + this.getNota2() + "\n" + 
        "PROMEDIO: " + this.promedio(nota1, nota2) + "-" + this.leyendaAprueba());    
    }
    
}
