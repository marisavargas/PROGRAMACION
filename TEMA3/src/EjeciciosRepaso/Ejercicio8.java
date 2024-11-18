package EjeciciosRepaso;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce una direccion de internet");
		
		String[] html = sc.nextLine().split("<");
		
		for (int i = 0; i < html.length; i++) {
			
			Integer posicion = html[i].indexOf(">");
			
			String letras = html[i].substring(posicion + 1);
			
			System.out.print(letras);

		}
		sc.close();

	}
}