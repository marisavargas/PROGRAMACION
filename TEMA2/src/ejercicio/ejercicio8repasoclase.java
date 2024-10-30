package ejercicio;

import java.util.Scanner;

public class ejercicio8repasoclase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		int posicion1;
		int posicion2;
		String textoFinal;
		Boolean repetir;
		do {
			System.out.println("Escribe un mensaje:");
			texto = sc.nextLine();
			if (texto.startsWith("hola") && texto.endsWith("hastaluego")) { // con esto le indicamos como queremos que
																			// empiece y termine nuestro texto
				posicion1 = texto.indexOf("a");// le indicamos las posiciones de la "a" y de la "h" primero
				posicion2 = texto.lastIndexOf("h");
				textoFinal = texto.substring(posicion1 + 1, posicion2);// le decimos que nuestro texto final es lo que
																		// mete el usuario por consola
				System.out.println(" lo he entendido" + textoFinal);
				repetir = false;

			} else {
				System.out.println(" esto no es correcto, repitelo");

				repetir = true;
			}

		} while (repetir);
		sc.close();
	}

}
