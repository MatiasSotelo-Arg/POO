
/**
 * Write a description of class LaboratorioEjecutable here.
 * 
 * @author (Sotelo Matias) 
 * @version (21/08/2024)
 */
public class LaboratorioEjecutable
{
    public static void main(String [] args)
    {
        String nombre = "Colgate S.A";
        String domicilio = "Junin 5204";
        String telefono = "54-11 -4239-8447";
        
        Laboratorio lab1 = new Laboratorio(nombre, domicilio, telefono);
        
        System.out.println(lab1.mostrar());
        
    }
}
