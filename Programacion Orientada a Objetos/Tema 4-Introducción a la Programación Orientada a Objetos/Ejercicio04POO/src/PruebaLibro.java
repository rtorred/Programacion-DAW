import java.util.Scanner;

public class PruebaLibro {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int ejemplares, prestados;
		String titulo, autor;
		
	    //1. Crea el objeto libro1 utilizando el constructor con par�metros. Libro1("El quijote", "Cervantes", 1, 0)
		Libro libro1= new Libro("El quijote","Cervantes",1,0);
		
	    //2. Crea el objeto libro2 utilizando el constructor por defecto
		Libro libro2 = new Libro();
		
		
	   // 3. Asigna a libro2 los datos pedidos por teclado.
		System.out.println("Introduce los datos del libro 2");
		System.out.println("Introduce el t�tulo del libro 2");
		titulo=s.nextLine();
		
		System.out.println("Introduce el autor del libro");
		autor=s.nextLine();
		
		System.out.println("Introduce el n�mero de ejemplares del libro");
		ejemplares=s.nextInt();
		
		System.out.println("Introduce el n�mero de libros prestados");
		prestados=s.nextInt();
	
		libro2.setTitulo(titulo);
		libro2.setAutor(autor);
		libro2.setEjemplares(ejemplares);
		libro2.setPrestados(prestados);
		System.out.println(libro2);
		
	    // 4. Muestra por pantalla los datos del objeto libro1.
		
		System.out.println("Los datos del libro 1 son:");
		
		System.out.println(libro1);
		
		
	    //5. Realiza un pr�stamo de libro1. El m�todo devuelve true si se ha podido realizar el pr�stamo y false en caso contrario. 
		System.out.println("Vamos a prestar el libro 1. Sus datos antes de prestar son:");
		System.out.println(libro1);
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el pr�stamo");
		}
		//6. Realiza una devoluci�n de libro1. El m�todo devuelve true si se ha podido realizar la devoluci�n y false en caso contrario.
		System.out.println("Vamos a delvolver el libro 1. Sus datos antes de devolver son: ");
		System.out.println(libro1);
		
		
		if(libro1.devolucionLibro()) {
			System.out.println("El libro 1 ha sido devuelto con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar la devoluci�n");
		}
		
		
	    //7. Realiza un pr�stamo de libro1.
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el pr�stamo");
		}
	    //8. Realiza otro pr�stamo de libro1. En este caso no se podr� realizar ya que 
		//solo hay un ejemplar de este libro y ya est� prestado. Se mostrar� por pantalla el mensaje 
		//�No quedan ejemplares del libro��
		
		if(libro1.prestamoLibro()) {
			System.out.println("El libro 1 ha sido prestado con �xito");
			
			System.out.println(libro1);	
			
		}
		else
		{
			System.out.println("No se ha podido realizar el pr�stamo");
		}
		
		
	    //9. Mostrar los datos del objeto libro1
		
		System.out.println("Los datos del libro 1 son:");
		System.out.println(libro1);
		
		
	    //10. Mostrar los datos del objeto libro2
		
		System.out.println("Los datos del libro 2 son:");
		System.out.println(libro2);

		s.close();
		

	}

}
