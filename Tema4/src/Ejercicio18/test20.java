package Ejercicio18;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Dame el dni del alumno");
		String dniAlumno = sc.nextLine();
		Alumno alumno2 = new Alumno(dniAlumno);
		sc.close();

	}

}
