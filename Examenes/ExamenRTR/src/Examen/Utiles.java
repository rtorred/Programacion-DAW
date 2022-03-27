package Examen;

public class Utiles {

	public static int randomicer(int max, int min) {
		int numero = (int) Math.floor(Math.random() * (max - min) + min);
		return numero;
	}

	public static void imprimeTablero(int[] tablero) {

		for (int i = 0; i < tablero.length; i++) {
			if (i == 3) {
				System.out.println();
			} else if (i == 6) {
				System.out.println();
			}

			if (tablero[i] == 0) {
				System.out.print("-");
			} else if (tablero[i] == 1) {
				System.out.print("x");
			} else if (tablero[i] == 2) {
				System.out.print("o");
			}

		}
		System.out.println(" ");
	}

	public static int mueveFichaAleatoria(int[] tablero) {
		int aleatorio = randomicer(9, 0);

		while (tablero[aleatorio] == 1) {
			aleatorio = randomicer(9, 0);
		}
		tablero[aleatorio]=2;
		return aleatorio;
	}

	public static int conviertePosicionMovimiento(String posicion) {
		String posicionMayuscula = posicion.toUpperCase();
		switch (posicionMayuscula) {
		case "ARRIBA IZQUIERDA":
			return 0;
		case "ARRIBA CENTRO":
			return 1;
		case "ARRIBA DERECHA":
			return 2;
		case "CENTRO IZQUIERDA":
			return 3;
		case "CENTRO CENTRO":
			return 4;
		case "CENTRO DERECHA":
			return 5;
		case "ABAJO IZQUIERDA":
			return 6;
		case "ABAJO CENTRO":
			return 7;
		case "ABAJO DERECHA":
			return 8;
		default:
			return -1;
		}
	}

	public static boolean usuarioMueveFicha(String posicion, int[] tablero) {
		boolean res = true;
		if (tablero[conviertePosicionMovimiento(posicion)] == 1) {
			res = false;
		} else if (tablero[conviertePosicionMovimiento(posicion)] == 2) {
			res = false;
		}
		tablero[conviertePosicionMovimiento(posicion)]=1;
		return res;
	}
	
	public static int[] limpiarTablero(int[] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			tablero[i]=0;
		}
		return tablero;
	}
	
	public static boolean ganaPrograma(int ficha1,int ficha2, int ficha3) {
		boolean res=false;
		
		if ((ficha1==0 && ficha2==1 && ficha3==2) | (ficha3==0 && ficha2==1 && ficha1==2)| (ficha1==0 && ficha3==1 && ficha2==2) | (ficha2==0 && ficha1==1 && ficha3==2) | (ficha2==0 && ficha3==1 && ficha1==2) ) {
			res = true;
		} else if((ficha1==3 && ficha2==4 && ficha3==5) | (ficha3==3 && ficha2==4 && ficha1==5)| (ficha1==3 && ficha3==4 && ficha2==5) | (ficha2==3 && ficha1==4 && ficha3==5) | (ficha2==3 && ficha3==4 && ficha1==5)){
			res = true;
		} else if((ficha1==6 && ficha2==7 && ficha3==8) | (ficha3==6 && ficha2==7 && ficha1==8)| (ficha1==6 && ficha3==7 && ficha2==8) | (ficha2==6 && ficha1==7 && ficha3==8) | (ficha2==6 && ficha3==7 && ficha1==8)){
			res = true;
		} else if((ficha1==0 && ficha2==3 && ficha3==6) | (ficha3==0 && ficha2==3 && ficha1==6)| (ficha1==0 && ficha3==3 && ficha2==6) | (ficha2==0 && ficha1==3 && ficha3==6) | (ficha2==0 && ficha3==3 && ficha1==6)){
			res = true;
		} else if((ficha1==1 && ficha2==4 && ficha3==7) | (ficha3==1 && ficha2==4 && ficha1==7)| (ficha1==1 && ficha3==4 && ficha2==7) | (ficha2==1 && ficha1==4 && ficha3==7) | (ficha2==1 && ficha3==4 && ficha1==7)){
			res = true;
		} else if((ficha1==2 && ficha2==5 && ficha3==8) | (ficha3==2 && ficha2==5 && ficha1==8)| (ficha1==2 && ficha3==5 && ficha2==8) | (ficha2==2 && ficha1==5 && ficha3==8) | (ficha2==2 && ficha3==5 && ficha1==8)){
			res = true;
		} else if((ficha1==0 && ficha2==4 && ficha3==8) | (ficha3==0 && ficha2==4 && ficha1==8)| (ficha1==0 && ficha3==4 && ficha2==8) | (ficha2==0 && ficha1==4 && ficha3==8) | (ficha2==0 && ficha3==4 && ficha1==8)){
			res = true;
		} else if((ficha1==2 && ficha2==4 && ficha3==6) | (ficha3==2 && ficha2==4 && ficha1==6)| (ficha1==2 && ficha3==4 && ficha2==6) | (ficha2==2 && ficha1==4 && ficha3==6) | (ficha2==2 && ficha3==4 && ficha1==6)){
			res = true;
		}
		return res;
	}
	
	public static boolean ganaUsuario(int ficha1,int ficha2, int ficha3) {
		boolean res=false;
		
		if ((ficha1==0 && ficha2==1 && ficha3==2) | (ficha3==0 && ficha2==1 && ficha1==2)| (ficha1==0 && ficha3==1 && ficha2==2) | (ficha2==0 && ficha1==1 && ficha3==2) | (ficha2==0 && ficha3==1 && ficha1==2) ) {
			res = true;
		} else if((ficha1==3 && ficha2==4 && ficha3==5) | (ficha3==3 && ficha2==4 && ficha1==5)| (ficha1==3 && ficha3==4 && ficha2==5) | (ficha2==3 && ficha1==4 && ficha3==5) | (ficha2==3 && ficha3==4 && ficha1==5)){
			res = true;
		} else if((ficha1==6 && ficha2==7 && ficha3==8) | (ficha3==6 && ficha2==7 && ficha1==8)| (ficha1==6 && ficha3==7 && ficha2==8) | (ficha2==6 && ficha1==7 && ficha3==8) | (ficha2==6 && ficha3==7 && ficha1==8)){
			res = true;
		} else if((ficha1==0 && ficha2==3 && ficha3==6) | (ficha3==0 && ficha2==3 && ficha1==6)| (ficha1==0 && ficha3==3 && ficha2==6) | (ficha2==0 && ficha1==3 && ficha3==6) | (ficha2==0 && ficha3==3 && ficha1==6)){
			res = true;
		} else if((ficha1==1 && ficha2==4 && ficha3==7) | (ficha3==1 && ficha2==4 && ficha1==7)| (ficha1==1 && ficha3==4 && ficha2==7) | (ficha2==1 && ficha1==4 && ficha3==7) | (ficha2==1 && ficha3==4 && ficha1==7)){
			res = true;
		} else if((ficha1==2 && ficha2==5 && ficha3==8) | (ficha3==2 && ficha2==5 && ficha1==8)| (ficha1==2 && ficha3==5 && ficha2==8) | (ficha2==2 && ficha1==5 && ficha3==8) | (ficha2==2 && ficha3==5 && ficha1==8)){
			res = true;
		} else if((ficha1==0 && ficha2==4 && ficha3==8) | (ficha3==0 && ficha2==4 && ficha1==8)| (ficha1==0 && ficha3==4 && ficha2==8) | (ficha2==0 && ficha1==4 && ficha3==8) | (ficha2==0 && ficha3==4 && ficha1==8)){
			res = true;
		} else if((ficha1==2 && ficha2==4 && ficha3==6) | (ficha3==2 && ficha2==4 && ficha1==6)| (ficha1==2 && ficha3==4 && ficha2==6) | (ficha2==2 && ficha1==4 && ficha3==6) | (ficha2==2 && ficha3==4 && ficha1==6)){
			res = true;
		}
		return res;
	}
	

}
