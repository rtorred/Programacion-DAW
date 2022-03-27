import static java.lang.Math.pow;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero,num1,num2,i;
  
        do{
            System.out.print("Introduce el numero del corte de la secuencia: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        num1=1;
        num2=1;

        System.out.print(num1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(num2 + " ");
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
        System.out.println();
    }

}
