import java.util.Scanner;

/**
 * 5. Bucles
 * 
 * 24. Escribe un programa que lea un n�mero N e imprima una pir�mide de n�meros con N filas como
 *     en la siguiente figura: 
 *          1 
 *         121
 *        12321 
 *       1234321
 * 
 */
public class Ejercicio_24 {

  public static void main(String[] args) {
	  
	  Scanner s= new Scanner (System.in);
    
    System.out.println("Este programa pinta una pir�mide hecha a base de n�meros.");
    System.out.print("Por favor, introduzca la altura de la pir�mide:");
    int alturaIntroducida = s.nextInt();

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la l�nea de n�meros
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } // while
  }
}