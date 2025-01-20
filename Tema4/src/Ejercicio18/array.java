package Ejercicio18;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Alumno[] alumno = new Alumno[3];

		Scanner sc = new Scanner(System.in);
		System.out.println("Indica nombre, edad y nota de tres alumnos");
		String dni = sc.nextLine();
		String nombre = sc.nextLine();
		Integer edad = sc.nextInt();
		Double nota = sc.nextDouble();
		
		Curso c = new Curso();
		c.setDescripcion("DAM/DAW");
		c.setIdentificador("1");
		
		Alumno a1 = new Alumno(dni);
		a1.setNombre(nombre);
		a1.setEdad(edad);
		a1.setNota(nota);
		a1.setCurso(c);

		Alumno a2 = new Alumno(dni);
		a2.setNombre(nombre);
		a2.setEdad(edad);
		a2.setNota(nota);
		a2.setCurso(c);

		Alumno a3 = new Alumno(dni);
		a3.setNombre(nombre);
		a3.setEdad(edad);
		a3.setNota(nota);
		a3.setCurso(c);
		for (int i = 0; i < alumno.length; i++) {
			/* terminar en casa*/
		}
			
	}
}
