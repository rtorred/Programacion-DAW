import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce un numero para saber su tabla de multiplicar: ");
		int b;
		int num=sn.nextInt();
		System.out.println("La tabla de : "+num+ " es: ");
		for (b = 1; b<=10; b++ ) {
			System.out.println( num+" x "+b+" = "+b*num);
		}

		
		


	}

}
