La empresa “Iberá Servicios” desea permitir a sus empleados 
(instancias de la clase Empleado) retirarse 1 hora más temprano 
cada vez que se cumpla 1 año más de su ingreso. 

Necesita por lo tanto almacenar la fecha de ingreso completa. 

En la abstracción inicial, la fecha de ingreso completa no era 
una variable relevante al problema original.

Al presentarse un nuevo requerimiento, es necesario modificar la estructura de 
los objetos empleado: en lugar del atributo año de ingreso, de tipo entero, 
debe tener el atributo fecha de ingreso, de tipo Calendar. 

(Atención: el atributo Calendar REEMPLAZA al atributo int).

No obstante, seguramente existen otros objetos que ya están utilizando objetos 
empleados, por lo tanto es imprescindible mantener el protocolo, lo cual implica
modificar los métodos correspondientes de modo que continúen entregando 
el mismo servicio.

EMPLEADO
-cuil: long
-apellido: String
-nombre: String
-sueldoBasico: double
-fechaIngreso: Calendar
+Empleado(p_cuil: long, p_nombre: String, p_apellido: String, 
p_importe: double, p_anio: int)
+Empleado(p_cuil: long, p_nombre: String, p_apellido: String, 
p_importe: double, p_fecha: Calendar)
+antiguedad(): int
-descuento(): double
-adicional(): double
+sueldoNeto(): double
+nomYape(): String
+apeYnom(): String
+mostrar(): void
+mostrarLinea(): String
+esAniversario(): boolean

El método esAniversario() comprueba y retorna true o false según sea o no el 
día en que la persona cumple un año más en la empresa. 

Realice los cambios necesarios en la clase Empleado, y luego implemente una 
clase ejecutable Empresa, donde se instancie un empleado y se imprima un 
permiso de salida, si corresponde.
