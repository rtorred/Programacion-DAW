//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
//separados por espacios. Muestra también el máximo, el mínimo y la media
//de esos números.

public class Ejercicio5 {

	public static void main(String[] args) {
		int num1=100;
		int num2=199;
		int carta = (int)Math.floor(Math.random()*num2+num1);
		System.out.println(carta);
		int palo = (int)Math.floor(Math.random()*num2+num1);
		System.out.println(palo);
		for (int i = 1; i <=50; i++) {
			System.out.println(((int)(Math.random()*num2+1)+num1)+" ");
			
		}

	}

}
