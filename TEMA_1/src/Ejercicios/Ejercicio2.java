import java.util.Scanner;
public class Ejercicio2 {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("indique su nombre de usuario");
		String nombreDeUsuario = scanner.nextLine();
		System.out.println("Bienvenido " + nombreDeUsuario );
		System.out.println("¿De donde eres?");
		String lugar = scanner.nextLine();
		System.out.println("¿Que tal se vive en " + lugar + "?");
		scanner.nextLine();
		System.out.println("Gracias.Un saludo.");
		
scanner.close();
	}

}
