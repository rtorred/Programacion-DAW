//Realiza un programa que vaya generando números aleatorios pares entre 0 
//y 100 y que no termine de generar números hasta que no saque el 24. 
//El programa deberá decir al final cuántos números se han generado.

public class Ejercicio7 {

	public static void main(String[] args) {
		int numeroAleatorio=0;
		int cont=0;
		do {
			numeroAleatorio=(int)(Math.random()*101);
			System.out.println(numeroAleatorio + " ");
			cont++;
		} while (numeroAleatorio!=24);
		System.out.println("Se han generado : "+cont+" numeros.");
	}

}
