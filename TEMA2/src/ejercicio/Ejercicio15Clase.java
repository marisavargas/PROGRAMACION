package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15Clase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(0, 10);
		int contador = sc.nextInt();
		int opcion = 0;
		do {
			System.out.println("adivina el numero del 1 al 9");
			 opcion = sc.nextInt();
				contador++;
					
			
		} while (opcion != num);

		System.out.println("Has ganado");
		System.out.println(" has jugado " + (contador ));
		sc.close();
// preguntarle a vicky porque no me sale
	}

}
