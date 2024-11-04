package Ejercicios;

import java.util.Scanner;

public class Ejercicio6Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = new String[3];
	
		for (int i = 0; i < lista.length; i++) {
			System.out.println(" introduce una palabra");
				String palabra = sc.nextLine();
				lista[i]= palabra;
			}
		String frase ="";
		for (int i = 0; i < lista.length; i++) {
			frase = frase + lista [i];// asi concatenamos cadenas 
		}
		System.out.println(frase);// esto va fuera del for para que no se repita
		sc.close();

	}

}
