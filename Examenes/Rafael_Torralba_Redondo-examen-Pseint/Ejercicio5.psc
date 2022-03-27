Algoritmo Ejercicio5
	Definir sueldo Como real
	Definir antiguedad Como Entero
	
	Escribir "Sueldo a cobrar : "
	Leer sueldo
	Escribir "Años de antiguedad : "
	Leer antiguedad
	
	
	
	Si sueldo<500 y antiguedad>=10 Entonces
		sueldo<-sueldo*1.2
		Escribir "Sueldo a pagar : ", sueldo
	SiNo
		Si sueldo<500 y antiguedad<10 Entonces
			sueldo<-sueldo*1.05
			Escribir "Sueldo a pagar : ", sueldo
		SiNo
			Escribir "Sueldo a pagar sin cambios : ",sueldo
		Fin Si
	Fin Si
	
	
FinAlgoritmo
