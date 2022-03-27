Algoritmo Ejercicio6
	Definir cantTotalPreguntas,cantTotalPreguntasCorrectas Como Entero
	
	
	
	Escribir "Numero total de preguntas : "
	Leer cantTotalPreguntas
	Escribir "Numero total de preguntas acertadas: "
	Leer cantTotalPreguntasCorrectas
	
	porcentaje<-(cantTotalPreguntasCorrectas/cantTotalPreguntas)*100
	
	Escribir porcentaje,"%"
	
	Si porcentaje>=90 Entonces
		Escribir "Nivel Máximo "
	SiNo
		Si porcentaje>=75 y porcentaje<90 Entonces
			Escribir "Nivel Medio "
		SiNo
			Si porcentaje>=50 y porcentaje<75 Entonces
				Escribir "Nivel Regular "
			SiNo
				Si porcentaje<50 Entonces
					Escribir "Fuera de Nivel "
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
