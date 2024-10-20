
/**
 * Write a description of class EjecutablePedido here.
 * 
 * @author (Sotelo Matias) 
 * @version (14/10/2024)
 */

import java.util.ArrayList;

public class EjecutablePedido
{
   public static void main() 
   {
      Etiqueta etiqueta1 = new Premium(200.0, 10);
      Etiqueta etiqueta2 = new Comun(100.0, 100.0);
      Etiqueta etiqueta3 = new Premium(200.0, 7);
      
      Renglon renglon1 = new Renglon(7, 200.0, etiqueta1); 
      Renglon renglon2 = new Renglon(57, 100.0, etiqueta2); 
      Renglon renglon3 = new Renglon(94, 200.0, etiqueta3); 
      
      ArrayList<Renglon> renglones = new ArrayList<>();
      renglones.add(renglon1);
      renglones.add(renglon2);
      renglones.add(renglon3);
      
      Pedido pedido = new Pedido(renglones);
      
      pedido.mostrar();
      
      
      
   }
}
