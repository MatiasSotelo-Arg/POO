The model is represented in the following class diagram:

+----------------------------------------+
|           CuentaBancaria               |
+----------------------------------------+
| - nroCuenta: int                       |
| - saldo: double                        |
| - titular: Persona                     |
+----------------------------------------+
| + CuentaBancaria(p_nroCuenta: int,     |
|   		  p_titular: Persona)    |
| + CuentaBancaria(p_nroCuenta: int,     |
|   		  p_titular: Persona, 	 |
|		  p_saldo: double)  	 |
| + depositar(p_importe: double): double |
| + extraer(p_importe: double): double   |
| + mostrar(): void                      |
| + toString(): String                   |
+----------------------------------------+ 
                    |  
                  1 | -titular
                    |
		    v
+----------------------------------------+
|                Persona                 |
+----------------------------------------+

A bank needs to model the concept of a bank account, which has to allow deposits and withdrawals. 
The method depositar(p_importe) increases the current balance with the amount passed as a parameter. 
The method extraer(p_importe) decreases the current balance. 
Both methods return the resulting balance after the operation. 

The exit screen of the method mostrar() must be as follows 
(the values in bold depend on the internal state of the object):

- Cuenta Bancaria -
Titular: *Juan Perez* (*34* años)
Saldo: *155.25*

The method toString(), returns a string, composed of the concatenation of the data 
(número, titular, saldo), tabulated. 

For example: 
1249 Juan Perez 1500.0
