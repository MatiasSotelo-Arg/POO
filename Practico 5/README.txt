4. La fórmula Pi * r *s permite determinar la superficie de una elipse, 
donde r representa el semieje mayor y s al semieje menor, 
mientras que la superficie de un círculo está dada por 
Pi * r * r, o lo que es lo mismo Pi * r2. 

Es decir que en el círculo r y s asumen el mismo valor, 
comúnmente llamado radio. 

Por lo tanto el círculo es un caso especial de elipse.

Dado el siguiente diagrama de clases, implementar la solución teniendo 
en cuenta las clases Punto y Circulo definidas en las series anteriores. 

Tanto el círculo como la elipse deben poder desplazarse desde el punto 
actual a otra posición. 

Nótese que es necesario realizar una generalización.

Es necesario además agregar el método nombreFigura(), que retorna en 
cada caso:
****** Elipse ******
****** Circulo ******

El método caracteristicas() para la elipse tiene el siguiente formato:

****** Elipse ******
Centro: (5.0, 3.0) - Semieje Mayor: 20.44 - Semieje Menor: 46.86
Superficie: 3009.08

Elipse
-sEjeMayor: double
-sEjeMenor: double
-centro: Punto
+nombreFigura(): String
+caracteristicas(): void
+superficie(): double
+desplazar(double p_dx, double p_dy): void
+distanciaA(Elipse otraElipse): double
+elMayor(Elipse otraElipse): Elipse 

^
|

Circulo
+nombreFigura(): String

