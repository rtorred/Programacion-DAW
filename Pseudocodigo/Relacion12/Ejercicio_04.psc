//Crea un procedimiento EscribirEspaciado, que reciba como par�metro un texto y 
//lo escriba con un espacio adicional tras cada letra. 
//Por ejemplo, "Hola, t�" se escribir�a "H o l a , t � ".

Algoritmo Ejercicio_04
	Definir cadena Como Caracter
	Escribir " Introduce un texto"
	Leer cadena
	EscribirEspaciado(cadena)
	
FinAlgoritmo
Subproceso EscribirEspaciado(texto)
    
    Para x <- 1 Hasta Longitud(texto) Hacer
        Escribir Sin Saltar Subcadena(texto,x,x), " "
    FinPara
	Escribir ""    
FinSubproceso
