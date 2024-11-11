package Ejercicios;

import java.util.Scanner;

public class Ejercicio16Arraysplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un texto");
		String texto = sc.nextLine();
		Integer a = 0;
		Integer b = 0;
		
		String []letras = texto.split("");
		for (int i = 0; i < letras.length; i++) {
			if (letras[i].equalsIgnoreCase("a")) {
			a++;
		}
	}
		System.out.println(a);
		String []palabras= texto.split(" ");
		for (int j = 0; j < palabras.length; j++) {
			b++;
		}
		System.out.println(b);
		sc.close();
	}
}









/*Realiza un programa que cuente el número de veces que aparece la letra ‘a’ y el número 
palabras que hay en un texto solicitado al usuario.*/