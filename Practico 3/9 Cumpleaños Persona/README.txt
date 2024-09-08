La entidad bancaria que administra las cuentas bancarias definidas previamente 
desea mandar una tarjeta de felicitaciones el día del cumpleaños de sus clientes 
(instancias de la clase Persona). 

Para ello necesita disponer de la fecha de nacimiento completa. 
Ante este nuevo requerimiento, es necesario modificar la estructura de los 
objetos persona: en lugar del atributo año de nacimiento, de tipo entero, 
debe tener el atributo fecha de nacimiento, de tipo 

Calendar (Atención: el atributo Calendar REEMPLAZA al atributo int). 

Sin embargo, como otros objetos ya están utilizando objetos persona, es 
imprescindible, mantener el protocolo, lo cual implica modificar los métodos 
correspondientes de modo que continúen entregando el mismo servicio. 

Int anioNacimiento → Calendar fechaNacimiento 

El método esCumpleaños() comprueba y retorna true o false según sea o no el 
cumpleaños de la persona en el día que se ejecuta el programa. 

En la clase Banco creada previamente, agregue el envío del mensaje de cumpleaños, 
si cumple la condición.