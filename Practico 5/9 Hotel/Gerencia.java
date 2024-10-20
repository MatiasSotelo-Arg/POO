/**
 * La clase Gerencia gestiona una lista de alojamientos alquilados, 
 * permitiendo agregar o quitar alojamientos y calcular el total 
 * de alojamientos de un tipo especifico. 
 *
 * Se encarga de liquidar todos los alojamientos y mostrar la informacion 
 * de liquidacion de la gerencia.
 * 
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */

import java.util.ArrayList;

public class Gerencia
{
    //Atributos
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados; 

    /**
     * Constructor de la clase Gerencia con solo un nombre.
     *
     * @param p_nombre El nombre de la gerencia.
     */
    public Gerencia(String p_nombre)
    {   
        this.setNombre(p_nombre);
        this.setAlojamientos(new ArrayList<Alojamiento>()); 
    }

    /**
     * Constructor de la clase Gerencia con un nombre y una lista de alojamientos.
     *
     * @param p_nombre El nombre de la gerencia.
     * @param p_alojamientos La lista de alojamientos asociados a la gerencia.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos)
    {
        this.setNombre(p_nombre);
        this.setAlojamientos(p_alojamientos);
    }

    //Getters
    public String getNombre() 
    {
        return this.nombre;
    }

    public ArrayList<Alojamiento> getAlojamientos()  
    {
        return this.alojamientosAlquilados;
    }

    //Setters 
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }

    private void setAlojamientos(ArrayList<Alojamiento> p_alojamientos) 
    {
        this.alojamientosAlquilados = p_alojamientos;
    }

    //Metodos
    /**
     * Agrega un alojamiento a la lista de alojamientos de la gerencia.
     *
     * @param p_alojamiento El alojamiento a agregar.
     * @return true si el alojamiento fue agregado con exito; false si el alojamiento ya existe en la lista.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento) 
    {
        ArrayList<Alojamiento> alojamientos = this.getAlojamientos();
        
        if(!alojamientos.contains(p_alojamiento)) 
        {
            alojamientos.add(p_alojamiento);
            return true;
        } else 
        {
            return false;
        }
    }

    /**
     * Quita un alojamiento de la lista de alojamientos de la gerencia.
     *
     * @param p_alojamiento El alojamiento a quitar.
     * @return true si el alojamiento fue eliminado con exito; false si el alojamiento no esta en la lista.
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento) 
    {
        ArrayList<Alojamiento> alojamientos = this.getAlojamientos();

        if(alojamientos.contains(p_alojamiento)) 
        {
            alojamientos.remove(p_alojamiento);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cuenta la cantidad de alojamientos de un tipo especifico.
     *
     * @param tipoAlojamiento El tipo de alojamiento a contar.
     * @return El numero total de alojamientos del tipo especificado.
     */
    public int contarAlojamiento(String tipoAlojamiento)
    {
        int total = 0;

        for(Alojamiento a : this.getAlojamientos()) 
        {
            total += a.contar(tipoAlojamiento);
        }

        return total;
    }

    /**
     * Liquida todos los alojamientos de la lista,
     * utilizando el metodo liquidar de cada alojamiento.
     */
    public void liquidar() 
    {   
        for (Alojamiento a : this.getAlojamientos()) {
            a.liquidar();
        }
    }

    /**
     * Muestra la informacion de liquidacion de la gerencia,
     * incluyendo el nombre de la gerencia y llamando al metodo
     * liquidar.
     */
    public void mostrarLiquidacion() 
    {
        System.out.println("Gerencia " + this.getNombre() );
        System.out.println("Liquidación-------------------");
        this.liquidar();
    }
}
