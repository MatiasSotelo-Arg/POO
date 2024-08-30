
/**
 *  La clase Escuela permite emitir el recibo de un docent y 
 *  Calcular sueldo del docente.
 *  
 *  @author (Sotelo Matias) 
 *  @version (29/08/2024)
 */
public class Escuela
{
    //Atributo 
    private String nombre;
    private String domicilio;
    private String director;
    private Docente docente;
    /**
     * Constructor
     * 
     * @param p_nombre de la escuela
     * @param p_domicilio de la escuela
     * @param p_director de la escuela
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }

    /** METODOS */
 
    //Setters 
    /** @param p_nombre de la escuela */
    private void setNombre(String p_nombre)
    {
        this.nombre = p_nombre;
    }
    /** @param p_domicilio de la escuela */ 
    private void setDomicilio(String p_domicilio) 
    {
        this.domicilio = p_domicilio;
    }
    /** @param p_director de la escuela */
    private void setDirector(String p_domicilio) 
    {
        this.director = p_domicilio;
    }
    
    //Getters
    /** @return nombre del colegio */
    public String getNombre() 
    {
        return this.nombre;
    }
    /** @return domicilio del colegio */
    public String getDomicilio() 
    {
        return this.domicilio;
    }
    /** @return director del colegio */
    public String getDirector() 
    {
        return this.director;
    }
    
    //Metodos 
    /** 
     *  Imprime el recibo que emite la escuela:
     *  Escuela, Domicilio, Director. 
     *  Docente, Sueldo, Sueldo Basico, Asignación Familiar.
     */
    public void imprimirRecibo(Docente p_docente) 
    {
        System.out.println("Escuela: " + this.getNombre() + "\tDomicilio: " 
        + this.getDomicilio() + "\tDirector: " + this.getDirector() +
        "\n---------------------------------------------------------------\n" + 
        "Docente: " + p_docente.getNombre() + "\n" +
        "Sueldo: ……………………………. $ " + p_docente.calcularSueldo() + "\n" +
        "Sueldo Básico…………………. $ " + p_docente.getSueldoBasico() + "\n" +
        "Asignación familiar…………… $ " + p_docente.getAsigFamiliar());
    }
}
