package Ejercicios;

import java.util.Scanner;

public class Ejercicio1Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] numPares = new Integer[15];
		int num = 0;
		for (int i = 1; i <= 30; i++) {
			if (num % 2 == 0) {
				numPares[num] = i;

			}
			int f = sc.nextInt();
			System.out.println("Números pares entre 1 y 30:");
			for (f = 0; f < numPares.length; f++) {
				System.out.println(numPares[f]);
			}
			sc.close();
		}
	}
}