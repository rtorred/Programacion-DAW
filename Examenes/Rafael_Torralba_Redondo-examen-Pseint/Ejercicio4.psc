Algoritmo Ejercicio4
	Definir coordenadaX,coordenadaY Como Real
	Escribir "Introduzca coordenadaX :"
	Leer coordenadaX
	Escribir  "Introduzca coordenadaY : "
	Leer coordenadaY
	
	Si coordenadaX>0 y coordenadaY>0 Entonces
		Escribir "El punto se encuentra en el 1�Cuadrante "
	SiNo
		Si coordenadaX<0 y coordenadaY>0 Entonces
			Escribir "El punto se encuentra en el 2�Cuadrante "
		SiNo
			Si coordenadaX>0 y coordenadaY<0 Entonces
				Escribir "El punto se encuentra en el 3�Cuadrante "
			SiNo
				Escribir "El punto se encuentra en el 4�Cuadrante "
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
