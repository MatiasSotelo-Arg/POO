
/**
 * Write a description of class Curso here.
 * 
 * @author (Sotelo Matias) 
 * @version (17/09/2024)
 */

import java.util.HashMap;
import java.util.Map;

public class Curso
{  
    //Atributos
    private String nombre;
    HashMap <Integer, Alumno> alumnos;
    
    /**
     * Constructor for objects of class Curso
     */
    public Curso(String p_nombre)
    {
       this.setNombreCurso(p_nombre);
       this.setAlumnos(new HashMap<>());
    }

    public Curso(String p_nombre, HashMap p_alumnos)
    {
        this.setNombreCurso(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    //Setter
    private void setNombreCurso(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    private void setAlumnos(HashMap<Integer, Alumno> p_alumno) 
    {
        this.alumnos = p_alumno;
    }
    
    //Getter
    public HashMap<Integer, Alumno> getAlumnos() {
        return this.alumnos;  
    }

    //Metodos
    public void inscribirAlumno(Alumno p_alumno) 
    {
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno );
    }
    
    public Alumno quitarAlumno(int p_lu) 
    {
        return this.getAlumnos().remove(p_lu);
    }
    
    public int cantidadDeAlumnos()
    {
        return this.getAlumnos().size();
    }
    
    public boolean estaInscripto(int p_lu) 
    {
        return this.buscarAlumno(p_lu) != null;
    }
    
    public boolean estaInscripto(Alumno p_alumno)
    {
        return this.getAlumnos().get(p_alumno) != null;
    }
    
    public Alumno buscarAlumno(int p_lu) 
    {
        return this.getAlumnos().get(p_lu);
    }
    
    public void imprimirPromedioDelAlumno(int p_lu)
    {
        Alumno alumno = this.buscarAlumno(p_lu);
        
        double n1 = alumno.getNota1(); 
        double n2 = alumno.getNota2();
        
        double promedio = alumno != null ? n1 + n2 / 2 : -1; 
        
        if (promedio != -1) 
        {
            System.out.println("Promedio: " + promedio);
        } else 
        {
            System.out.println("No se encuentra el alumno");
        }   
    }
    
    public void mostrarInscriptos()
    {
        for(Map.Entry<Integer, Alumno> e : this.getAlumnos().entrySet()) 
        {
            Integer lu = e.getKey();
            String alumno = e.getValue().nomYApe();

            System.out.println(lu + " " + alumno);
        }
    }
}
