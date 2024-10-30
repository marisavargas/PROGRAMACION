package ejercicio;

import java.util.Scanner;

public class ejercicio12repasoclase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un mumero");
		int n = sc.nextInt();
		System.out.println(" ");
		for (int x = 0; x < n; x++) {
			if (x == 0) {
				System.out.print(" _");
			} else {
				System.out.print("__");
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			//System.out.print("_");
			for (int j = 0; j < n; j++) {

				System.out.print("|_");
			}
			System.out.println("|");
		}

	}
}
