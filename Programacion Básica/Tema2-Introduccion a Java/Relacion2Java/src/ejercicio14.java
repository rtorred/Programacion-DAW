import java.util.Scanner;
import static java.lang.Math. *;
public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double b,e,elevado;
		
		System.out.println("Dame una base");
		b=sn.nextInt();
		System.out.println("Dame un exponente");
		e=sn.nextInt();
		elevado=pow(b,e);
		System.out.println("La elevasion de : "+b+" + "+e+" es "+elevado);

	}

}
