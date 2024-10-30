package ejercicio;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique su peso");
		double masa = scanner.nextDouble();
		System.out.println("Indique su altura");
		double altura = scanner.nextDouble();
		double imc = scanner.nextDouble();
		
				
		System.out.println(" su  imc: "  + masa / (altura * altura) );
		
		if ( imc >= 18.5) {
		
		System.out.println("peso inferior a lo normal ");
		}
	
		else if ( imc <= 24.9 ) {
		
		System.out.println("peso normal ");
		}
		else if ( imc >= 25.00 && imc <= 29.9) {
		
	
		System.out.println("peso superior al normal");
		}
		else{
		
		System.out.println("obesidad");
		}
		
		scanner.close();
	
	}
}

		
			

