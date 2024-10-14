/**
 * Write a description of class Gerencia here.
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
     * Constructor for objects of class Gerencia
     */
    public Gerencia(String p_nombre)
    {   
        this.setNombre(p_nombre);
        this.setAlojamientos(new ArrayList<Alojamiento>()); 
    }

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

    public int contarAlojamiento(String tipoAlojamiento)
    {
        int total = 0;

        for(Alojamiento a : this.getAlojamientos()) 
        {
            total += a.contar(tipoAlojamiento);
        }

        return total;
    }

    public void liquidar() 
    {   
        for (Alojamiento a : this.getAlojamientos()) {
            a.liquidar();
        }
    }

    public void mostrarLiquidacion() 
    {
        System.out.println("Gerencia " + this.getNombre() );
        System.out.println("Liquidación-------------------");


        System.out.println("Alojamiento tipo Cabaña ----> " + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel -------> " + this.contarAlojamiento("Hotel"));
    }
}
