
public class Ejercicio03POO {
	public static void main(String[] args) {
	
	    //1. Utilizar el constructor por defecto 
		Contador contador1=new Contador();
	   // 2. Asignar un valor al contador
		contador1.setContador(5);
		System.out.println("EL valor de contador1 es:"+contador1.getContador());
	   // 3. Incrementar el contador
		contador1.incrementar();
		

	    //4. Mostrar el valor actual
		System.out.println("EL valor incrementado del contador1 es:"+contador1.getContador());
	   //5. Incrementar el contador dos veces
		contador1.incrementar();
		contador1.incrementar();
	    //6. Mostrar el valor actual
		System.out.println("EL valor incrementado dos veces del contador1 es:"+contador1.getContador());
	    // 7. Restar 1 al valor del contador
		contador1.decrementar();
	    // 8. Mostrar el valor actual
		System.out.println("EL valor decrementado del contador1 es:"+contador1.getContador());
		
	    // 9. Crear un nuevo objeto Contador con valor inicial 10
		Contador contador2=new Contador(10);
	    //10. Incrementar y decrementar el contador2 y mostrar su valor  
		contador2.incrementar();
		contador2.decrementar();
		System.out.println("EL valor incrementado y decrementado del contador2 es:"+contador2.getContador());
		
	    // 11. Crear un objeto Contador utilizando el constructor copia. Crear el objeto contador3 como copia de contador2
		Contador contador3=new Contador(contador2 );
	  
	    //13. Mostrar el valor de contador3
		System.out.println("EL valor del contador 3 es:"+contador3.getContador());
		
	
	
	}
	}

