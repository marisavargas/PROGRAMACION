package Ejercicios;

import java.util.Scanner;

public class Ejercicio14ArraySplit {

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
			System.out.println("capicua " + num);
		} else {
			System.out.println("no es capicua");
		}
		sc.close();
	}

	}


