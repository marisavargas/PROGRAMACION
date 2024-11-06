package Ejercicios;

import java.util.Scanner;

public class Ejercicio5array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos numero vas a introducir");
		int tam = sc.nextInt();
		Integer [] numeros = new Integer [tam];
		int i;
		for (int i = 0; i < numeros.length; i++) {
			Integer x = sc.nextInt();
			numeros [i]= x;
		}
		Integer maximo = numeros [0];
		Integer minimo = numeros [0];
		Integer posMaximo = 0;
		Integer posMinimo = 0;
		 for (int i = 0; i < numeros.length; i++) {
			System.out.println( numeros [i] + "");
			System.out.println();
		}
		 if (numero[i]> maximo) {
			 maximo = numeros[i];
			 posMaximo = i;
		 }
		}else if(numeros[i]<minimo){
		minimo = numeros[i];
		posMInimo = i;
	}

}
