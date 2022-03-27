package Libreria;

public class ejercicio2 {
	public static boolean esPrimo(int n) {
		if (n <= 1) {
            return false;
        }
 
        int contador = 0;
 
        for (int i = (int) Math.sqrt(n); i > 1; i--) {
            if (n % i == 0) {
                contador++;
            }
        }
 
        return contador < 1;
    
		
	}

}
