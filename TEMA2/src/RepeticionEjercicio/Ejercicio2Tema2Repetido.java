package RepeticionEjercicio;

import java.util.Scanner;

public class Ejercicio2Tema2Repetido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	String num1;
	String num2;
	
	do {
	System.out.println("Introduce dos numero");
	 num1= sc.nextLine();
	 num2= sc.nextLine();
	num1.trim();
	num2.trim();
	if ( num1.equalsIgnoreCase(num2)) {
		System.out.println("Adios");
	
	}else {
		System.out.println("el numero " + num1 + "y el numero " + num2 + " son distintos " );
	}
	}while(!num1.equalsIgnoreCase(num2));
	sc.close();
	}

}
