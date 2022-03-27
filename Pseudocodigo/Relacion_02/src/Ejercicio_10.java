

/**
 *  Bucles
 * 
 * 10. Escribe un programa que calcule la media de un conjunto de n�meros
 *     positivos introducidos por teclado. A priori, el programa no sabe
 *     cu�ntos n�meros se introducir�n. El usuario indicar� que ha terminado
 *     de introducir los datos cuando meta un n�mero negativo.
 * 
 */
import java.util.Scanner;
public class Ejercicio_10 {

  public static void main(String[] args) {
	  
	Scanner s=new Scanner(System.in);
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los n�meros positivos introducidos.");
    System.out.println("Vaya introduciendo n�meros (puede parar introduciendo un n�mero negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = s.nextDouble();
      numeros++;
      suma += numeroIntroducido;
    }
    s.close();
    
    System.out.println("La media de los n�meros positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}