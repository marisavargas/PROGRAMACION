package ejercicio;

public class Ejercicio3avanzado {

	public static void main(String[] args) {

		Integer[] num = new Integer[] { 1, 2, 3, 4, 5 }; // tambien se puede poner sin el new integer
		for (Integer incremento : num) {
			for (int i = incremento; i < 10; i += incremento) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
