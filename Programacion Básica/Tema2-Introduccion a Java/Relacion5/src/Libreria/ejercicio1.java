package Libreria;

import java.util.Scanner;

public class ejercicio1 {
	
	public static boolean esCapicua(int a) {
		int c,i,numero;
		numero=a;
		i=0;
		while (a!=0) {
			c=a%10;
			i=i*10+c;
			a=a/10;
		}
		
		if (numero==i) {
			return true;
		} else {
			return false;
		}
		
	}

}
