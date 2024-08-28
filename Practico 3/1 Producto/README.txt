+-------------------------------------------+
|                 Producto                  |
+-------------------------------------------+
| - codigo: int                             |
| - rubro: String                           |
| - descripcion: String                     |
| - costo: double                           |
| - stock: int                              |
| - porcPtoRepo: double                     |
| - existMinima: int                        |
+-------------------------------------------+
| + Producto(p_codigo: int,                 |
|            p_rubro: String,               |
|            p_desc: String,                |
|            p_costo: double,               |
|            p_porcPtoRepo: double,         |
|            p_existMinima: int,            |
|            p_lab: Laboratorio)            |
| + Producto(p_codigo: int,                 |
|            p_rubro: String,               |
|            p_desc: String,                |
|            p_costo: double,               |
|            p_lab: Laboratorio)            |
| + mostrar(): void                         |
| + ajuste(p_cantidad: int): void           |
| + stockValorizado(): double               |
| + precioLista(): double                   |
| + precioContado(): double                 |
| + mostrarLinea(): String                  |
| + ajustarPtoRepo(p_porce: double): void   |
| + ajustarExistMin(p_cantidad: int): void  |
+-------------------------------------------+
                   |
                 1 | - Laboratorio
                   | 
		   v
+-------------------------------------------+
|                Laboratorio                |
+-------------------------------------------+


Al dar de alta un producto, que se compra por primera vez, el stock deberá iniciar
se en 0.

Éste se incrementará en futuras cargas de compras realizadas a los laboratorios.

El método ajuste(p_cantidad) permite modificar el stock (agregando o quitando), 
por ejemplo, en un inventario o en el caso de destrucción de productos vencidos, 
etc.

El método precioLista() devuelve el valor que resulta de agregar un 12% al precio
de costo.

El método precioContado() devuelve el valor que representa el precio por pago al 
contado del producto, que se calcula restando un 5% al precio de lista.

El método stockValorizado() debe devolver el resultado de multiplicar el stock 
por el precio de costo, más una rentabilidad de 12%.

Por diversos factores (demanda estacional, demanda de mercado, etc.), es política 
de la empresa que el porcentaje de punto de reposición y la existencia mínima de
cada producto sea variable.

	Estos pueden ser modificados mediante los métodos ajustarPtoRepo() y 
	ajustarExistMin(), que permiten asignar un nuevo valor a dichos atributos.

La salida impresa del método mostrar() es la siguiente (los valores en negrita 
dependen del estado interno del objeto):
	
Laboratorio: **Colgate S.A.** 
Domicilio: **Scalabrini Ortiz 5524** - Teléfono: **54-11 -4239-8447**

Rubro: **Perfumería**
Descripción: **Jabón Deluxe**
Precio Costo: **5.25**
Stock: **500** - Stock Valorizado: **$2940**

El método mostrarLinea() devuelve un String formado por la concatenación de la 
descripción del producto, el precio de lista y el precio de contado, según el 
siguiente formato:

Jabón Deluxe 11.20 10.64

// Ejecutable 
Implemente una clase ejecutable GestionStock en la que se instancie 1 producto, 
se le asigne un stock de 500, que surgieron de una promoción de un laboratorio, 
y luego se muestre por pantalla sus datos, incluido el stock valorizado. 

Luego simule una baja de 200 productos, que se destruyeron por estar mal estibados,
y muestre nuevamente el estado actual. 

Por último, ante la consulta de un cliente, muestre el precio de lista y el precio
al contado.