package vehiculo;

public class Vehiculo {
	private String marca;
	private String matricula;
	private int numeroKilometros;
	private Fecha fechaMatriculacion;
	private String descripcion;
	private double precio;
	private String nombrePropietario;
	private String dniPropietario;
	
	
	public Vehiculo() {
		super();
	}


	public Vehiculo(String marca, String matricula, int numeroKilometros, Fecha fechaMatriculacion, String descripcion,
			double precio, String nombrePropietario, String dniPropietario) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.numeroKilometros = numeroKilometros;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombrePropietario = nombrePropietario;
		this.dniPropietario = dniPropietario;
	}
	
	public Vehiculo(Vehiculo v) {
		v.marca= marca;
		v.matricula=matricula;
		v.numeroKilometros=numeroKilometros;
		v.fechaMatriculacion=fechaMatriculacion;
		v.descripcion=descripcion;
		v.precio=precio;
		v.nombrePropietario=nombrePropietario;
		v.dniPropietario=dniPropietario;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getNumeroKilometros() {
		return numeroKilometros;
	}


	public void setNumeroKilometros(int numeroKilometros) {
		this.numeroKilometros = numeroKilometros;
	}


	public Fecha getFechaMatriculacion() {
		return fechaMatriculacion;
	}


	public void setFechaMatriculacion(Fecha fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getNombrePropietario() {
		return nombrePropietario;
	}


	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}


	public String getDniPropietario() {
		return dniPropietario;
	}


	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}


	@Override
	public String toString() {
		return "\nMarca : " + marca +
				"\nMatricula : " + matricula+ 
				"\nNumero de kilometros : "+ numeroKilometros + 
				"\nFecha de Matriculacion: " + fechaMatriculacion + 
				"\nDescripcion : " + descripcion + 
				"\nPrecio : " + precio+
				"\nNombre del Propietario : " + nombrePropietario + 
				"\nDNI del Propietario : " + dniPropietario ;
	}
	
	
	public int getAnios() {
		Fecha f= new Fecha(16,03,2022);
		switch (fechaMatriculacion.getMes()) {
		case 12:
			
			break;

		default:
			break;
		}
		return fechaMatriculacion.getAnio();
	}

}
