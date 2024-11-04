package Ejercicios;

import java.util.Scanner;

public class Ejercicio2Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num =sc.nextInt();
		int[]lista = new int[6];
		int cuadrado = 0;
		for (int i = 0; i < lista.length; i++) {
			cuadrado = num *num;
			lista [i] =cuadrado;   // ponemos lista que es el array igua a i que es nuestro contador
			num ++;  // esto lo hacemos para que le vaya sumando 1 y cuente las seis posiciones del array
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println("mostrar el contenido" + lista [i]); // esto es para que me muestre el contenido de cada cajita de la array
		}
		
		sc.close();
}
}