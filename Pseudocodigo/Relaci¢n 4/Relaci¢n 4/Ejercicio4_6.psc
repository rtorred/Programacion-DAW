//Prepara un programa que pida al usuario tres n�meros y 
//diga cu�l es el mayor de los tres.
Algoritmo Ejercicio4_6
	Definir n1 Como Real
	Definir n2 Como Real
	Definir n3 Como Real
	
	Escribir "Introduce el primer n�mero"
	Leer n1
	Escribir "Introduce el segundo n�mero"
	Leer n2
	Escribir "Introduce el segundo n�mero"
	Leer n3
	Si n1>=n2 y n1>=n3 Entonces
		Escribir "El n�mero ", n1, " es el mayor de los tres n�meros"
	SiNo
		Si n2>=n1 y n2>=n3 Entonces
			Escribir "El n�mero ", n2, " es el mayor de los tres n�meros"
		SiNo
			Escribir "El n�mero ", n3, " es el mayor de los tres n�meros"
		Fin Si
	Fin Si
	
FinAlgoritmo
