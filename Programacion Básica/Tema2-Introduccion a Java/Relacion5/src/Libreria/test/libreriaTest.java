package libreria.test;

import java.util.Scanner;

import Libreria.ejercicio1;
import Libreria.ejercicio2;
import Libreria.ejercicio3;


public class libreriaTest {

	public static void main(String[] args) {
		Scanner sn1= new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int n=sn1.nextInt();
		System.out.println("Capicua ?:"+ejercicio1.esCapicua(n));
		
		System.out.println("Es Primo ?:"+ejercicio2.esPrimo(n));
		
		System.out.println(ejercicio3.siguientePrimo(n));
		

	}

}
