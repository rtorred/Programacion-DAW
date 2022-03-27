import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num,acum;
		acum=0;
		do {
			System.out.println("Introduce un numero entero y positivo: ");
			num = sn.nextInt();
		} while (num<0);
		for (int i = num; i <=(num+100); i=i+1) {
			acum=num+acum;
			System.out.println(acum);
		}
		System.out.println("Esta es la sumna : "+acum);
		

	}

}
