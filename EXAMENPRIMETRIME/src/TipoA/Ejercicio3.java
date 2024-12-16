package TipoA;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Escriba una frase de tamaño mayor o igual a 10 letras");
		String frase = sc.nextLine();
		if (  frase.length()<10) {
			System.out.println("La frase no es correcta");
		}
		else {
			frase =frase.replaceAll(" ", "");
			frase =frase.toLowerCase();
			System.out.println( frase );
			
			Integer aleatorio1;
			Integer aleatorio2;
		do { 
			aleatorio1 = random.nextInt(0,frase.length());
			aleatorio2 = random.nextInt(0,frase.length());
			
		}while( aleatorio1 == aleatorio2);
		 System.out.println( aleatorio1  +" y "+ aleatorio2);
		  
		 if(aleatorio1<aleatorio2) {
			 System.out.println(frase.substring(aleatorio1,aleatorio2));
		 }else {
			 System.out.println(frase.substring(aleatorio2,aleatorio1));
		 }
		}	sc.close();
		
		
	}

}
