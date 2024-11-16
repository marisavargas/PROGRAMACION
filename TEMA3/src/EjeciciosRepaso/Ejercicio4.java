package EjeciciosRepaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] listaNotas  = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		System.out.println("¿que nota buscas?");
		Integer nota = sc.nextInt();
		Integer contador = 0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			if( listaNotas [i] > nota) {
				
				contador ++; 
							
			}
		
		}System.out.println("hay" + contador + " mayores que la nota indicada");
		sc.close();
	}


	}


