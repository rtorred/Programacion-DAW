import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

	    System.out.println("Por favor, vaya introduciendo n�meros.");
	    System.out.println("El programa terminar� cuando la suma de los n�meros sea mayor que 10000.");
	    
	    int numeroIntroducido;
	    int suma = 0;
	    int numeroDeElementos = 0;
	    
	    do {
	      numeroIntroducido = s.nextInt();
	      suma += numeroIntroducido;
	      numeroDeElementos++;
	    } while (suma <= 10000);
	    
	    System.out.println("Ha introducido un total de " + numeroDeElementos + " n�meros.");
	    System.out.println("La suma total es " + suma + ".");
	    System.out.println("La media es " + suma / numeroDeElementos + ".");
	    s.close();
	}

}
