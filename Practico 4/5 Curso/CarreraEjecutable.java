
/**
 * Write a description of class Carrera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.HashMap;

public class CarreraEjecutable
{
    public static void main() {
        
       HashMap<Integer, Alumno> map = new HashMap<>(); 
        
       Alumno alum1 = new Alumno(123, "Matias", "Sotelo", 10, 9);
       Alumno alum2 = new Alumno(124, "Ana", "García", 8, 7);
       Alumno alum3 = new Alumno(125, "Luis", "Pérez", 9, 10);
       Alumno alum4 = new Alumno(126, "Sofia", "Martínez", 6, 8);
       Alumno alum5 = new Alumno(127, "Carlos", "Lopez", 7, 9);
        
       map.put(1, alum1);
       map.put(2, alum2);
       map.put(3, alum3);
       map.put(4, alum4);
       map.put(5, alum5);
   
       Curso curso = new Curso("POO",map);
       
    
    }
}
