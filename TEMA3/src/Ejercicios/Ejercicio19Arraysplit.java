package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio19Arraysplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String []{"azulejo","tenedor","saltamontes","carretilla",
				"molinero","sofisticado","terremoto","culinario","teclado","primavera"};
		Random aleatorio = new Random();
		Integer num = aleatorio.nextInt(0,10);
		Integer contador=0;											/* le sumamos una para que me coja la ultima posicion*/
		String []letras = palabras[num].split(""); /* lo que me da este array lo estoy guardando en letras*/
		String []rayas = new String[letras.length]; /* este array le va a mostrar al usuario las rayitas del juego*/
		for (int i = 0; i < rayas.length; i++) {
			rayas[i]= "__ "; /* ojo tenemos que poner un espacio al final*/
		}
		do {
		System.out.println("  dame una letra");
		String repuesta= sc.nextLine();
		
			for (int i = 0; i < rayas.length; i++) {
				
				if(letras[i].equalsIgnoreCase(repuesta)) {
					
				rayas[i]= letras[i];
				
				}else {
				
			}System.out.print(rayas[i]);
			
		}contador++;
		System.out.println(" te quedan  "+ (10-contador ) +" intentos");
		
		}while(!(Arrays.equals(letras,rayas)) || (contador<10));/* comparamos los arrays pero no se utiliza*/
		
		  if ( contador == 10) {
			  
			  System.out.println(" Game over");
			  
		  }else {
			  
			  System.out.println(" Ganador ");
		  }
		
		sc.close();
	}
}
