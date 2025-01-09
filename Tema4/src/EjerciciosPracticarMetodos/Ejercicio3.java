package EjerciciosPracticarMetodos;

public class Ejercicio3 {

	public static void main(String[] args) {
<<<<<<< HEAD
		/*Integer num =1;
		String palabra = " hola";
		String palabraNueva = getMayMin(num, palabra);
		System.out.println(palabraNueva);
		 esto se hace con variable declaradas una a una*/
		
		System.out.println(getMayMin(1, "    Buenos dias   "));
		System.out.println(getMayMin(2, "    Introduccion   "));
		System.out.println(getMayMin(3, "    Conclusion  "));
=======

		System.out.println(getMayMin(1, "hola"));
>>>>>>> f7ff1a45b5f3aa7ca708f59ca8b956cebf799cc7
	}

	public static String getMayMin(Integer num, String palabra) {

		palabra = palabra.trim();
		if (num == 1) {
			return palabra = palabra.toUpperCase();
		} else if (num == 2) {
			return palabra = palabra.toLowerCase();
		} else {
<<<<<<< HEAD
			return palabra ;
=======
			return palabra = " Numero erroneo";
>>>>>>> f7ff1a45b5f3aa7ca708f59ca8b956cebf799cc7
		}
	}
}
