+------------------------------------------+
|                  Cliente                 |
+------------------------------------------+
| - nroDNI: int                            |
| - apellido: String                       |
| - nombre: String                         |
| - saldo: double                          |
+------------------------------------------+
| + Cliente(p_dni: int,                    |
|           p_apellido: String,            |
|           p_nombre: String,              |
|           p_importe: double)             |
| + mostrar(): void                        |
| + nuevoSaldo(p_importe: double): double  |
| + agregaSaldo(p_importe: double): double |
| + apeYnom(): String                      |
| + nomYape(): String                      |
+------------------------------------------+

En la clase Cliente, el método agregaSaldo(p_importe) agrega p_importe al 
saldo actual (lo actualiza) y devuelve el nuevo saldo. 

El método nuevoSaldo(p_importe)reemplaza el saldo actual por p_importe y 
devuelve el nuevo saldo.

La salida impresa del método mostrar() debe ser la siguiente: (los 
valores en negrita dependen del estado del objeto)

- Cliente -
Nombre y Apellido: Juan Perez (24444333)
Saldo: $200.00

//ingreso datos como argumentos del metodo main
{"42", "Sot", "Mat", "100"}