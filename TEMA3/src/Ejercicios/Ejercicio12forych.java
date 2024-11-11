package Ejercicios;

import java.util.Scanner;

public class Ejercicio12forych {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una direccion de web");
		String direccion = sc.next();
		direccion.trim(); // esto es para quitar los espacios
		String[] protocolo = direccion.split("://");
		String[] partes = protocolo[1].split("\\."); // este array es de tres porque lo partimos por los puntos
		if (direccion.contains("://") && direccion.contains(".")) {
			System.out.println(protocolo[0] + "://");
			for (int i = 0; i < partes.length; i++) { // hacemos un for para recorrer las tres partes que tiene
														// direcion[1]
				System.out.println(partes[i]);
			}
		} else {
			System.out.println("Direccion incorrecta");
		}
		sc.close();

	}
}

/*
 * Solicitar al usuario una dirección web que tendrá este formato:
 * PROTOCOLO://PARTE1.PARTE2.PARTE3
 * 
 */