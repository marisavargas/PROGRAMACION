package ejercicio;

import java.util.Scanner;

public class ejercicio7repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique su nombre completo:");
		String nombreCompleto = scanner.nextLine();
		
		int espacio1 = nombreCompleto.indexOf(" ");// con este metodo buscamos la primero posicion del espacio
		String nombre = nombreCompleto.substring(0, espacio1);// con este metodo buscamos las coordenadas que queremos
		System.out.println("Su nombre es : " + nombre);
		int espacio2 = nombreCompleto.lastIndexOf(" ");// con este metodo buscamos el segundo espacio utilizando el
														// prinero
		String apellido = nombreCompleto.substring(espacio1+1, espacio2);// con este metodo buscamos las coordenas , esto
																		// es lo mas dificil
		System.out.println("Su primer apellido es :" + apellido);
		String espacio3 = nombreCompleto.substring(espacio2+1);// aqui como solo conocemos una variable pues la ponemos y
																// lo dejamos sin la segunda para vea hasta el final
		String segundoApellido = espacio3;
		System.out.println("Su segundo apellido es :" + segundoApellido);
		scanner.close();

	}

}
