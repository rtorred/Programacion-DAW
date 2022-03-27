import java.util.Scanner;

/**
 * Bucles
 * 
 * 12. Escribe un programa que muestre los n primeros t�rminos de la
 *     serie de Fibonacci. El primer t�rmino de la serie de Fibonacci
 *     es 0, el segundo es 1 y el resto se calcula sumando los dos
 *     anteriores, por lo que tendr�amos que los t�rminos son 0, 1, 1,
 *     2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El n�mero n se debe
 *     introducir por teclado.
 * 
 */


public class Ejercicio_12 {

  public static void main(String[] args) {
	  
	  Scanner s=new Scanner (System.in);
    
    System.out.println("Este programa muestra los n primeros n�meros de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = s.nextInt();

    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(n > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            n--;
        }
    }
    System.out.println();
    s.close();
  }
}