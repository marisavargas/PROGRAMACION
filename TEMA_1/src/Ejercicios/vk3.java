package Ejercicios;

import java.util.Scanner;

public class vk3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero largo");
		String num = sc.nextLine();
		String[] array = num.split("");
		Integer contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (i + 1 < array.length) {
				do {
				if (array[i].equals(array[i + 1])) {
					contador++;
					i++;  /*esto es para cambiar la posicion*/
				}
				}while(array[i].equals(array[i+1])); /* para que nos coja todos los que se repiten varias veces*/
			
			}
			if (contador > 0) {
				System.out.println(" este " + array[i] + " se repite consecutivamente" + contador);
			}
			contador = 0;
			
		}sc.close();
	}

}
