package TipoB;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra que sea mayor o igual a 7 letras y sin espacios");
		String palabra = sc.nextLine();

		if (palabra.length() < 7 || palabra.contains(" ")) {
			System.out.println("Esta palabra no es valida");

		} else {
			palabra = palabra.toUpperCase();
			palabra = palabra.replaceAll("A", "E");
			System.out.println(palabra);

			Integer aleatorio1;
			Integer aleatorio2;
			String letra1 = "";
			String letra2 = "";
			do {
				aleatorio1 = random.nextInt(0, palabra.length());
				aleatorio2 = random.nextInt(0, palabra.length());

			} while (aleatorio1 == aleatorio2);
			System.out.println(aleatorio1 + "  y " + aleatorio2);
			

			String[] letras = palabra.split("");
			for (int i = 0; i < letras.length; i++) {
				if (i == aleatorio1) {
					letra1 = letras[i];
				} else if (i == aleatorio2) {
					letra2 = letras[i];
				}
			}
			if (aleatorio1 > aleatorio2) {
				System.out.println(letra2 + " " + letra1);
			} else {
				System.out.println(letra1 + " " + letra2);
			}
		}
		sc.close();
	}
}
