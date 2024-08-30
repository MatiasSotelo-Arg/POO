+---------------------------------------------+
|                  Escuela                    |
+---------------------------------------------+
| - nombre: String                            |
| - domicilio: String                         |
| - director: String                          |
+---------------------------------------------+
| + Escuela(p_nombre: String,                 |
|           p_domicilio: String,              |
|           p_director: String)               |
| + imprimirRecibo(p_docente: Docente): void  |
+---------------------------------------------+
                     |
                     | 1
                     |
                     V
+---------------------------------------------+
|                  Docente                    |
+---------------------------------------------+
| - nombre: String                            |
| - grado: String                             |
| - sueldoBasico: double                      |
| - asignacionFamiliar: double                |
+---------------------------------------------+
| + calcularSueldo(): double                  |
+---------------------------------------------+

Una escuela necesita emitir el recibo de un docente, cada vez que éste lo 
solicite. 

El sueldo del docente se calcula mediante la suma de sueldo básico y la 
asignación familiar. 

El recibo que emite la escuela tiene el siguiente formato: 

Escuela: *Manuel Belgrano* 	Domicilio: *Irigoyen 1580*
Director: *Leopoldo Juez*
--------------------------------------------------------------------------------------------------------------
Docente: *Elisa Sánchez.*
Sueldo: ……………………………. $ *2.890.*
Sueldo Básico…………………. $ *1.600*
Asignación familiar…………… $ *1.290*

Implemente una clase ejecutable Secretaria donde instancie una escuela, 
un docente, y emita un recibo.