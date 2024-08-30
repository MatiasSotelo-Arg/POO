+---------------------------------+
|             Punto               |
+---------------------------------+
| - x: double                     |
| - y: double                     |
+---------------------------------+
| + Punto()                       |
| + Punto(p_x: double,            |
|         p_y: double)            | 
| + setX(p_x: double): void       |
| + setY(p_y: double): void       |
| + getX(): double                |
| + getY(): double                |
| + desplazar(p_dx: double,       |
|             p_dy: double): void |
| + mostrar(): void               |
| + coordenadas(): String         |
+---------------------------------+


6. Con el propósito de trabajar con figuras geométricas, 
se modela como colaborador, el concepto “punto”, 
que participará más adelante en la construcción de 
figuras (por ejemplo, el centro de un círculo). 

Para ello se abstraen las características básicas de un 
punto, y se lo dota de comportamiento. 

Un punto tiene dos propiedades relevantes: la abscisa X y 
la ordenada Y en el plano. 

Para este objeto definimos dos constructores:
uno sin parámetros que sitúa el punto en el origen 
(X=0; Y=0), y otro constructor explícito que recibe las 
coordenadas X e Y del punto concreto.

Implemente en java la clase Punto representada en el 
diagrama de clase. 

El método desplazar(dx, dy) cambia la posición del punto
desde (x, y) a (x+dx, y+dy).}

El método coordenadas() retorna una cadena con el 
formato: (7.5, 0.5) 

La salida impresa del método mostrar() debe ser: 
Punto. X: 7.5, Y: 0.5
(los valores en negrita dependen del estado del objeto)

