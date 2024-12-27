package EjerciciosPracticarMetodos;

public class Ejercicio3 {

	public static void main(String[] args) {

		System.out.println(getMayMin(1, "hola"));
	}

	public static String getMayMin(Integer num, String palabra) {

		palabra = palabra.trim();
		if (num == 1) {
			return palabra = palabra.toUpperCase();
		} else if (num == 2) {
			return palabra = palabra.toLowerCase();
		} else {
			return palabra = " Numero erroneo";
		}
	}
}
