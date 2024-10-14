9. Una cadena hotelera desea automatizar parte de su información con el fin de agilizar 
la liquidación de la estadía en sus alojamientos. 

La información registrada se refiere a los tipos de alojamiento que maneja (cabaña/ hotel),
y los servicios extras asociados al alojamiento (alquiler de automóvil, lavandería, etc). 

Toda la información es registrada por una Gerencia regional. 

En cada alojamiento el precio base es el precio a abonar por cada día, sin considerar los servicios. 

Al momento de liquidar la estadía, se deberá tener en cuenta la cantidad de días y las
características particulares de cada tipo de alojamiento.

El diseño de la solución se encuentra en el diagrama de clases adjunto.

La aplicación desarrollada debe permitir registrar o anular, en relación al alojamiento, 
un servicio solicitado por el cliente, y proveer un listado de los servicios utilizados 
efectivamente (Ej: alquiler auto: $100.0).

El costo del alojamiento se calcula en función del precio base y la cantidad de días de alquiler, mientras que el costo de los servicios será la suma de todos los servicios 
utilizados por el cliente.

La liquidación de la estadía, común a los distintos tipos de alojamiento, incluidos los 
servicios, tiene el formato siguiente:

    Alojamiento: *Cabañas La Alondra*
    Costo por *5* dias: *$600.0* alquiler
    	auto: *$100.0* 
	lavanderia: *$20.0*

En el caso particular de las cabañas, al costo calculado para el alojamiento se debe 
agregar $30 por día por cada habitación que tenga la cabaña.

Al liquidar el alquiler de la cabaña, se debe agregar a la liquidación la característica
de la cabaña y el costo total.
El formato es el siguiente:

    Cabaña con 3 habitaciones
    Total: ------> $1170.0

Al calcular el costo de los hoteles, al costo base se debe agregar $20 si el tipo de
habitación es “Single” o $35 si es habitación “Doble”, por la cantidad de días alojado. 

Al liquidar el alquiler del hotel, se debe agregar a la liquidación la característica 
de la habitación del hotel y el costo total. El formato es el siguiente:

    Habitacion Single
    Total: ------> $735.0

Con frecuencia la gerencia desea saber la cantidad de cabañas y de habitaciones de hotel
que tiene alquiladas. 

Por tal motivo, es responsabilidad de cada clase concreta (Hotel o Cabaña), permitir 
contar un alojamiento más, en cada tipo de alojamiento particular, de manera que al 
recorrer la colección de alojamientos alquilados, se pueda contar la cantidad de
alquileres de un tipo determinado (Hotel o Cabaña),e que se ingresa como parámtro.

Por su parte la gerencia tiene la responsabilidad de llevar un registro de los 
alojamientos que están alquilados.

Debe implementar también el método apropiado para contar un tipo de alojamiento 
determinado, pudiendo ser “Hotel” o “Cabaña”. 

Debe liquidar la estadía para cada hotel o cabaña alquilada, y mostrar la liquidación, 
que será un resumen con el formato siguiente:

    Gerencia Los Arroyos
    Liquidación-------------------

    Alojamiento: Cabañas La Alondra
    Costo por 5 dias: $1050.0
        alquiler auto: $100.0
        lavanderia: $20.0
        Cabaña con 3 habitaciones
    Total: ------> $1170.0

    Alojamiento: Hotel Guaraní
    Costo por 7 dias: $630.0
        internet: $5.0
        alquiler auto: $100.0
        Habitacion Single
    Total: ------> $735.0

    Alojamiento tipo Cabaña ---->1
    Alojamiento tipo Hotel ------->1

Implementar una clase ejecutable Administración Gerencia, que realice la liquidación 
para las siguientes situaciones:
o Una habitación de hotel, con una estadía de 1 semana, con servicio de internet y 
lavandería.
o Una cabaña, por 5 días, con servicio de lavandería y alquiler de auto.