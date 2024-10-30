package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26EjercicioClase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = "";
		int victorias =0;
		int derrotas = 0;
		int empates = 0;
		do {
			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!! ");
			System.out.println("indicame una opcion, por favor");
			palabra = sc.nextLine().trim().toLowerCase();
			Random aleatorio = new Random();
			int numero = aleatorio.nextInt(1, 4);
			String respuesta = "";
			if (numero == 1) {
				respuesta = "piedra";
				System.out.println(respuesta);
			}

			if (numero == 2) {
				respuesta = "papel";
				System.out.println(respuesta);
			}

			if (numero == 3) {
				respuesta = "tijeras";
				System.out.println(respuesta);
			}

			if (palabra.equals("papel")) {
				if (respuesta.equals("tijeras")) {
					System.out.println("hemos perdido");
					derrotas++;
				} else if (respuesta.equals("piedra")) {
					System.out.println(" hemos ganado");
					victorias++;
				} else {
					System.out.println("hemos empatado");
					empates++;
				}

			}
			if (palabra.equals("tijeras")) {
				if (respuesta.equals("piedra")) {
					System.out.println("hemos perdido");
					derrotas++;
				} else if (respuesta.equals("papel")) {
					System.out.println(" hemos ganado");
					victorias++;
				} else {
					System.out.println("hemos empatado");
					empates++;
				}

			}
			if (palabra.equals("piedra")) {
				if (respuesta.equals("papel")) {
					System.out.println("hemos perdido");
					derrotas++;
				} else if (respuesta.equals("tijeras")) {
					System.out.println(" hemos ganado");
					victorias++;
				} else {
					System.out.println("hemos empatado");
					empates++;
				}

			}

			System.out.println("¿quieres seguir jugando?");
			palabra = sc.nextLine().trim().toLowerCase();

		} while (palabra.equals("si"));
		System.out.println("victoria =" + victorias);
		System.out.println(" derrota =" + derrotas);
		System.out.println(" empate =" + empates);
	sc.close();	
	}
}