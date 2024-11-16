package EjeciciosRepaso;

public class Ejercicio6 {

	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

		for (int i = 0; i < listaNotas.length; i++) {
			if (i % 2 == 0) {
				listaNotas[i] = 2 * listaNotas[i];
			}

		}
		System.out.print("lista de notas: ");
		for (int i = 0; i < listaNotas.length; i++) {
			System.out.print(listaNotas[i]);
		}
	}
}
