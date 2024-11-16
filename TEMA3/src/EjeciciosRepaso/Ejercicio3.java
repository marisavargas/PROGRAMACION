package EjeciciosRepaso;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		Integer[] listaNotas  = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		Boolean encontrado = false;
		System.out.println("¿que nota buscas?");
		Integer nota = sc.nextInt();
		
		for (int i = 0; i < listaNotas.length; i++) {
			if( listaNotas [i] == nota) {
				
			System.out.println("la nota buscada existe y esta en la posicion  "+ i);
			encontrado = true;	
			}
		}if (encontrado == false) {
			System.out.println("la nota buscada no existe");
		}sc.close();
	}

}
