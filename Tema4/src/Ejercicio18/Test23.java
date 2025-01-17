package Ejercicio18;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" indique el nombre, edad y dni del profesor");
		String nombre = sc.nextLine();
		Integer edad = sc.nextInt();
		sc.nextLine();
		String dni = sc.nextLine();
		
		Profesor profesor = new Profesor(nombre, edad,dni);
		
		System.out.println(profesor.toString());
	}

}
