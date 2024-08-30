+--------------------------------+
|           Empleado             |
+--------------------------------+
| - cuil: long                   |
| - apellido: String             |
| - nombre: String               |
| - sueldoBasico: double         |
| - anioIngreso: int             |
+--------------------------------+
| + Empleado(p_cuil: long,       |
|            p_apellido: String, |
|            p_nombre: String,   |
|            p_importe: double,  |
|            p_anio: int)        |
| + antiguedad(): int            |
| + descuento(): double          |
| + adicional(): double          |
| + sueldoNeto(): double         |
| + nomYApe(): String            |
| + apeYNom(): String            |
| + mostrar(): void              |
| + mostrarLinea(): String       |
+--------------------------------+


Una empresa desea administrar automáticamente la liquidación de sueldo de sus empleados. 

Para ello se modela la abstracción del concepto “empleado”, teniendo en cuenta 
las características relevantes al problema, brindando el comportamiento adecuado.

Implemente en java la clase Empleado según lo indicado en el diagrama de clases.

El método antiguedad() devuelve la cantidad de años desde el ingreso a la empresa. 

El método descuento() corresponde al 2% del sueldo básico en concepto de obra social, mas $1500 de seguro de 
vida. 

El método adicional() es una asignación que se realiza sobre el sueldo básico, en base a la antigüedad, según la 
siguiente tabla:

Antigüedad Asignación con respecto al Sueldo Básico
< 2 2%
>= 2 y <10 4%
>= 10 6 %

El sueldo neto se calcula como la suma del sueldo básico más el adicional, menos el descuento.

La salida impresa del método mostrar() debe ser la siguiente (los valores en negrita dependen del estado interno del objeto):

Nombre y Apellido: Juan Perez
CUIL: 20351234385 Antigüedad: 22 años de servicio
Sueldo Neto: $ 300000.00 

El método mostrarLinea() retorna una cadena como la siguiente (los valores dependen del estado interno del objeto):
20351234385 Perez, Juan …………… $ 300000.00


