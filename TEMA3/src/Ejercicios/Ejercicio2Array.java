package Ejercicios;

import java.util.Scanner;

public class Ejercicio2Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Indica un numero");
		int i = sc.nextInt();
		Integer[] num = new Integer[6];
		
		for (i = 0; i < num.length; i++) {
			num[1] = i*i;
			i++;
		
			System.out.println( num[1] + "");
		}
		sc.close();
	}

}
// preguntar a vicky