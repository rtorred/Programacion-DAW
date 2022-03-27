import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		  Scanner s2= new Scanner(System.in);
	    
	    System.out.print("Por favor, introduzca la altura de la pir�mide: ");
	    int alturaIntroducida = s1.nextInt();
	    

	    System.out.print("Introduzca el car�cter de relleno: ");
	    String relleno = s2.nextLine();
	    
	    int altura = 1;
	    int i = 0;
	    int espaciosPorDelante = alturaIntroducida - 1;
	    int espaciosInternos = 0;
	    
	    while (altura < alturaIntroducida) {
	      
	      // inserta espacios delante
	      for (i = 1; i <= espaciosPorDelante; i++) {
	        System.out.print(" ");
	      }
	      
	      // pinta la l�nea
	      System.out.print(relleno);
	      for (i = 1; i < espaciosInternos; i++) {
	        System.out.print(" ");
	      }
	      
	      if (altura>1) {
	        System.out.print(relleno);
	      }
	      
	      System.out.println();
	      altura++;
	      espaciosPorDelante--;
	      espaciosInternos += 2;
	    } // while ////////////////////////////
	    
	    // base de la pir�mide
	    for (i = 1; i < altura*2; i++) {
	      System.out.print(relleno);
	    }
	  }

}
