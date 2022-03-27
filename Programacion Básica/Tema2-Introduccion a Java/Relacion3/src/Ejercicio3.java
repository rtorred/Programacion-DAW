
public class Ejercicio3 {

	public static void main(String[] args) {
		int limiteCarta1=1;
		int limiteCarta2=13;
		int limitePalo1=1;
		int limitePalo2=4;
		int carta = (int)Math.floor(Math.random()*limiteCarta2+limiteCarta1);
		System.out.println(carta);
		int palo = (int)Math.floor(Math.random()*limitePalo2+limitePalo1);
		System.out.println(palo);
		switch (carta) {
		case 10:
			System.out.print("La carta es la sota de ");
			break;
		case 11:
			System.out.print("La carta es el caballo de ");
			break;
		case 12:
			System.out.print("La carta es el rey de ");
			break;
		case 1:
			System.out.print("La carta es el AS de ");
			break;
			default:
				System.out.print("La carta es el "+carta+" de ");
		}
		switch (palo) {
		case 1:
			System.out.print("oros");
			break;
		case 2:
			System.out.print("espadas");
			break;
		case 3:
			System.out.print("copas");
			break;
		case 4:
			System.out.print("bastos");
			break;
		}

	}

}
