
/**
 * Write a description of class Curso here.
 * 
 * @author (Sotelo Matias) 
 * @version (17/09/2024)
 */

import java.util.HashMap;

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
       this.setAlumnos(new HashMap<>());
       this.setNombreCurso(p_nombre);
    }

    public Curso(String p_nombre, HashMap p_alumnos)
    {
        
        if(this.cantidadDeAlumnos() != 0) {
            
            for (Object alumno : p_alumnos.keySet()) {
                this.inscribirAlumno(alumno);
            }
            
        } else {

            this.setNombreCurso(p_nombre);
            this.setAlumnos(new HashMap<>());
        }
        
    }
    
    //Setter
    public void setNombreCurso(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    
    public void setAlumnos(HashMap<Integer, Alumno> p_alumno) 
    {
        this.alumnos = p_alumno;
    }
    
    //Getter
    
    //Metodos
    
}
