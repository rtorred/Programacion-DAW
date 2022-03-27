package vehiculo;

import java.util.Scanner;

public class Ejercicio3 {
	
	static int Maximo_Coches=50 ;
	static int posicion;
	static Vehiculo[] concesionario = new Vehiculo[Maximo_Coches];
	static Scanner sn= new Scanner(System.in);
	static int cantidadVehiculos;
	
	
	public static void nuevoVehiculo() {
		do {
            System.out.print("Numero de vehiculos? ");
             cantidadVehiculos= sn.nextInt();
             
        } while (cantidadVehiculos < 0 || cantidadVehiculos > Maximo_Coches);
		
		for (int i = 1; i <=cantidadVehiculos; i++) {
			sn.nextLine();
			Vehiculo newVehiculo = new Vehiculo();
			if (concesionario[i]==null) {
				System.out.println("Dime la marca del vehiculo");
				
				newVehiculo.setMarca(sn.nextLine());

				System.out.println("Dime la matricula del vehiculo");
				newVehiculo.setMatricula(sn.nextLine());

				System.out.println("Dime el numero de kilometros recorridos por el vehiculo");
				newVehiculo.setNumeroKilometros(sn.nextInt());

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

				System.out.println("Dime el dni del propietario");
				newVehiculo.setDniPropietario(sn.nextLine());
				
				concesionario[i]=newVehiculo;
			} else {
				System.out.println("Esta posicion esta ocupada");
			}
			
			
		}
		
		
	}
	
	public static Vehiculo buscarVehiculo(String matricula) {
		Vehiculo encontrado = null;
		for (int i = 0; i < concesionario.length; i++) {
			if (concesionario[i]!=null) {
				if (concesionario[i].getMatricula().equals(matricula)) {
					encontrado=concesionario[i];
				}
			}
			
		}
		return encontrado;
	}
	
	public static void modificaKms(String matricula, int nkilometros) {
		for (int i = 0; i < concesionario.length; i++) {
			if (concesionario[i]!=null) {
				if (concesionario[i].getMatricula().equals(matricula)) {
					concesionario[i].setNumeroKilometros(nkilometros);
				}
			}
			
		}
	}
	
	public static void leeVehiculo() {
		
		Vehiculo v = new Vehiculo();
		for (int i = 0; i < concesionario.length; i++) {
			if (concesionario[i]!=null) {
				System.out.println(concesionario[i]);
			}
			
		}
		
		
		
	}
	
	public static void CRUD() {
		int opcion=-1;
		do {
			
			System.out.println("==============================");
			System.out.println("Menu de Opciones");
			System.out.println("==============================");
			System.out.println("1.Nuevo Vehiculo");
			System.out.println("2.Listar Vehiculos");
			System.out.println("3.Buscar Vehiculos");
			System.out.println("4.Modificar kms de vehiculo");
			System.out.println("5.Salir");
			System.out.println("==============================");
			
			System.out.println("Elige una de las opciones posibles");
			opcion = sn.nextInt();
			
			
			

			switch (opcion) {
			case 1:
				nuevoVehiculo();
				break;
			case 2:
				leeVehiculo();

				break;
			case 3:
				System.out.println("Inserta una matricula a buscar: ");
				sn.nextLine();
				String matriculaBuscar = sn.nextLine();
				System.out.println(buscarVehiculo(matriculaBuscar));
				break;
			case 4:
				sn.nextLine();
				System.out.println("Inserta una matricula a buscar : ");
				String matriculaModificaKm= sn.nextLine();
				System.out.println("Inserta los kilomtros a actualizar: ");
				int kilometrosActualizar= sn.nextInt();
				modificaKms(matriculaModificaKm, kilometrosActualizar);
				break;
			}
		} while (opcion != 5);

	}
	
	
	
	public static void main(String[] args) {
		CRUD();
		System.out.println("Adios !!");
	}

}
