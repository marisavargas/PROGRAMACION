package Ejercicios;

import java.util.Scanner;

public class Ejercicio14Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un texto");
		String texto = sc.nextLine();
		texto.trim();
		String[] escrito = texto.split("");// esto es para partir texto en letritas
		for (int i = 0; i < escrito.length; i++) {
				if (!escrito[i].isBlank()) {
				System.out.print(escrito[i]);
				} else {
				i++;
				System.out.print(escrito[i].toUpperCase());
			}
		}
		sc.close();
	}

}

/*
 * Realizar un programa que transforme un texto escrito por el usuario en
 * nomenclatura Por ejemplo, si el usuario escribe: Esto es una prueba El
 * resultado tendría que ser: estoEsUnaPrueba
 */