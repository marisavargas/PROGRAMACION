package ejercicio;

import java.util.Scanner;

public class Ejercicio2avanzado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		Integer N = sc.nextInt();
		for( int i=0; i<=N;i++) {
									
			for(int j=0;j<=N;j++) {
						
				if(i==j) {
			System.out.print("* ");
			}
				else {
			System.out.print("_ ");	
				}
			}
			System.out.println();
		}
	}
}