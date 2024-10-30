package ejercicio;

import java.util.Scanner;

public class ejerciciopracticosrepaso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer n = sc.nextInt();
		
		if (n <= 0) {
			System.out.println("El número debe ser mayor que cero.");
		}	
		for (int i = 0; i < n; i++) {
			System.out.print("___");
		}
		System.out.println("_");

		for (Integer i = 0; i < n; i++) {
			System.out.print("");

			for (Integer j = 0; j < n; j++) {
				System.out.print("__|");

			}System.out.println();
			
			
			
		}sc.close();

	
	}
	}
