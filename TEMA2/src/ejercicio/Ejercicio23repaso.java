package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23repaso {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Random random = new Random();
		 int lanzamientos = sc.nextInt();
		 int dado = random.nextInt(1,7);
		 {
			System.out.println("¿Cuantas veces quieres lanzar el dado?");
		 	System.out.println(" Resultado de lanzamiento de dados ="+ lanzamientos);
		 	
		}while( lanzamientos == dado);
		 int repuesta;
		 
		if (dado ==1) {
			System.out.println(" el 1 a salido" + lanzamientos);
			}
		if (dado ==2) {
			System.out.println(" el 2 a salido " + lanzamientos);
		}
		if (dado ==3) {
			System.out.println("el 3 a salido" + lanzamientos);
		}
		if (dado ==4) {
			System.out.println("el 4 a salido" + lanzamientos);
		}
		if (dado == 5) {
			System.out.println(" el 5 a salido " + lanzamientos);
		}
		if (dado ==6) {
			System.out.println("el 6 a salido" + lanzamientos);
		}
		
		//REPETIR EN CASA
		

	}

}
