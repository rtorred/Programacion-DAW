//Crea una funci�n MayorDeTres, que reciba tres n�meros enteros y 
//devuelva el valor del mayor de ellos. 
//Por ejemplo, para los n�meros 5, 7 y 5, devolver�a el valor 7.
Algoritmo Ejercicio_05
	Definir num1,num2,num3 Como Entero
	Escribir " Introduce tres n�meros"
	Leer num1, num2, num3
	Escribir " El mayor de los n�meros es ",Mayor(num1,num2,num3)
	
FinAlgoritmo
SubAlgoritmo resultado <- Mayor ( n1,n2,n3 )
    Si (n1>n2 y n1>n3) Entonces
		resultado=n1
	SiNo
		si (n2>n1 y n2>n3) Entonces
		
			resultado=n2
		SiNo
			resultado=n3
			
		FinSi
		
	FinSi
    
FinSubAlgoritmo
