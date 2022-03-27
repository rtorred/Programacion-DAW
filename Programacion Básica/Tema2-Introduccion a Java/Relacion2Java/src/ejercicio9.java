import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n, cifras;
        System.out.print("Introduce un número entero: ");
        n = sn.nextInt();
        cifras= 0;    
        while(n!=0){             
             n = n/10;        
             cifras++;          
        }
        System.out.println("El número tiene " + cifras+ " cifras");
	}

}
