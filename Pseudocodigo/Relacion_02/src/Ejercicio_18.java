import java.util.Scanner;

/**
 * Bucles
 * 
 * 18. Escribe un programa que obtenga los n�meros enteros comprendidos entre dos n�meros
 *     introducidos por teclado y validados como distintos, el programa debe empezar por
 *     el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 */

public class Ejercicio_18 {

  public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    
    // pide dos n�meros y se verifica que sean distintos
    do {
      System.out.print("Introduzca un n�mero entero: ");
      primerNumero = s.nextInt();
      System.out.print("Introduzca otro n�mero entero distinto al anterior: ");
      segundoNumero = s.nextInt();
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los n�meros introducidos no son v�lidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
    // si el primer n�mero es mayor que el segundo, se intercambian los valores
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
    s.close();
  }
}