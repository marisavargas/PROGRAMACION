package Ejercicios;

import java.util.Scanner;

public class Ejercicio13ArrayySplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una palabra");
		String palabra = " ";
		palabra = sc.next();
		String []letras=palabra.split("");// con esto he metido cada letra en una cajita del array
		for (int i = letras.length -1; i > 0; i--) { // comienzo por el final de la palabra y vamos decrementando el
		System.out.print(letras [i]);
		}
		sc.close();

	}

}








/*Realizar un programa que solicite una palabra al usuario y luego la escriba invertida. Por 
ejemplo, si la palabra indicada es “indonesia”, el resultado debería ser “aisenodni” 
Cuando te funcione, prueba con un palíndromo ;)*/