import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1,num2,acum;
		System.out.println("dame el primer numero");
		num1=sn.nextInt();
		System.out.println("dame el segundo numero");
		num2=sn.nextInt();
		if (num1!=num2) {
			if (num1>num2) {
				for (int i = num2; i <=num1; i=i+7) {
					System.out.println(i);
			}
		} else {
			for (int i = num1; i <=num2; i=i+7) {
				System.out.println(i);
			}
		}
		
		
		
		
//		if (num1!=num2) {
//			
//		} else if (num1>num2) {
//			for (int i = num2; i < num1; i=i+7) {
//				System.out.println(i);
//			}
//		}{
//
//		}
//		
		}
	
		}
}
