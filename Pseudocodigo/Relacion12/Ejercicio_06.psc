//Crea una funci�n EsPar que devuelva el valor l�gico "verdadero" o "falso" 
//seg�n si el n�mero que se indique como par�metro es par o no lo es.
Algoritmo Ejercicio_06
	Definir num Como Entero
	Escribir " Introduce un n�mero"
	Leer num
	Si EsPar(num) Entonces
		Escribir " Es par"
	SiNo
		Escribir " Es impar"
		
	FinSi
	
FinAlgoritmo
SubAlgoritmo resultado <- EsPar (n )
    Si (n%2=0) Entonces
		resultado=Verdadero
	SiNo
		resultado=Falso
		
	FinSi
    
FinSubAlgoritmo
