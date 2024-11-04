package Ejercicios;

import java.util.Scanner;

public class Ejercici3Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ¿Cuantos numeros vas a introducir?");
		int numero = sc.nextInt();
		Integer[] lista = new Integer [numero];
		for ( int i =0; i <= numero ; i++) {
			lista [0]= i;
		
		System.out.println( i );
		}
		sc.close();
	

	}

}
