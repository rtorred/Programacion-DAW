/**
 * Ejercicio 12
 * Realiza un programa que pida 10 n�meros por teclado y que los almacene en un array. A
 * continuaci�n se mostrar� el contenido de ese array junto al �ndice (0 � 9). Seguidamente el
 * programa pedir� dos posiciones a las que llamaremos �inicial� y �final�. Se debe
 * comprobar que inicial es menor que final y que ambos n�meros est�n entre 0 y 9. El
 * programa deber� colocar el n�mero de la posici�n inicial en la posici�n final, rotando el
 * resto de n�meros para que no se pierda ninguno. Al final se debe mostrar el array
 * resultante.
 */
import java.util.Scanner;
public class Ejercicio12 {

  public static void main(String[] args) {
	  Scanner sn=new Scanner(System.in);
  
    int[] n = new int[10];
    int[] res = new int[10];
    int[] aux = new int[10];
    int initialnum;
    int finalnum;
    
    for (int i = 0; i < 10; i++) {
    	System.out.println("Ve introduciendo numeros y pulsando INTRO:");
		n[i]= sn.nextInt();
	}
    
    //imprimimos el array nuestro
    System.out.println("Array relleno:\n");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for (int i = 0; i <=60; i++) {
        System.out.print("_");
    }
    System.out.println("");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("|");
    
    
    //damos las posiciones
    
    System.out.println("Dame una posicion inicial : ");
    initialnum=sn.nextInt();
    System.out.println("Dame una posicion final : ");
    finalnum=sn.nextInt();
    
    for (int i = 0; i < 10; i++) {
        res[i] = n[i];
      }
    res[finalnum]=n[initialnum];
    
    for (int i = finalnum + 1; i < 10; i++)
        res[i] = n[i - 1];
    res[0]=res[9];
    
    for (int i = 0; i < initialnum; i++)
        res[i + 1] = n[i];
    
    //mostramos el resultado
    System.out.println("Array resultado:\n");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for (int i = 0; i <=60; i++) {
        System.out.print("_");
    }
    System.out.println("");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", res[i]);
    }
    System.out.println("|");
    
    
  }
}