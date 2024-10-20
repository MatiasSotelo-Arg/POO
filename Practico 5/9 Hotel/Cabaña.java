
/**
 * La clase Cabaña extiende la clase Alojamiento y representa un tipo especifico de alojamiento 
 * con un numero determinado de habitaciones. 
 *
 * Permite calcular el costo total del alquiler incluyendo un cargo adicional por cada habitación y los servicios adicionales. 
 *
 * Proporciona metodos para liquidar el costo y contar las cabañas. 
 *
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */
public class Cabaña extends Alojamiento
{
    //Atributos 
    private double nroHabitacion;

    /**
     * Constructor de la clase Cabaña.
     *
     * @param p_nombre El nombre de la cabaña.
     * @param p_precioBase El precio base por noche de la cabaña.
     * @param p_diasAlquiler La cantidad de dias que se desea alquilar la cabaña.
     * @param p_nroHabitaciones El numero de habitaciones de la cabaña.
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
    /**
     * Calcula el costo total de la cabaña,
     * incluyendo el costo base, un monto extra por habitacion
     * y el costo de los servicios adicionales.
     *
     * @return El costo total de la cabaña.
     */
    public double costo() {
        double montoExtra = 30;

        double costoBase = super.costo();

        double costoServicios = super.costoServicios();

        double costoExtra = this.getNroHabitaciones() * montoExtra; 

        return costoBase + costoExtra + costoServicios;
    }

    /**
     * Liquida la cuenta del alojamiento especifico,
     * mostrando el numero de habitaciones de la cabaña
     * y el costo total de la estancia.
     */
    public void liquidar() {
        super.liquidar();
        System.out.println("Cabaña con "+ this.getNroHabitaciones() +" habitaciones");
        System.out.println("Total: ------> $" + this.costo() + "\n");
    }

    /**
     * Cuenta la cantidad de alojamientos de tipo "Hotel".
     *
     * @param p_alojamiento El tipo de alojamiento a contar.
     * @return 1 si el alojamiento es un "Hotel" de lo contrario 0.
     */
    public int contar(String p_alojamiento) {
        int total = 0;
        if(p_alojamiento.equals("Cabaña")) 
        {
            return total + 1;
        } else {
            return total;
        }
    }
}
