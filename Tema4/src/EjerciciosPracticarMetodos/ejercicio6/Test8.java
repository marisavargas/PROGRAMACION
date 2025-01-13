package EjerciciosPracticarMetodos.ejercicio6;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Calculadora calcular = new Calculadora();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Damen dos numero enteros y una cadena");
		Integer num1 = sc.nextInt();
		Integer num2= sc.nextInt();
		sc.nextLine();
		String palabra = sc.nextLine();
		
		 System.out.println (calcular.getCalcular(num1, num2, palabra));
		
	}

}

