+----------------------------------+
|              Alumno              |
+----------------------------------+
| - lu: int                        |
| - nombre: String                 |
| - apellido: String               |
| - nota1: double                  |
| - nota2: double                  |
+----------------------------------+
| + Alumno(p_lu: int,              |
|           p_nombre: String,      |
|           p_apellido: String)    |
| + setNota1(p_nota: double): void |
| + setNota2(p_nota: double): void |
| + promedio(): double             |
| + nomYApe(): String              |
| + apeYNom(): String              |
| + mostrar(): void                |
| - aprueba(): boolean             |
| - leyendaAprueba(): String       |
+----------------------------------+

It is wanted to get the average of grade points of Object Oriented Programming students. 

For this, the abstract concept "pupil" is modeled. 

When an instance of Alumno is created, as grade points are not known yet, 
they are initialized in zero.

The method promedio() returns the average of student's 
grade points. 
The method aprueba() returns true or false 
according to whether the student's grade points average is greater
than 7.0 and if both grade points are equal or greater than 6.0. 

The method leyendaAprueba() returns a string APROBADO or 
DESAPROBADO according to the method aprueba() returns.
 
The printed output of the method mostrar() must be: (bolded
values show internal state of object)


Nombre y Apellido: *Juan Perez*
LU: *2020* Notas: *5.99 – 10.0*
Promedio: *7.995* - *DESAPROBADO*

Nombre y Apellido: *María Gomez*
LU: *2051* Notas: *7.85 - 8.5*
Promedio: *8.20* – *APROBADO*
