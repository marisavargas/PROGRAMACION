package ejercicio;

import java.util.Scanner;

public class ejercicio14for {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un numero:");
		int numero = scanner.nextInt();
		
		
		for ( int tabla = 0 ; tabla <=10 ; tabla++ ) {
		int resultado = tabla * numero;
		System.out.println(numero + " x " + tabla + "=" + resultado);
		scanner.close();
	}

}//while (tabla < 10){
//tabla++;
//resultado = numero * tabla;
//System.out.println(numero + " X " + tabla + " = " + resultado );

	}


