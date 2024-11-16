package EjeciciosRepaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un telegrama");
		String[] telegrama = sc.nextLine().split(" ");
		Integer contador = 0;
		for (int i = 0; i < telegrama.length; i++) {
			if (!telegrama[i].equalsIgnoreCase("stop")) { // con esto le dicimos que si la palabra no es stop que entre
															// en el if
				contador++;
			}
		}
		System.out.println(" el precio es " + (contador * 0.24));

		sc.close();
	}

}
