package EjerciciosPracticarMetodos;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		String minusculas= getMinusculas(" hola ¿que tal?");// queremos que la vaiable parametros haga la funcion getMinusculas//
		System.out.println( minusculas);
		
	}
	public static String getMinusculas(String parametros) {
	
	 return parametros = parametros.trim().toLowerCase();
	}
}
/* es igual que el ejercicio*/ 