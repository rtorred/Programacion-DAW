

/**
 *  Bucles
 * 
 * 5. Muestra los n�meros del 320 al 160, contando de 20 en 20 hacia
 *    atr�s utilizando un bucle while.
 * 
 */
public class Ejercicio_05 {

  public static void main(String[] args) {
    
    int i = 320;
    
    while(i >= 160) {
        System.out.println(i);
        i-=20;
    }
  }
}