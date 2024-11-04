package Ejercicios;

import java.util.Scanner;

public class Ejercicio7Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ¿Cuantos numeros vas a introducir?");
		int numero = sc.nextInt();
		Integer[] lista = new Integer [numero];
		for ( int i =0; i <= numero ; i++) {
			lista [0]= i;
		System.out.println(i);
		}
		
		Integer [] listaNueva = new Integer[numero];
		for (int j = lista.length; j >= listaNueva.length; j--) {
			j= sc.nextInt();
		 listaNueva [j]= lista.length-1;
		 System.out.println(j);
		}
	}

}
