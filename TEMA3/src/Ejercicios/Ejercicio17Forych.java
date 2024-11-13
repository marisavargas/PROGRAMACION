package Ejercicios;

public class Ejercicio17Forych {

	public static void main(String[] args) {
		Double[] numero = new Double[] { 5.4, 3.1, 9.0, 4.7 };
		Double suma = 0.0;
		for (Double num : numero) {
			System.out.print(num + " ");
			suma += num;

		}
		System.out.println(suma);

	}

}

/*
 * Crea un array de números decimales que tenga este contenido: 5.4, 3.1, 9.0,
 * 4.7 Imprime el contenido del array utilizando un bucle foreach Luego, calcula
 * la suma de todo el array utilizando también un bucle foreach
 */