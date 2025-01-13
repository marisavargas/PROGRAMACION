package EjerciciosPracticarMetodos.ejercicio9;

public class ArrayUtils {
	public void imprimeArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public String obtenerPalabra(String[] cadena, Integer n) {
		if (n > cadena.length || n < 0) {
			return "";
		} else {
			return cadena[n];
		}
	}

	public Integer buscarPalabra(String[] cadena, String palabra) {
		
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].equalsIgnoreCase(palabra)) {
				return i;
			}

		} return -1;
	}
}
