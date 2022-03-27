import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		final int CODIGO= 1234;
		
		int num;
		do {
			System.out.println("Escribe la posible combinacion");
			num=sn.nextInt();
			if (num==CODIGO) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}else {
					System.out.println("Lo siento, esa no es la combinación");
			}
		} while (num!=CODIGO);
		
	

	}

}
