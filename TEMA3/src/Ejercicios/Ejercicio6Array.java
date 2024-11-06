package Ejercicios;

import java.util.Scanner;

public class Ejercicio6Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String [] lista = new String [3];
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Introduce una palabra");
			String palabra = sc.next();
			lista [i]= palabra;
		}
		String suma= "";     // ponemos suma para declararla.
		for (int i = 0; i < lista.length; i++) {
			suma = suma + lista[i];  // aqui le indicamos que suma es igual a suma mas la palabra siguiente
			
		}
		System.out.println(suma);
		sc.close();
	}

}
