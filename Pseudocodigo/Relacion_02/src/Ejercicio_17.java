import java.util.Scanner;

/**
 * Bucles
 * 
 * 17. Realiza un programa que sume los 100 n�meros  siguientes a un n�mero entero y positivo
 *     introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
 *     un n�mero positivo).
 * 
 */
public class Ejercicio_17 {

  public static void main(String[] args) {
	  
	  Scanner s= new Scanner( System.in);
    
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Introduzca un n�mero entero positivo: ");
      numeroIntroducido = s.nextInt();
      
      if(numeroIntroducido < 0) {
        System.out.println("El n�mero introducido no es correcto, debe introducir un n�mero positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 n�meros siguientes a " + numeroIntroducido + " es " + suma);
    s.close();
  }
}