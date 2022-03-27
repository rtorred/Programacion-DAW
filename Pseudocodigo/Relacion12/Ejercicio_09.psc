//Crea una funci�n Contiene, que reciba una cadena y una (posible) subcadena, y devuelva
//"verdadero" o "falso", seg�n si la primera contiene a la segunda (como "Nacho" contiene "ac") o no
//la contiene, (como "Aurora" no contiene "sol").

Funcion resultado <- contiene(palabra, minipal)
	Definir resultado Como Logico
	Definir i como numerico
	
	para i <- 1 hasta Longitud(palabra) Hacer
		//escribir "Minipalabra:  ", minipal , "   //Subcadena:  ", Subcadena(palabra,i,(i+Longitud(minipal)-1))
		si minipal == Subcadena(palabra,i,(i+Longitud(minipal)-1)) Entonces
			resultado <- Verdadero
		FinSi
	FinPara
	
FinFuncion

Algoritmo ejercicio_09
	Definir palabra, minipal como caracter
	
	Escribir "Introduce una cadena de caracteres"
	Leer palabra
	Escribir "Introduce una subcadena , al menos dos caracteres)"
	Leer minipal
	Si (Contiene(palabra,minipal)) Entonces
		Escribir " La subcadena ",minipal," est� contenida en la cadena ", palabra
	SiNo
		Escribir " La subcadena ",minipal,"  NO est� contenida en la cadena ", palabra
	FinSi
	
	
	Escribir ""
FinAlgoritmo
