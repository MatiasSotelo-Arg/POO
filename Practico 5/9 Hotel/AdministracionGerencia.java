
/**
 * Write a description of class AdministracionGerencia here.
 * 
 * @author (Sotelo Matias) 
 * @version (13/10/2024)
 */
public class AdministracionGerencia
{
    public static void main() 
    {
        Gerencia gerencia = new Gerencia("los arrollos");
                
        Servicio auto = new Servicio("alquiler auto", 100);
        Servicio lavanderia = new Servicio("lavanderia", 20);
        Servicio internet = new Servicio("internet", 5);
        
        Alojamiento cabaña = new Cabaña("Cabaña", 210, 5, 3); 
        Alojamiento hotel = new Hotel("Hotel", 90, 5,"Single"); 

        cabaña.agregarServicio(auto);
        cabaña.agregarServicio(lavanderia);
        
        hotel.agregarServicio(auto);
        hotel.agregarServicio(internet);
        
        gerencia.agregarAlojamiento(cabaña);
        gerencia.agregarAlojamiento(hotel);
        
        gerencia.mostrarLiquidacion();
        
        System.out.println("Alojamiento tipo Cabaña ----> " + gerencia.contarAlojamiento("Cabaña"));    
        System.out.println("Alojamiento tipo Hotel ----> " + gerencia.contarAlojamiento("Hotel"));    
    }
}
