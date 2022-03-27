package Examen;

import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		int tablero[]=new int[9];
		
		Scanner s= new Scanner(System.in);
		int x1,x2,x3;
		int o1,o2,o3;
		
		String pregunta = "";
		
		do {
				System.out.println("Bienvenido Usuario");
				Utiles.imprimeTablero(tablero);
				System.out.println(" ");
				System.out.println("Es turno del usuario");
				System.out.println("¿Que movimiento desea realizar?");
				String posicionUsuario= s.nextLine();
				while (Utiles.usuarioMueveFicha(posicionUsuario, tablero)==false) {
					System.out.println("¿Que movimiento desea realizar?");
					posicionUsuario= s.nextLine();
				}
				System.out.println("Movimiento valido");
				x1=Utiles.conviertePosicionMovimiento(posicionUsuario);
				Utiles.imprimeTablero(tablero);
		
				System.out.println(" ");
				System.out.println("Es turno del ordenador");
				o1=Utiles.mueveFichaAleatoria(tablero);
				Utiles.imprimeTablero(tablero);
				
				System.out.println(" ");
				System.out.println("Es turno del usuario");
				System.out.println("¿Que movimiento desea realizar?");
				posicionUsuario= s.nextLine();
				while (Utiles.usuarioMueveFicha(posicionUsuario, tablero)==false) {
					System.out.println("¿Que movimiento desea realizar?");
					posicionUsuario= s.nextLine();
				}
				System.out.println("Movimiento valido");
				x2=Utiles.conviertePosicionMovimiento(posicionUsuario);
				Utiles.imprimeTablero(tablero);
		
				System.out.println(" ");
				System.out.println("Es turno del ordenador");
				o2=Utiles.mueveFichaAleatoria(tablero);
				Utiles.imprimeTablero(tablero);
				
				System.out.println(" ");
				System.out.println("Es turno del usuario");
				System.out.println("¿Que movimiento desea realizar?");
				posicionUsuario= s.nextLine();
				while (Utiles.usuarioMueveFicha(posicionUsuario, tablero)==false) {
					System.out.println("¿Que movimiento desea realizar?");
					posicionUsuario= s.nextLine();
				}
				System.out.println("Movimiento valido");
				x3=Utiles.conviertePosicionMovimiento(posicionUsuario);
				Utiles.imprimeTablero(tablero);
		
				System.out.println(" ");
				System.out.println("Es turno del ordenador");
				o2=Utiles.mueveFichaAleatoria(tablero);
				Utiles.imprimeTablero(tablero);

				
				
			
			
			if (Utiles.ganaUsuario(x1, x2, x3)) {
				System.out.println(" ");
				System.out.println("Ha ganado el usuario");
			} else {
				System.out.println(" ");
				System.out.println("Ha ganado el ordenador");
			}
			System.out.println(" ");
			System.out.println("Quieres seguir jugando");
			pregunta= s.nextLine();
			Utiles.limpiarTablero(tablero);
		} while (pregunta!="no");
		
		System.out.println("ADIOS");
		

	}
}
