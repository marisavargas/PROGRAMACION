package TipoB;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("CALCULADORA MAGICA");
		Scanner sc = new Scanner(System.in);
		String respuesta;
		Double precio = 0.0;
		Double cantidad = 0.0;
		Double suma = 0.0;
		do {
			System.out.println("¿Que articulo vas a comprar?");
			String articulo = sc.nextLine();
			System.out.println("¿Cuanta cantidad de " + articulo + " vas a comprar'");
			cantidad = sc.nextDouble();
			System.out.println(" ¿que precio tienen el " + articulo + "?");
			precio = sc.nextDouble();
			suma = suma +(cantidad * precio);
			sc.nextLine();
			System.out.println("¿ vas a seguir comprando mas ?");
			respuesta = sc.nextLine();

		} while (respuesta.equalsIgnoreCase("s"));
		
		System.out.println(" Tendra que pagar : " + suma);
		sc.close();
	}

}
