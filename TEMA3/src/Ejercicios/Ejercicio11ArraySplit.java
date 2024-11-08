package Ejercicios;


import java.util.Scanner;

public class Ejercicio11ArraySplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Pedimos el nombre completo por pantalla
		System.out.println("Dime tu nombre completo");
		String nombre = sc.nextLine();
	
		String[] parte1 = nombre.split(" ");
		for (int i = 0; i < parte1.length; i++) { // esto es con el for nomal y array y mediante las posiciones
			System.out.println("tu nombre completo es:" + parte1[i]);
		}sc.close();
		
		}
	}

/* esto es con forych
 * for (String palabra : array){
 * syso.out.println (palabra) es mas facil
 * porque te recorre el array y te va dando 
 * los que tiene dentro mientras lo recorre y
 * siempre lo guarda en palabra.*/
