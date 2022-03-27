package Matematicas;

public class ComprobarMatematicas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // esCapicua ///////////////////////////////////////////////////

    if (Varias.esCapicua(29)) {
      System.out.println("El 29 es capic�a");
    }

    if (Varias.esCapicua(464)) {
      System.out.println("El 464 es capic�a");
    }

    // esPrimo /////////////////////////////////////////////////////

    if (Varias.esPrimo(29)) {
      System.out.println("El 29 es primo");
    }

    if (Varias.esPrimo(80)) {
      System.out.println("El 80 es primo");
    }
    // siguientePrimo //////////////////////////////////////////////

    System.out.println("El siguiente primo mayor a 23 es " + Varias.siguientePrimo(23));
    System.out.println("El siguiente primo mayor a 100 es " + Varias.siguientePrimo(100));
    
    // potencia ////////////////////////////////////////////////////

    System.out.println("2^10 = " + Varias.potencia(2, 10));
    System.out.println("5^(-3) = " + Varias.potencia(5, -3));
    System.out.println("10^6 = " + Varias.potencia(10, 6));
    
    // digitos /////////////////////////////////////////////////////

    System.out.println("El n�mero 0 tiene " + Varias.digitos(0) + " d�gito/s.");
    System.out.println("El n�mero 7 tiene " + Varias.digitos(7) + " d�gito/s.");
    System.out.println("El n�mero 674893123 tiene " + Varias.digitos(674893123) + " d�gito/s.");

    // voltea //////////////////////////////////////////////////////

    System.out.println("El 5 volteado es " + Varias.voltea(5));
    System.out.println("El 398004321 volteado es " + Varias.voltea(398004321));
    System.out.println("El -75839 volteado es " + Varias.voltea(-75839));

    // digitoN /////////////////////////////////////////////////////

    System.out.println("En la posici�n 0 del 3452 est� el " + Varias.digitoN(3452, 0));
    System.out.println("En la posici�n 6 del 857964034 est� el " + Varias.digitoN(857964034, 6));
    System.out.println("En la posici�n 4 del 857964034 est� el " + Varias.digitoN(857964034, 4));

}
}
