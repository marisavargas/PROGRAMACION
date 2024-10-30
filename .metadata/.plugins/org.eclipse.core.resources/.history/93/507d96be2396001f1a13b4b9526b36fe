package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25EjercicioClase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Piedra, papel, tijera… un, dos, tres… ya!! ");
		System.out.println("indicame una opcion, por favor");
		String palabra = sc.nextLine().trim().toLowerCase();
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(1,4);
		String respuesta= "";
		if ( numero ==1) {
			respuesta = "piedra";
			System.out.println(respuesta);
		}
		
		if ( numero ==2) {
			respuesta = "papel";
			System.out.println(respuesta);
		}
		
		if ( numero ==3) {
			respuesta = "tijeras";
			System.out.println(respuesta);
		}
		if (palabra.equals("papel")){
			if(respuesta.equals("tijeras")) {
				System.out.println("hemos perdido");
			}
			else if(respuesta.equals("piedra")) {
				System.out.println(" hemos ganado");
				
			}
			else {
				System.out.println("hemos empatado");
			}
			
		}
		if (palabra.equals("tijeras")){
			if(respuesta.equals("piedra")) {
				System.out.println("hemos perdido");
			}
			else if(respuesta.equals("papel")) {
				System.out.println(" hemos ganado");
				
			}
			else {
				System.out.println("hemos empatado");
			}
			
		}
		if (palabra.equals("piedra")){
			if(respuesta.equals("papel")) {
				System.out.println("hemos perdido");
			}
			else if(respuesta.equals("tijeras")) {
				System.out.println(" hemos ganado");
				
			}
			else {
				System.out.println("hemos empatado");
			}
			
		}sc.close();
	}
	

}
