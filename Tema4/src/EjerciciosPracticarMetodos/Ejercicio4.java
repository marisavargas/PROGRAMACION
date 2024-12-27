package EjerciciosPracticarMetodos;

public class Ejercicio4 {

	public static void main(String[] args) {

		System.out.println(getMayMin(1, "hola"));
	}

	public static String getMayMin(Integer num, String palabra) {

		
		if (num == 1) {
			return getMayusculas(palabra);
		}
		else if (num == 2) {
			return getMinusculas(palabra);
		}
		else {
			return  " Numero erroneo";
		}
	}
	public static String getMayusculas(String parametros) {
		
		 return parametros = parametros.trim().toUpperCase();
		}
	public static String getMinusculas(String parametros) {
		
		 return parametros = parametros.trim().toLowerCase();
		}
	}


