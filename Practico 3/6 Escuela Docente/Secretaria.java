
/**
 * Write a description of class Secretaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secretaria
{
    public static void main(String [] args) 
    {
        Escuela escuela = new Escuela("Leloir","La paz","La odiosa");
        Docente docente = new Docente("Teplizky","Tercero",1000,400);
        
        escuela.imprimirRecibo(docente);
    }
}
