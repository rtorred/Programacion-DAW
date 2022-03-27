import java.util.Scanner;



public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numero,i;
		int contpos=0;
		int contneg=0;
		for (i=0;i<10;i++) {
			System.out.println("Introduce hasta 10 numeros :");
			numero= sn.nextInt();
			if (numero>0) {
				contpos++;
			} else {
				contneg++;
			}
		
		}
		System.out.println("Hay :"+contpos+" numeros positivos y "+contneg+" numeros negativos");
	}



}
