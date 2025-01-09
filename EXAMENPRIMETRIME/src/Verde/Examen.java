package Verde;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		do {
			System.out.println("Indique un numero entre 15 y 18, ambos inclusive:");
			num = sc.nextInt();
		} while (num < 15 || num > 18);
		Integer[] array = new Integer[num];
		Random random = new Random();
		Integer aleatorio1 = random.nextInt(1, 11);
		array[0] = aleatorio1;
		System.out.print(aleatorio1 + " , ");
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] + 3;
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + " , ");
			}

		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = array[i] / 2;
			}
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + " , ");
			}

		}
		sc.close();

	}

}
