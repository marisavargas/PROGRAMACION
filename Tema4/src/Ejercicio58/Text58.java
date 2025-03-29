package Ejercicio58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Text58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diccionario mio = new Diccionario();
		
		Scanner sc = new Scanner(System.in);

		String palabra = "";

		Map<String, List<String>> mapa = new HashMap<>();

		while (!palabra.equalsIgnoreCase("FIN")) {

			System.out.println("Dime palabras y si quieres terminar escribe FIN");

			palabra = sc.nextLine();

			String clave =palabra.substring(0, 1);

			if (!mapa.containsKey(clave)) {

				List<String> patata = new ArrayList<>();

				patata.add(palabra);

				mapa.put(clave, patata);
			} else {
				mapa.get(clave).add(palabra);
			}

		}

		String letra = "";

		while (!letra.equalsIgnoreCase("FIN")) {

			System.out.println("Dime una letra :");
			letra = sc.nextLine();

			if (mapa.containsKey(letra)) {

				System.out.println("Hay " + mapa.get(letra).size() + " palabras que empiezan por " + letra + ":");
				for (String boniato2 : mapa.get(letra)) {
					System.out.println("> " + boniato2);
				}
			}
			if (letra.equalsIgnoreCase("FIN")) {
				System.out.println("¡Gracias por jugar con nosotros! Bye");
			} else if (!mapa.containsKey(letra)) {
				System.out.println("No hay palabras que empiezan por " + letra);
			}

		}
		sc.close();
	}
			

		
	}


