package Ejercicios;

import java.util.Scanner;

public class Ejercicio13Arraysplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra, por favor");
		String palabra = sc.next();
		String[] letras = palabra.split(""); // esto nos devuelve un array
		for (int i = letras.length-1; i >0; i--) { // la ultima posicion del array es (length -1).
			System.out.print( letras [i]);
		}
		sc.close();	
	}

}




// estudiar




/*Realizar un programa que solicite una palabra al usuario y luego la escriba invertida. Por 
ejemplo, si la palabra indicada es “indonesia”, el resultado debería ser “aisenodni” 
Cuando te funcione, prueba con un palíndromo ;) */