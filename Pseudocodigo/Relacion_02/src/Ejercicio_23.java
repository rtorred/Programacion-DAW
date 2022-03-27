import java.util.Scanner;

/**
 * Bucles
 * 
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada
 *     de n�meros mientras su suma no supere  el valor 10000. Cuando esto �ltimo
 *     ocurra, se debe mostrar el total acumulado, el contador de los n�meros
 *     introducidos y la media.
 * 
 */
public class Ejercicio_23 {
	
	

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