package ejercicio;

import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio18repasoClase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una palabra");
		String palabra = " ";
		palabra = sc.next();
		for (int i = palabra.length(); i > 0; i--) { // comienzo por el final de la palabra y vamos decrementando el
		System.out.print(palabra.substring(i - 1, i));// contador
		}
		sc.close();

	}

}
