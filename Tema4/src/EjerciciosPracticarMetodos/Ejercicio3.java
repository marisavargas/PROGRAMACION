package EjerciciosPracticarMetodos;

public class Ejercicio3 {

	public static void main(String[] args) {
		Integer num = 2;
		String palabra = " hola";
		String palabraNueva = getMayMin(num, palabra);
		System.out.println(palabraNueva);
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
