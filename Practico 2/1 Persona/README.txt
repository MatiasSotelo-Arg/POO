+-----------------------------------------+
|                   Persona               |
+-----------------------------------------+
| - nroDni: int                           |
| - nombre: String                        |
| - apellido: String                      |
| - anioNacimiento: int                   |
+-----------------------------------------+
| + Persona(p_dni: int,                   |
|           p_nombre: String,             |
|           p_apellido: String,           |
|           p_anio: int)                  |
| + setDNI(p_dni: int): void              |
| + setNombre(p_nombre: String): void     |
| + setApellido(p_apellido: String): void |
| + setAnioNacimiento(p_anio: int): void  |
| + getDNI(): int                         |
| + getNombre(): String                   |
| + getApellido(): String                 |
| + getAnioNacimiento(): int              |
| + edad(): int                           |
| + nomYApe(): String                     |
| + apeYNom(): String                     |
| + mostrar(): void                       |
+-----------------------------------------+


1. El diagrama de clase adjunto representa una abstracción del concepto “persona”. 

Implemente en java la clase Persona. 
El método edad() devuelve la cantidad de años cumplidos a la fecha, 
considerando para el cálculo sólo la diferencia entre años. 

La salida impresa del método mostrar() debe ser la siguiente (los 
valores en negrita dependen del estado del objeto):

Nombre y Apellido: Juan Perez
DNI: 35123456 Edad: 22 años

Nota: Para trabajar con fechas, agregar: 
import java.util.*;

Para saber el año actual usar:
Calendar fechaHoy = new GregorianCalendar();
int anioHoy = fechaHoy.get(Calendar.YEAR);



