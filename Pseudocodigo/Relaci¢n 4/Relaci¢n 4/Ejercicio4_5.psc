//Crea un programa que pida al usuario dos n�meros
//y muestre su divisi�n si el segundo no es cero, 
//o un mensaje de aviso en caso contrario.
Algoritmo Ejercicio4_5
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Introduce el primer n�mero"
	Leer n1
	Escribir "Introduce el segundo n�mero"
	Leer n2
	Si n2==0 Entonces
		Escribir "El segundo n�mero introducido es cero, no se puede realizar la divisi�n"
	SiNo
		Escribir "El resultado de dividir ",n1," entre ",n2," es :",n1/n2
	Fin Si
FinAlgoritmo
