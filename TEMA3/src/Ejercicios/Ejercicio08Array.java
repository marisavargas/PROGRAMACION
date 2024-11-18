package Ejercicios;

import java.util.Scanner;

public class Ejercicio08Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantos numero vas a introducir");
		int num = sc.nextInt();
		int[] lista = new int[num];
		int x = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Introduce un numero");
			x = sc.nextInt();
			lista[i] = x; // esto es para que me ponga el numero que introduce por el escaner en su hueco
							// de la cajita

		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println("mostrar el contenido" + lista[i]); // esto es para que me muestre el contenido de cada
																	// cajita de la array
		}

		for (int i = 0; i < lista.length / 2; i++) {
			int a = lista[i];
			lista[i] = lista[lista.length - i - 1];
			lista[lista.length - i - 1] = a;
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println("mostrar el contenido " + lista[i]);
		}
		sc.close();

	}

}
