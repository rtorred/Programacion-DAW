//Haz un programa que pida al usuario dos n�meros 
//y diga cu�ntos de ellos son positivos.//
Algoritmo Ejercicio4_4
	Definir n1 Como Real
	Definir n2 Como Real
	
	Escribir "Introduce el primer n�mero"
	Leer n1
	Escribir "Introduce el segundo n�mero"
	Leer n2
	
	
	Si n1==0 y n2==0 Entonces
		Escribir "Los dos n�meros son cero"
	SiNo
		Si n1==0 o n2==0 Entonces
			Escribir "Hay un n�mero que es cero"
		SiNo
			Si n1>0 y n2>0 Entonces
				Escribir "Los dos n�meros son positivos"
			SiNo
				Si n1>0 o n2>0 Entonces
					Escribir "Hay un n�mero positivo"
				
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
