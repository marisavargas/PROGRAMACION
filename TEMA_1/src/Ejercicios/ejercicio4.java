import java.util.Scanner;

public class ejercicio4 {

	public ejercicio4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("indique su año de nacimiento");
		int añoNacimiento = scanner.nextInt();
		
		int añoActual = 2024 ;
		
		int edadActual = añoActual - añoNacimiento ;
			
		System.out.println("la edad del usuario es " + edadActual );
		
		scanner.close();
		
	}

}
