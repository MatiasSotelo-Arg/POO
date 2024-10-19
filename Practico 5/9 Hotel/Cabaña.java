
/**
 * Write a description of class Cabaña here.
 * 
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */
public class Cabaña extends Alojamiento
{
    //Atributos 
    private double nroHabitacion;

    /**
     * Constructor for objects of class Cabaña
     */
    public Cabaña(String p_nombre, 
                  double p_precioBase, 
                  int p_diasAlquiler, 
                  int p_nroHabitaciones)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }

    //Getters 
    public double getNroHabitaciones() 
    {
        return this.nroHabitacion;
    }

    //Setters 
    private void setNroHabitaciones(int p_nroHabitaciones) 
    {
        this.nroHabitacion = p_nroHabitaciones;
    }
    
    //Metodos
    public double costo() {
        double montoExtra = 30;

        double costoBase = super.costo();

        double costoServicios = super.costoServicios();

        double costoExtra = this.getNroHabitaciones() * montoExtra; 

        return costoBase + costoExtra + costoServicios;
    }

    public int contar(String p_alojamiento) {
        int total = 0;
        if(p_alojamiento.equals("Cabaña")) 
        {
            return total + 1;
        } else {
            return total;
        }
    }


    public void liquidar() {
        super.liquidar();
        System.out.println("Cabaña con "+ this.getNroHabitaciones() +" habitaciones");
        System.out.println("Total: ------> $" + this.costo() + "\n");
    }
}
