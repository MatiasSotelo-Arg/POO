+---------------------------------------------+
|                   Cliente                   |
+---------------------------------------------+
| - nombre: String                            |
| - domicilio: String                         |
| - telefono: String                          |
| - compraMinima: int                         |
| - diaEntrega: int                           |
+---------------------------------------------+
| + Cliente(p_nombre: String,                 |
|           p_domicilio: String,              |
|           p_telefono: String,               |
|           p_compraMin: int,                 |
|           p_diaEnt: int)                    |
| + Cliente(p_nombre: String,                 |
|           p_domicilio: String,              |
|           p_telefono: String)               |
| + nuevaCompraMinima(p_compraMin: int): void |
| + nuevoDiaEntrega(p_diaEnt: int): void      |
| + mostrar(): String                         |
+---------------------------------------------+


Una droguería que comercia con laboratorios que producen medicamentos modeló la 
clase Laboratorio representada en el diagrama de clases adjunto.

Implemente en java la clase Laboratorio. 

La salida impresa del método mostrar() debe ser la siguiente 
(los valores en negrita dependen del estado del objeto):

Laboratorio: *Colgate S.A.*
Domicilio: *Junín 5204* - Teléfono: *54-11 -4239-8447*

Nota: 
o Observe que la clase tiene dos formas de instanciarse. (Constructores sobrecargados) 
o Los atributos que no figuran en el constructor deben tener un modo de acceso público, 
debido a que la empresa puede variar su política o reglas de negocio con el tiempo. 

Con este propósito se agregan los métodos nuevaCompraMin() y nuevoDiaEnttrega(), 
que permiten modificar esos datos, asignándole un nuevo valor.



