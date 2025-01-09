package EjerciciosPracticarMetodos;

public class Ejercici1 {

	public static void main(String[] args) {
<<<<<<< HEAD
		String parametros ="¿ hola qwe tal?    ";
=======
		String parametros ="a";
>>>>>>> f7ff1a45b5f3aa7ca708f59ca8b956cebf799cc7
		String mayusculas= getMayusculas(parametros);// queremos que la vaiable parametros haga la funcion getMayusculas//
		System.out.println( mayusculas);
		
	}
	public static String getMayusculas(String parametros) {
	
	 return parametros = parametros.trim().toUpperCase();
	}
}
/* creamos una funcion donde le decimos que le quite los espacio y lo pase a mayusculas, despues iniciamos parametros y mayuculas
para guardar lo que me devuelve la funcion y lo imprima*/