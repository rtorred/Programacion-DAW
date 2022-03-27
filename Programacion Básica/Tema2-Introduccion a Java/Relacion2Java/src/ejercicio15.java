import static java.lang.Math. *;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int b,e,i,elevado;
		System.out.println("Base");
		b=sn.nextInt();
		System.out.println("Exponente");
		e=sn.nextInt();
		for ( i = 1; i < e; i++) {
			elevado=(int) pow(b,i);
			System.out.println(" "+b+"^"+i+"="+elevado);
			
		}
		

	}

}
