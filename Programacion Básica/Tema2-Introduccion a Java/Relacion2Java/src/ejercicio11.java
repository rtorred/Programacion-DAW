import java.util.Scanner;
import static java.lang.Math. *;
public class ejercicio11 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		
		int acum=0;
		double cuadrado;
		double cubo;
		int cont=0;
		
		
		int num=sn.nextInt();	
		do {
			acum=num+cont;
			cont=cont+1;
			cuadrado=pow(acum,2);
			cubo=pow(acum, 3);

			System.out.println("El numero : "+acum+ " su cuadrado es : "+cuadrado+ " su cubo es: "+cubo);
	
			
		} while (acum!=(num+5));

	}

}
