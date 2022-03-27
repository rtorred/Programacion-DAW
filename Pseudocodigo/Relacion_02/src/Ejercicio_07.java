

/**
 * Bucles
 * 
 * 7. Realiza el control de acceso a una caja fuerte. La combinaci�n
 *    ser� un n�mero de 4 cifras. El programa nos pedir� la combinaci�n
 *    para abrirla. Si no acertamos, se nos mostrar� el mensaje
 *    �Lo siento, esa no es la combinaci�n� y si acertamos se nos dir�
 *    �La caja fuerte se ha abierto satisfactoriamente�. Tendremos cuatro
 *    oportunidades para abrir la caja fuerte.
 * 
 * @author Luis Jos� S�nchez
 */
import java.util.Scanner;
public class Ejercicio_07 {

  public static void main(String[] args) {
	  
	 Scanner s=new Scanner(System.in);
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = s.nextInt();
      
      if (numeroIntroducido == 8888) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
    s.close();
  }
}