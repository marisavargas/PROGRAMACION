package ejercicio;

public class ejercicio6repasoclase {

	public static void main(String[] args) {

		int numero = 0;
		int cantidad = 0;
		for (int j = 1; j <= 10; j++) { // j es la variable del numero de veces que se repite
			numero = numero + 3;
			if (j == 10)
				System.out.print(numero);
			else {
				System.out.print(numero + "+");
			}
			cantidad += numero;
		}
		System.out.println(" = " + cantidad);
	}

}
