package ejercicio1;

public class Empleado {
	
	private String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Empleado() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String toString() {
		return "Empleado: "+ nombre ;
	}
	
	

}
