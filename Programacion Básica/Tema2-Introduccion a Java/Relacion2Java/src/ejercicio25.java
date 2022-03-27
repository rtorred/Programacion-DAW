import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		Scanner sn1= new Scanner(System.in);
		int n;
		
		System.out.println("Escribe un numero: ");
		n=sn1.nextInt();
		
		while (n!=0) {
			System.out.print(n%10);
			n=n/10;

		}
		
		

	}

}
