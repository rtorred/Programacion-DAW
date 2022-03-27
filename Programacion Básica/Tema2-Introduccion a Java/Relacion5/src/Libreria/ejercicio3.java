package Libreria;

public class ejercicio3 {
	public static int siguientePrimo(int n) {
        int contador,I;
		
		contador = 0;
        for(int i = 1; i <= n; i++){
            if((n % i) == 0){
                contador++;
            }
        }
        if(contador <= 2){
            System.out.println("El numero es primo");

        }else{
            System.out.println("El numero no es primo");
        }
        
        return n;
	}
}
