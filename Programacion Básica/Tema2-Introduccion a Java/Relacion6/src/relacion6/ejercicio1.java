package relacion6;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe una palabra : ");
		String s1= sn.next();
		System.out.println("Escribe otra palabra : ");
		String s2= sn.next();
		
		if (s1.length()>s2.length()) {
			System.out.println("La palabra : "+ s1 +" es mas grande");
		} else {
			System.out.println("La palabra : "+ s2 +" es mas grande");
		}
		
		

	}

}
