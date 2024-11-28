package Ejercicios;

import java.util.Scanner;

public class vk4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean correcto = false;
		do {
			System.out.println("Introduce una palabra");
			String palabra = sc.nextLine();
			String[] letras = { "A", "T", "F", "S", "L" };
			for (int i = 0; i < letras.length; i++) {
				if (letras[i].equalsIgnoreCase(palabra.substring(0,1))) {/* le hacemos un substring a palabra para que coja solo la primera posicion */
					System.out.println("la palabra " + palabra + " esta en la posicion " + i);
					correcto = true;
				}
			}
			if (correcto ==false) {

				System.out.println("la palabra registrada no es correcta");
			}

		} while (correcto == false);
		sc.close();
	}
}