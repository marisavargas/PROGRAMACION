package Verde;

import java.util.Scanner;

public class Examen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		Integer contador =0;
		do {
			System.out.println("Indique un numero entre 10000 y 20000, ambos inclusive:");
			num = sc.nextInt();
			if ( num<10000) {
				System.out.println("El numero no puede ser menor de 10000");
			}else if( num>20000) {
				System.out.println("El numero no puede ser mayor de 20000");
			}
			
		} while (num < 10000 || num > 20000);
		String [] array = num.toString().split("");
		for (int i = 0; i < array.length; i++) {
			
		}
		
	} 

}
