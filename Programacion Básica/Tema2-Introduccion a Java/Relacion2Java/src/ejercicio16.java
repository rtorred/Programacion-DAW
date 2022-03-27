import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numero;
		System.out.println("Dame un numero para saber si es primo o no: ");
		numero=sn.nextInt();
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		    contador++;
		  }
		 System.out.println(primo);

	}

}
