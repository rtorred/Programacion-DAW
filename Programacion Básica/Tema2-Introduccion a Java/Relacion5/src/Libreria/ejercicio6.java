package Libreria;

public class ejercicio6 {
	public static int vuelta(int a) {
		int c,i,numero;
		numero=a;
		i=0;
		while (a!=0) {
			c=a%10;
			i=i*10+c;
			a=a/10;
		}
	
		return a;
	}

}
