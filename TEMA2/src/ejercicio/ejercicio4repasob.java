package ejercicio;

import java.util.Scanner;

public class ejercicio4repasob {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero =1;
		Integer suma = 0;
		while (numero != 0) {
			System.out.println("Dame un numero");
			numero = sc.nextInt();
			suma = suma + numero;
		} 
		
		System.out.println("Resultado =" + suma);
		// este ejercicio esta echo con el buble while 
		sc.close();
	

	}

}
