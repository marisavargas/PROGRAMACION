package Ejercicios;

import java.util.Random;

public class vk1 {

	public static void main(String[] args) {
	
			Random random = new Random();
			Integer num = random.nextInt(10, 21);
			Integer[] array = new Integer[num];
			Integer contador = 50;
			Integer suma = 0;
			for (int i = 0; i < array.length; i++) {
				array[i] = contador; /* ponemos esto porque tiene que empezar en 50 */
				contador--;
				System.out.print(array[i] + " ");/* esto es para que los numeros no se impriman juntos */
				suma += array[i];
			}
			System.out.println();
			System.out.println(suma);
			for (int i = 0; i < array.length; i++) {
				if (i % 2 == 1) {
					array[i] = suma;
				}
				System.out.print(array[i] + " ");
			}
	}

}
