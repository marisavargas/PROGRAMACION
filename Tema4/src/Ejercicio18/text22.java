package Ejercicio18;

import java.util.Scanner;

public class text22 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Indicame el dni del alumno");
	String dni = sc.nextLine();
	Alumno alumno3 = new Alumno(dni);
	alumno3.setDni(dni);
	System.out.println("Indicame el nombre del alumno");
	String nombre = sc.nextLine();
	alumno3.setNombre(nombre);
	System.out.println("Indicame el nota del alumno");
	Double nota = sc.nextDouble();
	alumno3.setNota(nota);
	System.out.println("Indicame el edad del alumno");
	Integer edad = sc.nextInt();
	Curso c1= new Curso();
	
	
	c1.setDescripcion("programacion");
	c1.setIdentificador("alumnos02");
	alumno3.setCurso(c1);
	
	
	
	

	}
	

}
