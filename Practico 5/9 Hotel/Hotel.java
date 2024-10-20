/**
 * La clase Hotel extiende la clase Alojamiento y representa un tipo especifico de alojamiento 
 * con un tipo de habitacion definido. 
 * Calcula el costo total de la estancia en funcion del tipo de habitación y la duración del alquiler. 
 *
 * Permite liquidar la cuenta y contar la cantidad de hoteles registrados.
 * 
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */
public class Hotel extends Alojamiento
{
    //Atributos 
    private String tipoHabitacion;

    /**
     * Constructor de la clase Hotel.
     *
     * @param p_nombre El nombre del hotel.
     * @param p_precioBase El precio base por noche del hotel.
     * @param p_diasAlquiler La cantidad de dias que se desea alquilar la habitacion.
     * @param p_tipoHabitacion El tipo de habitacion.
     */
    public Hotel(String p_nombre, 
                  double p_precioBase, 
                  int p_diasAlquiler, 
                  String p_tipoHabitacion)
    {
        super(p_nombre, p_precioBase, p_diasAlquiler);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    //Getters 
    public String getTipoHabitacion() 
    {
        return this.tipoHabitacion;
    }

    //Setters 
    private void setTipoHabitacion(String p_tipoHabitacion) 
    {
        this.tipoHabitacion = p_tipoHabitacion;
    }

    //Metodos
    /**
     * Calcula el costo total de la estancia en el hotel
     * segun el tipo de habitacion y la cantidad de dias de alquiler.
     *
     * @return El costo total de la estancia.
     */
    public double costo() {
        double costoBase = super.costo();

        double montoSingle = 20;
        double montoDoble = 35;

        if(this.getTipoHabitacion().equals("Single")) {

            return (costoBase + montoSingle) * super.getDiasAlquiler();

        } else if (this.getTipoHabitacion().equals("“Doble”")) 
        {

            return (costoBase + montoDoble) * super.getDiasAlquiler();

        } else {

            return 00.00;

        }
    }

    /**
     * Cuenta la cantidad de alojamientos de tipo "Hotel".
     *
     * @param p_alojamiento El tipo de alojamiento a contar.
     * @return 1 si el alojamiento es un "Hotel" de lo contrario 0.
     */
    public int contar(String p_alojamiento) {

        if(p_alojamiento.equals("Hotel")) 
        {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Liquida la cuenta del alojamiento.
     * Utiliza el metodo de liquidacion de la clase padre,
     * muestra el tipo de habitacion y el costo total.
     */
    public void liquidar() {
        super.liquidar();
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + this.costo() + "\n");
    }

}
