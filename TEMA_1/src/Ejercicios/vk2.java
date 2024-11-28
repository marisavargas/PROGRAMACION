package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class vk2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra ;
		do {
		System.out.println("Introduce una palabra que empiece por F");
		 palabra =  sc.nextLine();
		}
		while(!(palabra.length()>=7 && palabra.startsWith("F")));
		
		Random random = new Random();
		Integer num = random.nextInt(1,palabra.length());
		String [] array = palabra.split("");
		for (int i = 0; i < array.length; i++) {
			if ( i== num) {
				array[i]= num.toString();/* esto lo ponemos para cambiar el numero a cadena*/
				}
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println( num);
		sc.close();

	}

}
