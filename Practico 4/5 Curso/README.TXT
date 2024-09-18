Curso
-nombre: String
+Curso(String p_nombre)
+Curso(String p_nombre, HashMap p_alumnos)
+inscribirAlumno(Alumno p_alumno): void
+quitarAlumno(int p_lu): Alumno
+cantidadDeAlumnos(): int
+estaInscripto(int p_lu): boolean
+estaInscripto(Alumno p_alumno): boolean
+buscarAlumno(int p_lu): Alumno
+imprimirPromedioDelAlumno(int p_lu): void
+mostrarInscriptos(): void


Una institución educativa desea administrar información 
de los cursos que dicta. 

El siguiente diagrama de clases modela el diseño de la situación La institución registra los alumnos que se 
inscriben al curso en una colección, por lo tanto, 
debe proveer una interface que contemple el inscribir y 
el eliminar un alumno del curso. 

Tenga en cuenta que en este caso la colección presenta la característica de que cada alumno (valor) de la misma puede ser recuperado mediante el número de LU (clave), por tal motivo se sugiere usar una clase HashMap

(implementa la interface Map, reúne el comportamiento de un dictionary, trabajando con pares de clave-valor).

Entre las tareas que debe realizar la administración del Curso están las siguientes: 
-conocer la cantidad de alumnos inscriptos a un curso, 
-indicar si un alumno figura o no inscripto al curso (ya sea si se conoce al objeto alumno, o sólo su LU), 
-obtener un alumno de la colección proporcionando su LU, -mostrar sólo el promedio de un alumno en particular, del cual se conoce su LU, 
-y listar todos los alumnos inscriptos al curso, indicando su LU y nombre y apellido.


5.1. En la clase ejecutable se debe:

5.1.1. Crear una instancia de Curso y varias de la clase Alumno

5.1.2. Asignarles notas de parciales a los alumnos

5.1.3. Inscribir los alumnos al curso creado anteriormente.

5.1.4. Imprimir la cantidad y la lista de alumnos inscriptos al curso

5.1.5. Dar de baja un alumno del curso, y luego verificar que no esté inscripto

5.1.6. Imprimir nuevamente la lista de alumnos para ver como que queda definitivamente y la cantidad total de
alumnos inscriptos en el curso

5.1.7. Buscar un alumno por su libreta. 
	Una vez encontrado, mostrarlo con el método apropiado.

5.1.8. Mostrar el promedio del alumno solicitado, según libreta	

Al ejecutar la aplicación (clase Carrera), deberá obtener la siguiente salida:
****-- Cantidad de inscriptos: 4
32555 Pedro Gomez
23564 Maria Vasquez
30123 Juan Perez
32655 Marcela Martinez
****-- Se da de baja a Pedro porque abandona el curso --****
Está Pedro Gomez inscripto ?? --> false
****-- Alumnos inscriptos actualmente: 3
23564 Maria Vasquez
30123 Juan Perez
32655 Marcela Martinez
****-- Busca y muestra el alumno con numero de libreta 30123 --****
Apellido y nombre: Juan Perez
LU: 30123 Notas: 7.0, 9.0
Promedio: 8.0 Aprobado
****-- Mostrar promedio del alumno 23564 --****
Promedio: 5.5












