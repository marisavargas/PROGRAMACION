package Ejercicios;

import java.util.Scanner;

public class Ejercicio15Arraysplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un texto");
		String texto = sc.nextLine();
		texto.trim();
		String[] escrito = texto.split("");// esto es para partir texto en letritas
		for (int i = 0; i < escrito.length; i++) {
			if (!escrito[i].isBlank()) {
				System.out.print(escrito[i].toLowerCase());// esto lo ponemos para que la primera palabra sea mayuscula
			} else {
				i++;
				System.out.print(escrito[i].toUpperCase());
			}
		}
		sc.close();
	}

}
