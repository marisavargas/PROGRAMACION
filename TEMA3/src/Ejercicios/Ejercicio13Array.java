package Ejercicios;

import java.util.Scanner;

public class Ejercicio13Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero");
		String num = sc.nextLine();
		String espejo = "";
		String[] parte = num.split("");
		for (int i = parte.length - 1; i >= 0; i--) {
			espejo += parte[i];
		}
		if (espejo.equals(num)) {
			System.out.println("capicua");
		} else {
			System.out.println("no es capicua");
		}
		sc.close();
	}

}

/*
 * Realizar un programa que solicite al usuario un número e indique si es o no
 * es capicúa
 */