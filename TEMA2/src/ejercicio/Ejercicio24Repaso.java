package ejercicio;

import java.util.Scanner;

public class Ejercicio24Repaso {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num;
	do {
		System.out.println("Introduce un numero distinto de cero, por favor");
		 num = sc.nextInt();
	
	}while( num <=0);
	int sumaImpar = sc.nextInt();
	for(int i= 1; i<=num; i++) {
		if( i%2==1) {
			sumaImpar= sumaImpar+1;
		}
	}sc.close();
}

}
