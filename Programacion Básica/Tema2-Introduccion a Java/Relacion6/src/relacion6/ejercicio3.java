package relacion6;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe una frase sin espacios  : ");
		String frase= sn.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(frase.charAt(i)+" ");
		}
		

	}

}
