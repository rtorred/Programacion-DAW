
	//Crea un programa que pida al usuario su nombre y apellidos y los muestre con las may�sculas y min�sculas 
	//correctas (aparecer�n en may�sculas la primera letra y la que haya tras cada espacio; 
	//las dem�s aparecer�n en min�sculas. Por ejemplo, si introduce "nAcho cabaNes", es escribir� "Nacho Cabanes").
	
Algoritmo Ejercicio06
Definir nom Como Caracter
	Definir i como entero
	
	Escribir "Escribe tu nombre completo"
	leer nom
	nom<-minusculas(nom)
	
	Escribir "Tu nombre con may�sculas y min�sculas correcto es :"
	Escribir sin saltar mayusculas(subcadena(nom,1,1))
	
	
	para i <- 1 Hasta longitud(nom) hacer
		si subcadena(nom,i,i) == " " & Subcadena(nom,i+1,i+1) <> " "   Entonces
			
			Escribir sin saltar mayusculas(subcadena(nom,i+1,i+1))
		SiNo

			Escribir sin saltar subcadena(nom,i+1,i+1)
			
		FinSi
		
		
	FinPara
	
	
	
	Escribir ""
	
FinAlgoritmo
