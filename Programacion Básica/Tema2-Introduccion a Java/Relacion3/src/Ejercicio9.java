
public class Ejercicio9 {

	public static void main(String[] args) {
		int contSusp=0;
		int contSufi=0;
		int contB=0;
		int contN=0;
		int contSobre=0;
		for (int i = 1; i <= 20; i++) {
			int notasAleatorias=(int)(Math.random()*11);
			System.out.print((int)(Math.random()*11) + " ");
			switch (notasAleatorias) {
			case 1,2,3,4:
				System.out.println("SUSPENSO");
				contSusp++;
				break;
			case 5:
				System.out.println("SUFICIENTE");
				contSufi++;
				break;
			case 6:
				System.out.println("BIEN");
				contB++;
				break;
			case 7,8:
				System.out.println("NOTABLE");
				contN++;
				break;
			case 9,10:
				System.out.println("SOBRESALIENTE");
				contSobre++;
				break;

			default:
				break;
			}
		}

	}

}
