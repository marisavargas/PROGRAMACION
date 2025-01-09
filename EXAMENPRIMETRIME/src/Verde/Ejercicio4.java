package Verde;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica una lista de numeros ( entre 100 y 199 ) y palabras que empiecen por 'a' nimusculas");
		String palabra = sc.nextLine();
		String[] array = palabra.split(" ");
		for (int i = 0; i < array.length; i++) {
			if(! array [i].startsWith("a")) {
				System.out.println("El item de la lista "+ array [i] + " no es correcto");
			}
		}
		

	}

}
