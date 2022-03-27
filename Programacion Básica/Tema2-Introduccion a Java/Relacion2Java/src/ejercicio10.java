import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int num,acum,cont;
		double media;
        acum= 0;
        cont=0;
        num=0;
        do{
        	
        	
        	

			System.out.println("Introduce numeros: ");
			num= sn.nextInt();
			if (num>0) {
				cont++;
				acum=acum+num;
			}
			
        } while  (num>0) ;
        
		media= acum/cont;
		System.out.println("La media de los numeros positivos es: "+media);
	}

}
