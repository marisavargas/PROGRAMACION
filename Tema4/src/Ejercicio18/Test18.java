package Ejercicio18;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno();

		Scanner sc = new Scanner(System.in);

		System.out.println(" introduce el dni,nombre,edad y nota de un alumno");

		String dni = sc.nextLine();
		String nombre = sc.nextLine();
		Integer edad = sc.nextInt();
		Double nota = sc.nextDouble();

		alumno1.setDni(dni);
		alumno1.setNombre(nombre);
		alumno1.setEdad(edad);
		alumno1.setNota(nota);

		System.out.println(alumno1.getDni());
		System.out.println(alumno1.getNombre());
		System.out.println(alumno1.getEdad());
		System.out.println(alumno1.getNota());

		
		
	}

}
