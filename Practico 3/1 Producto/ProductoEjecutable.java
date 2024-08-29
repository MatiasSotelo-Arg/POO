
/**
 * @author (Sotelo Matias) 
 * @version (28/08/2024)
 */
public class ProductoEjecutable
{
    public static void main(String [] args) 
    {
        
            //Casos de prueba    

            Producto producto1 = new Producto(0, "Perfumes","Perfume Dior",100.00);
            
            System.out.println("costo: "+producto1.getCosto());
            System.out.println("stock valorizado: "+producto1.stockValorizado());
            System.out.println("precio lista: "+producto1.precioLista());
            System.out.println("precio contado: "+producto1.precioContado());
            System.out.println("stock: "+producto1.getStock());
            producto1.ajuste(30);
            System.out.println("nuevo stock: "+producto1.getStock());
            System.out.println("nuevo stock valorizado: "+producto1.stockValorizado());
            System.out.println();
            producto1.mostrar();
            System.out.println();
            System.out.println(producto1.mostrarLinea()); 
            
            
            Producto producto2 = new Producto(1, "Farmacia", "Curitas",5.00,10.0,30); 
            System.out.println();
            System.out.println("porcentaje:" + producto2.getPorcPtoRepo());
            System.out.println("minimo:" + producto2.getExistMinima());
            
            producto2.ajustarPtoRepo(15.0);
            producto2.ajustarExistMin(40);
            
            System.out.println();
            System.out.println("nuevo porcentaje:" + producto2.getPorcPtoRepo());
            System.out.println("nuevo minimo:" + producto2.getExistMinima());    
    }
}
