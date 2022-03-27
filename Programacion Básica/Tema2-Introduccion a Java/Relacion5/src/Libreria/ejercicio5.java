package Libreria;

public class ejercicio5 {
	public static int cifras(int n) {
	int ci= 0; 
    while(n!=0){             
         n = n/10;        
         ci++;          
    }
	return ci;
	}
}
