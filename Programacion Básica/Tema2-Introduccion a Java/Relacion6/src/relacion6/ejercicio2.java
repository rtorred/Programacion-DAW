package relacion6;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe la contraseña  : ");
		String contrasena= sn.nextLine();
		boolean acierto= false;
		System.out.println("Contiene : "+contrasena.length()+" caracteres");
		System.out.println("Comienza por la letra : "+ contrasena.charAt(0)+" y temina por la letra : "+ contrasena.charAt(contrasena.length()-1));
		
		do {
			System.out.println("Dame una contraseña : ");
			String prueba= sn.nextLine();
			if (prueba.equals(contrasena)) {
				System.out.println("Has acertado oleee");
				acierto=true;
			} else {
				System.out.println("Has fallado sigue intentando");
			}
			
		} while (!acierto);

	}

}
