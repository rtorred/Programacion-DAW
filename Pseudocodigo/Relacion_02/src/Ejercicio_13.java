import java.util.Scanner;

/**
 * Bucles
 * 
 * 13. Escribe un programa que lea una lista de diez n�meros y determine
 *     cu�ntos son positivos, y cu�ntos son negativos.

 */

public class Ejercicio_13 {

  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int n;
  
    System.out.println("Por favor, introduzca 10 n�meros enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
    	n=s.nextInt();
    	
      if (n< 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
    s.close();
  }
  
}