//Crea un programa que pida dos n�mero enteros al usuario y diga si alguno de ellos es m�ltiplo del otro. 
//Crea una funci�n EsMultiplo que te ayude a que el proceso principal sea legible.
Algoritmo Ejercicio_03
	Definir n1, n2 Como Entero
	Escribir " Introduce el primer n�mero"
	Leer n1
	Escribir " Introduce el segundo n�mero"
	Leer n2
	Si EsMultiplo(n1,n2) Entonces
		Escribir " Alguno de ellos es m�ltiplo"
	FinSi
	
FinAlgoritmo
SubAlgoritmo resultado <- EsMultiplo ( num1,num2 )
    Si (num1%num2)=0 o (um2%num1)=0 Entonces
		resultado=Verdadero
		
	FinSi
    
FinSubAlgoritmo
