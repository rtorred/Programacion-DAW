//Crea una funci�n CantidadDeDivisores, que reciba un n�mero entero 
//y devuelva la cantidad de divisores (por ejemplo, para el n�mero 16, 
//sus divisores son 1, 2, 4, 8, 16, por lo que la respuesta deber�a ser 5).
Algoritmo Ejercicio_02
	Escribir " Introduce un n�mero"
	Leer numero
	Escribir " La cantidad de divisores de ",numero, " es ", Divisores(numero)
	
FinAlgoritmo

SubAlgoritmo resultado <- Divisores ( num )
    cantidadDivisores <- 0
    Para cont <- 1 Hasta num Hacer
        Si num % cont = 0 Entonces
            cantidadDivisores <- cantidadDivisores + 1
        FinSi
    FinPara
	resultado=cantidadDivisores
    
FinSubAlgoritmo

