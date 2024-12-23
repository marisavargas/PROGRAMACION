package Verde;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		do {
			System.out.println("Indique un numero entre 1 y 9, ambos inclusive:");
			num = sc.nextInt();
		} while (num < 1 || num > 9);
		// imprimir piramide//
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for( int j= 2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
