package RepeticionEjercicio;

import java.util.Scanner;

public class Ejercicio7Tema2basicoRepetidoWhile {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer num1=0;
	Integer num2=0;
	do {
	System.out.println("Introduce dos numero");
	 num1= sc.nextInt();
	 num2= sc.nextInt();
	
	if ( num1 == num2) {
		System.out.println("Adios");
	
	}else {
		System.out.println("el numero " + num1 + "y el numero" + num2 + " son distintos " );
	}
	}while(num1 != num2);
	sc.close();
}
}