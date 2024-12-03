package RepeticionEjercicio;

import java.util.Scanner;

public class Ejercicio10Tema2BAsicoRepetido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1 ;
		String palabra2 ;
		
		do {
		System.out.println("Introduce una palabra");
			palabra1 = sc.nextLine();
		System.out.println("Introduce una palabra");
		 	palabra2 = sc.nextLine();
		 
		}while(palabra1.contains(" ") || palabra1.isEmpty()
				||palabra2.contains(" ")|| palabra2.isEmpty());
		
		if( palabra1.compareTo(palabra2)<0) {
			 System.out.println("las palabras son  "  + palabra2 + " " + palabra1);
		} else if ( palabra1.compareTo(palabra2)>0) {
		 System.out.println("las palabras son"  + palabra1 + " " + palabra2);
		}else {
		 System.out.println(" la palabra  " + palabra1 + " y la palabra "+ palabra2  +" son iguales");
	}
	}
}
