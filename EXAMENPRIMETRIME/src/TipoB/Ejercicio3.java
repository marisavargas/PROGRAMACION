package TipoB;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String palabra  ;
	String partes;
	do {
	System.out.println("Escribe una palabra de longuitud mayor a 5");
	 palabra = sc.nextLine();
	}while (palabra.length()<=5);
		
	 String [] array = new String [palabra.length()];
	 String [] palabraSplit = palabra.split("");
	 for (int i = 0; i < array.length; i++) {
		partes ="";
		for (int j = 0; j <= i; j++) {
			partes +=palabraSplit [j];
			}
		 array[i] = partes;
	}
	 for (int i = 0; i < array.length; i++) {
		 if ( i== array.length -1) {
			 System.out.println(array [i]);
		 }else {
		System.out.print( array [i] + " -");
		 }
	}sc.close();
	
	}
	

	}


