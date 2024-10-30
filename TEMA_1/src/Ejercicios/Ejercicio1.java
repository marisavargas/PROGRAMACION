import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dame tu nombre: ");

		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();

		System.out.println("Dame tu apellido");
		String apellido = scanner.nextLine();

		System.out.println(" Su nombre completo es " + nombre + " " + apellido);
		scanner.close();
		

	}

}
