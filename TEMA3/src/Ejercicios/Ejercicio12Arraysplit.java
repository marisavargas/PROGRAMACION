package Ejercicios;

import java.util.Scanner;

public class Ejercicio12Arraysplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una pagina web");
		String url = sc.nextLine();
		String [] array1= url.split("://");// aqui le pedimos que nos guade el segundo array
		String parte2= array1[1];
				
		String [] array2= parte2.split("\\.");
		System.out.println("Protocolo:"+ array1[0] + "://");
		System.out.println();
		System.out.println("Recorreremos el for:");
		
		for (int i = 0; i < array2.length; i++) {  // con for normal
			System.out.println( array2 [i]);
		}	
		System.out.println();
		System.out.println("Recorremos con foreach:");    // con foreach
		for (String parte : array2) {
			System.out.println(parte);
		}
		sc.close();
	}

}

// hay caracteres que tienen un significado especial en este caso es el . y hay que ponerle // delante para que lo coja

/*
 * Solicitar al usuario una dirección web que tendrá este formato:
 * PROTOCOLO://PARTE1.PARTE2.PARTE3
 */