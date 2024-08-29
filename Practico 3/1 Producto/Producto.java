
/**
 *  La clase Producto permite 
 *  gestionar los producto de un laboratorio, 
 *  mostrar info, 
 *  hacer ajustes, 
 *  calc. stock valorizado,
 *  establecer precios, 
 *  consultar precios, 
 *  establecer porcentaje punto de reposición,
 *  y existencia mínima.
 * 
 *  @author (Sotelo Matias) 
 *  @version (28/08/2024)
 */
public class Producto
{
    //Atributos
    private int codigo;
    private String rubro, descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    
    //Constructor
    /** 
     * @param p_codigo el cod del producto.
     * @param p_rubro el rubro del producto. 
     * @param p_descripcion una descripción del producto.
     * @param p_costo el costo al comprar el producto.
     * @param p_stock la cant stock disponible, mayor o igual 0.  
     * @param p_porcPtoRepo el porcentaje de punto de reposición.
     * @param p_existMinima la existencia mínima de cada producto.
     */
    public Producto(int p_codigo,
                    String p_rubro, 
                    String p_desc,
                    double p_costo, 
                    double p_porcPtoRepo, 
                    int p_existMinima/*, 
                    Laboratorio p_lab*/)
    {
         this.setStock(0);
        
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
    }
    
    public Producto(int p_codigo, 
                    String p_rubro, 
                    String p_desc,
                    double p_costo/*, 
                    Laboratorio p_lab*/)
    {
        this.setStock(0);
        
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
    }
    
    /** Metodos **/
    
    //Setters
    /** @param p_codigo el cod del producto. */
    private void setCodigo(int p_codigo) 
    {
        this.codigo = p_codigo;
    }
    
    /** @param p_rubro el rubro del producto. */
    private void setRubro(String p_rubro)
    {
        this.rubro = p_rubro;
    }
    
    /** @param p_descripcion una descripción del producto. */
    private void setDescripcion(String p_descripcion) 
    {
        this.descripcion = p_descripcion;
    }
    
    /** @param p_costo el costo al comprar el producto. */
    private void setCosto(double p_costo) 
    {
        this.costo = p_costo;
    }
    
    /** @param p_stock la cant stock disponible, mayor o igual 0. */
    private void setStock(int p_stock) 
    {
        this.stock = p_stock;
    }
    
    /** @param p_porcPtoRepo el porcentaje de punto de reposición. */
    private void setPorcPtoRepo(double p_porcPtoRepo)
    {
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    /** @param p_existMinima la existencia mínima de cada producto. */
    private void setExistMinima(int p_existMinima) 
    {
        this.existMinima = p_existMinima;
    }
    
    //Getters
    /** @return p_codigo el cod del producto. */ 
    /** @return p_rubro el rubro del producto. */
    public String getRubro() 
    {
        return this.rubro;
    }
    /** @return p_descripcion una descripción del producto. */ 
    public String getDescripcion() 
    {
        return this.descripcion;
    }
    /** @return p_costo el costo al comprar el producto. */ 
    public double getCosto() 
    {
        return this.costo;
    }
    /** @return p_stock la cant stock disponible, mayor o igual 0. */
    public int getStock() 
    {   
        return this.stock;
    }
    /** @return p_porcPtoRepo el porcentaje de punto de reposición. */
    public double getPorcPtoRepo() 
    {
        return this.porcPtoRepo;
    }
    /** @return p_existMinima la existencia mínima de cada producto. */
    public int getExistMinima() 
    {
        return this.existMinima;
    }
    //Metodos
    /**
     *  Permite modificar el stock (agregar o quitar).
     */
    public void ajuste(int p_cantidad) 
    {
        this.setStock(p_cantidad);
    }
    
    /**
     *  Calcula el resultado de multiplicar el stock por el 
     *  precio de costo, más una rentabilidad de 12%.
     *
     *  @return stockValorizado el monto del stock valorizado.
     */
    public double stockValorizado() 
    {
        double stockValorizado = this.getStock() * this.getCosto();
        double porcRentabilidad = 12;
        
        return stockValorizado = stockValorizado + this.montoRentabilidad(stockValorizado, porcRentabilidad);
    }

    /**
     *  Calcula el precio de lista, agregando un porcentaje al 
     *  costo. 
     *  
     *  @return precio de lista.
     */
    public double precioLista() 
    {
        double porcRentabilidad = 12;
        return this.getCosto() + this.montoRentabilidad(this.getCosto(), porcRentabilidad);      
    }
    
    /**
     *  Calcula el precio pagando al contado un producto.
     *  
     *  @return precio pago contado. 
     */
    public double precioContado() 
    {
        double porcDescuento = 5; 
        return this.precioLista() - (this.precioLista() * porcDescuento / 100);
    }

    //Metodos ajustar 
    /**
     *  Ajusta el Porcentaje de punto de reposición.
     *  
     *  @params p_porce porcentaje a ajustar
     */
    public void ajustarPtoRepo(double p_porce) 
    {   
        this.setPorcPtoRepo(p_porce);
    }
    
     /**
     *  Ajusta la Existencia mínima de producto.  
     * 
     *  @params p_cantidad cantidad a ajustar
     */
    public void ajustarExistMin(int p_cantidad) 
    {
        this.setExistMinima(p_cantidad);
    }
    
    //Metodos Mostrar 
    /**
     *  Imprime Rubro, Descripción, costo, stock, stock valorizado. 
     */
    public void mostrar() 
    {
        System.out.println("Rubro: "+ this.getRubro() + 
                           "\nDescripción: " + this.getDescripcion() + 
                           "\nPrecio Costo: " + this.getCosto() + 
                           "\nStock: " + this.getStock() + " - Stock Valorizado: " + this.stockValorizado()
                           );        
    } 
    
    /**
     *  Concatena Descripción, precio lista, precio contado.
     *  
     *  @return string con la info.
     */
    public String mostrarLinea() 
    {
        return this.getDescripcion() + " " + this.precioLista() + 
        " " + this.precioContado();
    }
    
    //Metodo Aux
    /**
     *  Calcula el monto que queda de agregar un porcentaje 
     *  al costo. 
     *  
     *  @return monto de rentabilidad
     */
    public double montoRentabilidad(double p_costo, double p_porcentaje) 
    {
        double porcRentabilidad = p_porcentaje;
        return p_costo * porcRentabilidad / 100;
    }
}
