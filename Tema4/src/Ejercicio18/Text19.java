package Ejercicio18;

import java.util.Scanner;

public class Text19 {

	public static void main(String[] args) {

		Alumno alumno2 = new Alumno();

		Scanner sc = new Scanner(System.in);
		

		System.out.println(" introduce el dni,nombre,edad y nota de un alumno");

		String dni = sc.nextLine();
		String nombre = sc.nextLine();
		Integer edad = sc.nextInt();
		Double nota = sc.nextDouble();

		alumno2.setDni(dni);
		alumno2.setNombre(nombre);
		alumno2.setEdad(edad);
		alumno2.setNota(nota);

		System.out.println(alumno2.getDni());
		System.out.println(alumno2.getNombre());
		System.out.println(alumno2.getEdad());
		System.out.println(alumno2.getNota());

		
		alumno2.aprobar();
		System.out.println("Nueva nota : " +alumno2.getNota() );
		sc.close();
	}

	}


