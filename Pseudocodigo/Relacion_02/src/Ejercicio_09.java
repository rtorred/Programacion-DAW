

/**
 * Bucles
 * 
 * 9. Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por teclado.
 * 
 */
import java.util.Scanner;

public class Ejercicio_09 {

  public static void main(String[] args) {
	  
	Scanner s=new Scanner(System.in);
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un n�mero entero y le dir� cu�ntos d�gitos tiene: ");
    numeroIntroducido = s.nextInt();
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " d�gito/s.");
    s.close();

  }
}