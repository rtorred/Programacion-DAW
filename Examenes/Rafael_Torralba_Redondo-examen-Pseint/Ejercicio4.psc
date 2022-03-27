Algoritmo Ejercicio4
	Definir coordenadaX,coordenadaY Como Real
	Escribir "Introduzca coordenadaX :"
	Leer coordenadaX
	Escribir  "Introduzca coordenadaY : "
	Leer coordenadaY
	
	Si coordenadaX>0 y coordenadaY>0 Entonces
		Escribir "El punto se encuentra en el 1ºCuadrante "
	SiNo
		Si coordenadaX<0 y coordenadaY>0 Entonces
			Escribir "El punto se encuentra en el 2ºCuadrante "
		SiNo
			Si coordenadaX>0 y coordenadaY<0 Entonces
				Escribir "El punto se encuentra en el 3ºCuadrante "
			SiNo
				Escribir "El punto se encuentra en el 4ºCuadrante "
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
