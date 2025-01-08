package EjerciciosPracticarMetodos;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(getMayMin(1, "    Buenos dias   "));
		System.out.println(getMayMin(2, "    Introduccion   "));
		System.out.println(getMayMin(3, "    Conclusion  "));
	}

	public static String getMayMin(Integer num, String palabra) {

		palabra = palabra.trim();
		if (num == 1) {
			 palabra= Ejercici1.getMayusculas(palabra);
		} else if (num == 2) {
			palabra= Ejercicio2.getMinusculas(palabra);
		} 
			return palabra ;
		

	}

}
