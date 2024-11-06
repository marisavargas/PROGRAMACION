package Ejercicios;

import java.util.Scanner;

public class Ejercicio07Array {

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
		int [] copia = new int[ num];
		int z= num-1;
		for (int i = 0; i < copia.length; i++) {
			copia [i] = lista [z];
			z--;
			}
		for (int i = 0; i < copia.length; i++) {
			System.out.println("mostrar el contenido " + copia [i]);
		}
		sc.close();

	}

}
