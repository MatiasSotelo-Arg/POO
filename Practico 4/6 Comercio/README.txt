Un Comercio desea automatizar el registro de sus empleados (colección empleados),
y para ello debe contar con una interface que contemple el alta y la baja de 
los mismos. 

Tenga en cuenta que en este caso la colección presenta la característica 
de que cada empleado (valor) puede ser recuperado mediante el número de 
CUIL (clave), por lo que resulta conveniente usar una clase HashMap. 

Para gestionar los RRHH, 
es necesario contar con métodos que permitan conocer la cantidad de empleados, 

consultar por medio del CUIL si un empleado es parte de la empresa, 

buscar un empleado determinado, conociendo su CUIL, 

visualizar por pantalla el sueldo neto del empleado cuyo CUIL 
coincida con el parámetro introducido, y por último, 

emitir una nómina de los empleados, que debe ser presentado ante la AFIP, 
con el siguiente formato:


**** Nomina de empleados de Avanti SRL **** 

30100623 Gonzalez, Juan------------ $102750.00
37045987 Martinez, Mercedes------ $100719.00
32550096 Gomez, Virginia---------- $150120.00

Implementar una clase ejecutable GestionComercio, donde se instancie un comercio 
y varios empleados, que serán contratados por el comercio.
Emitir una nómina, y verificar el correcto funcionamiento de las demás 
funcionalidades implementadas. 