//Haz un programa que pida al usuario 7 n�meros enteros y 
//calcule (y muestre) cu�l es el mayor de ellos.


Algoritmo ejercicio_06
	
	Definir datos,mayor,i como numerico
	
	Dimension datos[7]
	
	Escribir "Introduzca 7 n�meros"
	
	para i <- 1 hasta 7 hacer
		Escribir "Introduce el n�mero ", i
		Leer datos[i] 
	FinPara
	mayor<-datos[1]
	
	
	para i <- 2 Hasta 7 Hacer
		si datos[i] > mayor Entonces
			mayor <- datos[i]
		FinSi
	FinPara
	
	Escribir "El mayor de todos es: ", mayor
	
FinAlgoritmo
