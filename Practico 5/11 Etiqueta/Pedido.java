
/**
 * La clase Pedido representa un conjunto de renglones que componen un pedido de etiquetas. 
 * Permite agregar renglones y mostrar detalles del pedido, incluyendo la cantidad de items, 
 * los renglones individuales y el importe total. 
 * 
 * @author (Sotelo Matias) 
 * @version (14/10/2024)
 */

import java.util.ArrayList;

public class Pedido
{
    //Atributos 
    private ArrayList<Renglon> renglones; 
    
    /**
     * Constructor de la clase Pedido.
     *
     * @param p_renglones La lista de renglones que componen el pedido.
     */
    public Pedido(ArrayList<Renglon> p_renglones)
    {
         this.setRenglones(p_renglones);
    }
    
    //Getters
    public ArrayList<Renglon> getRenglones()
    {
        return this.renglones;
    }
    
    //Setters
    private void setRenglones(ArrayList<Renglon> p_renglones)
    {
        this.renglones = p_renglones;
    }
    
    //Metodos
    /**
     * Agrega un renglon al pedido.
     *
     * @param p_renglones El renglon a agregar.
     * @return true si el renglon fue agregado con exito; false si no se pudo agregar.
     */
    public boolean agregarRenglones(Renglon p_renglones) 
    {
        return this.getRenglones().add(p_renglones);
    }
    
    /**
     * Muestra los detalles del pedido, incluyendo la cantidad de items,
     * cada renglon del pedido y el total de etiquetas e importe total.
     */
    public void mostrar()
    {
        int cantItems = this.getRenglones().size();
        int cont = 0;
        
        int cantTotal = 0;
        double importeTotal = 0;
            
        System.out.println("Pedido:\nCantidad de items: " + cantItems);   
        
        //Mostrar Renglones 
        for(Renglon renglon : this.getRenglones()) {
            System.out.print("Item " + cont++ + ": "); 
            renglon.mostrar();
            
            cantTotal += renglon.getCantidad();
            importeTotal +=  renglon.getItem().precio(renglon.getCantidad());
        }
        
        System.out.println("--- Total pedido: " + cantTotal + " Etiquetas por un importe total de: $ " + importeTotal);
    }
}
