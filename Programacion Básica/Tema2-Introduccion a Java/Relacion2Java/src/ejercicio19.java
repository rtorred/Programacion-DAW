import java.util.Scanner;

public class ejercicio19 {

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
	      for (int i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }
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
