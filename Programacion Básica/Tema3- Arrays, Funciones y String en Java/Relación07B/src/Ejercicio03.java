/**Escribe un programa que genere 20 n�meros enteros aleatorios
 * (valores entre 100 y 999)..
 *  Estos n�meros se deben introducir en un array de 4 filas
 *  por 5 columnas. El programa mostrar� las sumas parciales de filas 
 *  y columnas igual que si de una hoja de c�lculo se tratara.
 *  La suma total debe aparecer en la esquina inferior derecha**/

public class Ejercicio03 {
  public static void main(String[] args) {
 
    int[][] num = new int[4][5]; // array de 4 filas por 5 columnas

    int fila;
    int columna;
        
    // Introduce valores aleatorios en el array
    for(fila = 0; fila < 4; fila++)
      for(columna = 0; columna < 5; columna++)
        num[fila][columna] = (int)(Math.random() * 900) + 100;

    // Muestra los datos y las sumas parciales de las filas
    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    // Muestra las sumas parciales de las columnas
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
