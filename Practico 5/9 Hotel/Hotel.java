/**
 * Write a description of class Cabaña here.
 * 
 * @author (Sotelo Matias) 
 * @version (12/10/2024)
 */
public class Hotel extends Alojamiento
{
    //Atributos 
    private String tipoHabitacion;

    /**
     * Constructor for objects of class Cabaña
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

    public int contar(String p_alojamiento) {
        int total = 0;
        if(p_alojamiento.equals("Hotel")) 
        {
            return total + 1;
        } else {
            return total;
        }
    }

    public void liquidar() {
        super.liquidar();
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + this.costo() + "\n");
    }

}
