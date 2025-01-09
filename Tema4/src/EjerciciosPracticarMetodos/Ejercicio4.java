package EjerciciosPracticarMetodos;

public class Ejercicio4 {

	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println(getMayMin(1, "    Buenos dias   "));
		System.out.println(getMayMin(2, "    Introduccion   "));
		System.out.println(getMayMin(3, "    Conclusion  "));
=======

		System.out.println(getMayMin(1, "hola"));
>>>>>>> f7ff1a45b5f3aa7ca708f59ca8b956cebf799cc7
	}

	public static String getMayMin(Integer num, String palabra) {

<<<<<<< HEAD
		palabra = palabra.trim();
		if (num == 1) {
			 palabra= Ejercici1.getMayusculas(palabra);
		} else if (num == 2) {
			palabra= Ejercicio2.getMinusculas(palabra);
		} 
			return palabra ;
		

	}

}
=======
		
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


>>>>>>> f7ff1a45b5f3aa7ca708f59ca8b956cebf799cc7
