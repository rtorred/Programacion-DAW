/**
 *  Arrays
 * 
 * 10. Escribe un programa que genere 20 n�meros enteros aleatorios entre 0 y 100 y que los
 *     almacene en un array. El programa debe ser capaz de pasar todos los n�meros pares a
 *     las primeras posiciones del array (del 0 en adelante) y todos los n�meros impares a
 *     las celdas restantes. Utiliza arrays auxiliares si es necesario.
 *
 */
public class Ejercicio10 {

  public static void main(String[] args) {
  
    int[] n = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;
    
    for (i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 101);
      // Separa los n�meros metiendo los pares en un array
      // y los impares en otro.
      if (n[i] % 2 == 0) {
        par[pares++] = n[i];
      } else {
        impar[impares++] = n[i];
      }
    }
    
    // Muestra el array original
    System.out.println("\nArray original:\n");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    
    // Mete los pares en las primeras posiciones
    // del array original.
    for (i = 0; i < pares; i++) {
      n[i] = par[i];
    }
    
    // Mete los impares en los huecos que quedan.
    for (i = pares; i < 20; i++) {
      n[i] = impar[i - pares];
    }

    // Muestra el resultado.
    System.out.println("\n\nArray con los pares al principio:\n");
    for (i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
  }
}