package EjeciciosRepaso;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos alumnos hay?");
		Integer numAlumnos = sc.nextInt();
		System.out.println("¿Cual es el nombre del primer alumno?");
		String[] nombres = new String[numAlumnos];
		double[] notasMedias = new double[numAlumnos];

		// Leer datos de los alumnos//
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("\nAlumno " + (i + 1) + ":");
			System.out.print("Nombre: ");
			nombres[i] = sc.nextLine();

			double sumaNotas = 0;
			sc.nextLine();
			for (int j = 1; j <= 3; j++) {
				System.out.print("Nota del examen " + j + ": ");
				double nota = sc.nextDouble();
				sumaNotas += nota;
			}

			sc.nextLine();
			// Consumir el salto de línea//
			// Calcular la nota media del alumno//
			notasMedias[i] = sumaNotas / 3;

		}
		System.out.println("\nListado de notas medias:");
		double sumaTotalMedias = 0;

		for (int i = 0; i < numAlumnos; i++) {
			System.out.println(nombres[i] + ": " + String.format("%.2f", notasMedias[i]));
			sumaTotalMedias += notasMedias[i];
		}

		// Calcular y mostrar la nota media de la clase
		double mediaClase = sumaTotalMedias / numAlumnos;
		System.out.println("\nNota media de la clase: " + String.format("%.2f", mediaClase));

		sc.close();
	}

}
