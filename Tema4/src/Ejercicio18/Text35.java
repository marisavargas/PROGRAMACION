package Ejercicio18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text35 {

	public static void main(String[] args) {
		
		List<Alumno> alumnos=new ArrayList<>();
		Curso c = new Curso();
		c.setDescripcion("DAM/DAW");
		c.setIdentificador("1");
		


		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3 ; i++) {
			Alumno alum = new Alumno();
						
				Boolean dniCorrecto = false;  
				do {
					System.out.println("Dime el dni");
					String dni = sc.nextLine();
					alum = new Alumno(dni);
					if (!alum.validarDni(alum.getDni())) {
						System.err.println("Dni no valido");
					}
					else {
						dniCorrecto = true;
					}
				}while(!dniCorrecto);

			System.out.println("Indica el nombre del alumno");
			alum.setNombre(sc.nextLine());

			System.out.println("Indica el nombre del nota");
			alum.setNota(sc.nextDouble());

			System.out.println("Indica la dni");
			alum.setDni(sc.nextLine());

			System.out.println("Indica la edad");
			alum.setEdad(sc.nextInt());

			alum.setCurso(c);
			alumnos.add( alum);
				
		}
		for (Alumno alumno : alumnos) {/* hacemos un foreach porque no queremos que se salte nimguna pocicion*/
			System.out.println(alumno);
			if(alumno.validar()) {/* ejercicio29*/
				System.out.println("Este alumno cumple las validaciones");
				c.addAlumnos(alumno);
			}
			else {
				System.out.println("Este alumno no cumple las validaciones");
			}
			
		}
		if (alumnos.get(0).equals(alumnos.get(1)) 
				|| alumnos.get(0).equals(alumnos.get(2))
				|| alumnos.get(1).equals(alumnos.get(2))) {
			System.err.println("Error: hay al menos 2 alumnos repetidos");
		}
		else {
			System.out.println("Felicidades: todos los alumnos son distintos!!");
		}
		sc.close();

	}



	}


