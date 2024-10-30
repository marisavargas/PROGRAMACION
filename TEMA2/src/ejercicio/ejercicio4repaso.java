package ejercicio;

import java.util.Scanner;

public class ejercicio4repaso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;
		Integer suma = 0;
		do {
			System.out.println("Dame un numero");
			numero = sc.nextInt();
			suma = suma + numero;
		} while (numero != 0);
		
		System.out.println("Resultado =" + suma);
		// este ejercicio esta echo con el bucle do/while
		sc.close();
		
	}

}
