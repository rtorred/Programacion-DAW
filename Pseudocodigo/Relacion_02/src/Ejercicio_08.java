

/**
 *  Bucles
 * 
 * 8. Muestra la tabla de multiplicar de un n�mero introducido por teclado.
 * 
 */
import java.util.Scanner;
public class Ejercicio_08 {

  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.print("Introduzca un n�mero entero y le mostrar� la tabla de multiplicar: ");
    int numeroIntroducido = s.nextInt();
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }
    s.close();

  }
}