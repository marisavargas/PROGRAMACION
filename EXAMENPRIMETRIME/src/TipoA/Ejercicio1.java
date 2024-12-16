package TipoA;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letras;
		String[] array;
		Boolean valido;
		do {
			valido = true;
			System.out.println("Indica una lista de letras separadas por coma");
			letras = sc.nextLine();
			array = letras.split(",");
			for (int i = 0; i < array.length; i++) {
				if (array[i].length() == 1) {

				} else {
					System.out.println(" la letra " + array[i] + " no es correcta");
					valido = false;
					break;
				}

			}

		} while (valido == false);
		letras= letras.toUpperCase();
		array = letras.split(",");
		 String letraMenor = array[0];
		for (int i = 0; i < array.length; i++) {
			if( array[i].compareTo(letraMenor)<0) {
				letraMenor= array[i];
				
			}
			
		} System.out.println(" la primera letra en el alfabeto de las indicas es " +  letraMenor) ;
		sc.close();
	}

}
