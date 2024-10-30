package ejercicio;

import java.util.Scanner;

public class ejercicio14repasoclase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra ="";
		Integer numero = 0 ;
		do { System.out.println("Introduce una contraseña:");
			palabra = sc.nextLine();
			numero = palabra.length();
			if ( numero >= 8) {
				palabra = palabra.replaceAll( "a" ,"4");
				palabra = palabra.replaceAll( "e" ,"3");
				palabra = palabra.replaceAll( "i" ,"1");
				palabra = palabra.replaceAll( "o" ,"0");
				palabra = palabra.replaceAll( "t" ,"7");
				System.out.println( palabra);
			}
			
		}while (numero < 8);
		sc.close();
	}

}
