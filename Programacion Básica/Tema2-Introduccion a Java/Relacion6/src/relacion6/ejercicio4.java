package relacion6;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe una frase : ");
		String frase= sn.nextLine();
		int cont=0;
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i)==' ') {
				cont++;
			}else {
			
			}
		}
		
		System.out.println("La frase introducida tiene : "+ cont);

	}

}
