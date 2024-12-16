package TipoA;

import java.util.Scanner;

public class Ejercici4 {

	public static void main(String[] args) {
		System.out.println("¿Cuantos ingredientes lleva la receta?");
		Scanner sc = new Scanner(System.in);
		Integer respuesta = sc.nextInt();
		sc.nextLine();
		Double precio = 0.0;
		Double cantidad = 0.0;
		Double suma = 0.0;
		Integer contador = 0;
		do {
			System.out.println("¿Cual es el nombre de cada ingrediente?");
			String ingrediente = sc.nextLine();
			sc.nextLine();
			System.out.println("¿Cuanta cantidad de " + ingrediente + " necesitas?");
			cantidad = sc.nextDouble();
			System.out.println(" ¿que precio tienen el " + ingrediente + "?");
			precio = sc.nextDouble();
			suma = suma +(cantidad * precio);
			contador ++;
		} while (contador != respuesta);
		
		System.out.println(" Tendra que pagar : " + suma);
		sc.close();
	}
}
