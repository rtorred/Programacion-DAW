import java.util.Scanner;

/**
 * Bucles
 * 
 * 19. Realiza un programa que pinte una pir�mide por pantalla. La altura
 *     se debe pedir por teclado. El car�cter con el que se pinta la pir�mide
 *     tambi�n se debe pedir por teclado.
 * 
 */
public class Ejercicio_19 {

  public static void main(String[] args) {
	  
	  Scanner s1= new Scanner(System.in);
	  Scanner s2= new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pir�mide: ");
    int alturaIntroducida = s1.nextInt();

    System.out.print("Introduzca el car�cter de relleno: ");
    String relleno = s2.nextLine();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la l�nea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
      s1.close();
      s2.close();
    }
  }
}