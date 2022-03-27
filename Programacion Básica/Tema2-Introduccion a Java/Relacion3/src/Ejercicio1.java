//Escribe un programa que muestre la tirada de tres dados. 
//Se debe mostrar también la suma
//total (los puntos que suman entre los tres dados).


public class Ejercicio1 {

	public static void main(String[] args) {
		int num1=1;
		int num2=6;
		int tirada1 = (int)Math.floor(Math.random()*num2+num1);
		System.out.println(tirada1);
		int tirada2 = (int)Math.floor(Math.random()*num2+num1);
		System.out.println(tirada2);
		int tirada3 = (int)Math.floor(Math.random()*num2+num1);
		System.out.println(tirada3);
		int suma= tirada1+tirada2;
		System.out.println("Esta es la suma de las tres tiradas : "+tirada1+" + "+tirada2+" + " +tirada3+" = "+suma);
	}

}
