
/**
 * Write a description of class Comercio here.
 * 
 * @author (Sotelo Matias) 
 * @version (08/10/2024)
 */
public class Comercio
{
    public static void main()
    {
        //Cocina
        Cocina cocina = new Cocina("Volcan",600,10,4,2000,"80*60*60cm");
        
        //Heladera
        Heladera heladera0 = new Heladera("Gafa",1200,8,11,2,true);
        Heladera heladera1 = new Heladera("Gafa",1200,8,11,2,false);
        
        //Lavarropas 
        Lavarropas lavarropas0 = new Lavarropas("Drean",700,7,3,8,true);
        Lavarropas lavarropas1 = new Lavarropas("Drean",700,7,3,8,false);
        
        int cuotas = 6;
        float interes = 2.53F;   
        
        cocina.imprimir();
        cocina.cuotaCredito(cuotas,interes);
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + cocina.cuotaCredito(cuotas,interes));        
        System.out.println("Valor Cuota Con Adicionales: " + cocina.creditoConAdicional(cuotas,interes));
        
        heladera0.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + heladera0.cuotaCredito(cuotas,interes));        
        System.out.println("Valor Cuota Con Adicionales: " + heladera0.creditoConAdicional(cuotas,interes));
        
        heladera1.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + heladera1.cuotaCredito(cuotas,interes));        
        System.out.println("Valor Cuota Con Adicionales: " + heladera1.creditoConAdicional(cuotas,interes));
        
        lavarropas0.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + lavarropas0.cuotaCredito(cuotas,interes));        
        System.out.println("Valor Cuota Con Adicionales: " + lavarropas0.creditoConAdicional(cuotas,interes));
        
        lavarropas1.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " + interes + "%");
        System.out.println("Valor Cuota: " + lavarropas1.cuotaCredito(cuotas,interes));        
        System.out.println("Valor Cuota Con Adicionales: " + lavarropas1.creditoConAdicional(cuotas,interes));
    }
}
