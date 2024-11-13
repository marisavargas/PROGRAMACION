package Ejercicios;

import java.util.Scanner;

public class Ejercicio18ArraysplitForych {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe una palabra");
		String palabra=sc.nextLine();
		String []letras = palabra.split("");
		for (String yo : letras) {
			System.out.print(yo  +"\t");
		}sc.close();

	}

}




    /*Solicita una palabra al usuario y a continuación deletréala (imprime cada letra por separado). 
Utiliza para ello un Split y un bucle foreach */
