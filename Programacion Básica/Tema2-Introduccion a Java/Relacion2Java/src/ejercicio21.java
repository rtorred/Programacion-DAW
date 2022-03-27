import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
	    
	    System.out.println("Por favor, vaya introduciendo n�meros enteros.");
	    System.out.println("Puede terminar mediante la introducci�n de un n�mero negativo.");

	    int numeroIntroducido;
	    int numeroDeElementos = 0;
	    int sumaImpares = 0;
	    int numeroDeElementosImpares = 0;
	    int maximoPar = 0;
	    
	    do {
	      numeroIntroducido = s.nextInt();
	      
	      if (numeroIntroducido >= 0) {
	        numeroDeElementos++;
	        if ((numeroIntroducido % 2) == 1) { // impar
	          sumaImpares += numeroIntroducido;
	          numeroDeElementosImpares++;
	        } else { // par
	          if (numeroIntroducido > maximoPar)
	            maximoPar = numeroIntroducido;
	        }
	      }
	    } while (numeroIntroducido >= 0);

	    System.out.println("Ha introducido " + numeroDeElementos + " n�meros");
	    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
	    System.out.println("El m�ximo de los pares es " + maximoPar);
	    s.close();
	  }

}
