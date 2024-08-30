
/**
 * La clase Docente contiene la información del docente y
 * permite calcular su sueldo.
 * 
 * @author (Sotelo Matias) 
 * @version (29/08/2024)
 */
public class Docente
{
    //Atributos
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    /**
     * Constructor 
     * @param p_nombre el nombre del docente
     * @param p_grado el grado del docente
     * @param p_sueldoBasio el monto del sueldo basico del docente
     * @param p_asigFamiliar el monto de la asignacion familiar del docente  
     */
    public Docente(String p_nombre, 
                   String p_grado, 
                   double p_sueldoBasico,
                   double p_asignacionFamiliar)
    {
        // Inicializa variables de instancia
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsigFamiliar(p_asignacionFamiliar);
    }

    /** METODOS */ 
    
    //Setters
    /** @param p_nombre el nombre del docente */ 
    private void setNombre(String p_nombre) 
    {
        this.nombre = p_nombre;
    }
    /** @param p_grado el grado del docente */ 
    private void setGrado(String p_grado) 
    {
        this.grado = p_grado;
    }
    /** @param p_sueldoBasio el sueldo basico del docente */ 
    private void setSueldoBasico(double p_sueldoBasico)
    {
        this.sueldoBasico = p_sueldoBasico;
    }
    /** @param p_asigFamiliar el monto de la asignacion familiar del docente */
    private void setAsigFamiliar(double p_asigFamiliar)
    {
        this.asignacionFamiliar = p_asigFamiliar;
    }
    
    //Getters
    /** @return p_nombre el nombre del docente */ 
    public String getNombre() 
    {
        return this.nombre;
    }
    /** @return p_grado el grado del docente */ 
    public String getGrado() 
    {
        return this.grado;
    }
    /** @return p_sueldoBasio el sueldo basico del docente */ 
    public double getSueldoBasico() 
    {
        return this.sueldoBasico;
    }
    /** @return p_asigFamiliar el monto de la asignacion familiar del docente */
    public double getAsigFamiliar() 
    {
        return this.asignacionFamiliar;
    }
    
    //Metodos
    /** 
    *   Calcula el sueldo del docente sumando el
    *   sueldo básico y la asignación familiar. 
    */
    public double calcularSueldo() {
        return this.getSueldoBasico() + this.getAsigFamiliar();
    }
    
}
