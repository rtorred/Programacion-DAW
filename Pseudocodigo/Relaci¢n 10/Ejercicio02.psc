//Haz un programa que calcule ra�ces cuadradas: el usuario introducir� un n�mero
//y se le mostrar� su ra�z cuadrada. 
//Se repetir� hasta que introduzca el n�mero 0 (para el que no se deber� mostrar su ra�z). 
//Si introduce un valor negativo, se deber� mostrar un aviso en vez de intentar calcular su ra�z.
		

Algoritmo Ejercicio02
	Definir x Como Real
		Repetir
			Escribir "Introduce un n�mero para calcular su ra�z y 0 para salir de la aplicaci�n "
			Leer x
			Si x > 0 Entonces
				Escribir "La raiz de ",x," es ", RAIZ(x)
			SiNo
				Si x == 0 Entonces
					Escribir "Fin de la ejecuci�n"
				SiNo
					Escribir "No se puede hacer la ra�z de un n� negativo"
				Fin Si

			Fin Si
			Escribir""
			
		Mientras Que x != 0
FinAlgoritmo
