package vehiculo;

import java.util.Scanner;

import jdk.jshell.Diag;

public class Ejercicio2 {

	static Scanner sn = new Scanner(System.in);
	
	public static boolean validaNumeroKilometros(int nKilometros) {
		boolean res = false;
		if (nKilometros>=0) {
			res = true;
		}
		return res;
	}
	
	public static boolean validaAntiguedad(Fecha f) {
		boolean res= false;
		
		
		return res;
	}
	
	public static boolean validaMatricula(String matricula) {
		boolean res = false;
		int cont=0;
		for (int i = 0; i < matricula.length(); i++) {
			if (matricula.charAt(i)=='1' || matricula.charAt(i)=='2' || matricula.charAt(i)=='3'
					|| matricula.charAt(i)=='4' || matricula.charAt(i)=='5' || matricula.charAt(i)=='5'
					|| matricula.charAt(i)=='6' || matricula.charAt(i)=='7' || matricula.charAt(i)=='8'
					|| matricula.charAt(i)=='9' || matricula.charAt(i)=='0') {
				cont++;
			} else if((cont == 5 || cont==6 || cont==7) && (matricula.charAt(8)=='A' || matricula.charAt(8)=='B'||
					matricula.charAt(8)=='C' || matricula.charAt(8)=='D'||
					matricula.charAt(8)=='E' || matricula.charAt(8)=='F'|| 
					matricula.charAt(8)=='G' || matricula.charAt(8)=='H'||
					matricula.charAt(8)=='I' || matricula.charAt(8)=='J'||
					matricula.charAt(8)=='K' || matricula.charAt(8)=='L'||
					matricula.charAt(8)=='M' || matricula.charAt(8)=='N'||
					matricula.charAt(8)=='O' || matricula.charAt(8)=='P'||
					matricula.charAt(8)=='Q' || matricula.charAt(8)=='R'||
					matricula.charAt(8)=='S' || matricula.charAt(8)=='T'||
					matricula.charAt(8)=='U' || matricula.charAt(8)=='V'||
					matricula.charAt(8)=='W' || matricula.charAt(8)=='Y'||
																											matricula.charAt(8)=='Z')) {
				res=true;
				
			}
		}
		return res;
	}
	
	public static boolean validaDNI(String dni) {
		boolean res = false;
		int cont=0;
		for (int i = 0; i < dni.length(); i++) {
			if (dni.charAt(i)=='1' || dni.charAt(i)=='2' || dni.charAt(i)=='3'
					|| dni.charAt(i)=='4' || dni.charAt(i)=='5' || dni.charAt(i)=='5'
					|| dni.charAt(i)=='6' || dni.charAt(i)=='7' || dni.charAt(i)=='8'
					|| dni.charAt(i)=='9' || dni.charAt(i)=='0') {
				cont++;
			} else if(cont == 8 && (dni.charAt(8)=='A' || dni.charAt(8)=='B'||
					dni.charAt(8)=='C' || dni.charAt(8)=='D'||
					dni.charAt(8)=='E' || dni.charAt(8)=='F'|| 
					dni.charAt(8)=='G' || dni.charAt(8)=='H'||
					dni.charAt(8)=='I' || dni.charAt(8)=='J'||
					dni.charAt(8)=='K' || dni.charAt(8)=='L'||
					dni.charAt(8)=='M' || dni.charAt(8)=='N'||
					dni.charAt(8)=='O' || dni.charAt(8)=='P'||
					dni.charAt(8)=='Q' || dni.charAt(8)=='R'||
					dni.charAt(8)=='S' || dni.charAt(8)=='T'||
					dni.charAt(8)=='U' || dni.charAt(8)=='V'||
					dni.charAt(8)=='W' || dni.charAt(8)=='Y'||
					dni.charAt(8)=='Z')) {
				res=true;
				
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Vehiculo newVehiculo = new Vehiculo();
		int opcion;
		

		do {
			
			System.out.println("==============================");
			System.out.println("Menu de Opciones");
			System.out.println("==============================");
			System.out.println("1.Nuevo Vehiculo");
			System.out.println("2.Ver matricula");
			System.out.println("3.Ver numero de kilometros");
			System.out.println("4.Actualizar kilometros");
			System.out.println("5.Ver años antigüedad");
			System.out.println("6.Mostrar Propietario");
			System.out.println("7.Mostrar descripcion");
			System.out.println("8.Mostrar precio");
			System.out.println("9.Salir");
			System.out.println("==============================");
			
			System.out.println("Elige una de las opciones posibles");
			opcion = sn.nextInt();
			
			String dniV;
			String matriculaV;
			int numeroKmV;
			String descripcion;
			double precio;
			
			

			switch (opcion) {
			case 1:
				
				newVehiculo= new Vehiculo();
				sn.nextLine();
				System.out.println("Dime la marca del vehiculo");
				newVehiculo.setMarca(sn.nextLine());

				System.out.println("Dime la matricula del vehiculo");
				newVehiculo.setMatricula(sn.nextLine());
				
				do {
					System.out.println("Dime el numero de kilometros recorridos por el vehiculo");
					numeroKmV=sn.nextInt();
					
					if (validaNumeroKilometros(numeroKmV)==false) {
						System.out.println("Numero de kilometros no validos");
					}
				} while (validaNumeroKilometros(numeroKmV)==false);
				
				newVehiculo.setNumeroKilometros(numeroKmV);

				System.out.println("Dime la fecha de matriculacion");
				System.out.println("Primero dia: ");
				int dia = sn.nextInt();
				System.out.println("Mes: ");
				int mes = sn.nextInt();
				System.out.println("Año: ");
				int anio = sn.nextInt();
				newVehiculo.setFechaMatriculacion(new Fecha(dia, mes, anio));

				sn.nextLine();

				System.out.println("Dime una descripcion del vehiculo");
				newVehiculo.setDescripcion(sn.nextLine());

				System.out.println("Dime el precio que tiene el vehiculo");
				newVehiculo.setPrecio(sn.nextDouble());

				sn.nextLine();

				System.out.println("Dime el nombre de su propietario");
				newVehiculo.setNombrePropietario(sn.nextLine());
				
				
				
				do {
					System.out.println("Dime el dni del propietario");
					dniV=sn.nextLine();
					
					if (validaDNI(dniV)==false) {
						System.out.println("DNI mal formado");
					}
				} while (validaDNI(dniV)==false);
				
				newVehiculo.setDniPropietario(dniV);

				break;
			case 2:
				System.out.println("Esta es su matricula : "+newVehiculo.getMatricula());

				break;
			case 3:
				System.out.println("Esta es la cantidad de kilometros : "+newVehiculo.getNumeroKilometros());
				break;
			case 4:
				System.out.println("Actualiza los kilometros : ");
				newVehiculo.setNumeroKilometros(sn.nextInt());
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("Este es su propietario : " +newVehiculo.getNombrePropietario());
				break;
			case 7:
				System.out.println("Descripcion del vehiculo : "+ newVehiculo.getDescripcion());
				break;
			case 8:
				System.out.println("El precio del vehiculo es : "+newVehiculo.getPrecio());
				break;

			}
		} while (opcion < 9);
		System.out.println("Adios!!");
	}

}
