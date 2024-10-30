package ejercicio;
import java.util.Scanner;

public class ejercicio10repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadenaA =scanner.nextLine();
		String cadenaB = scanner.nextLine();
		
		do {		
							
			System.out.println("Dame un nombre:");
			
			
			System.out.println("Dame otro nombre:");
		
			
		}
		while ( cadenaA.isBlank()|| cadenaB.isBlank());
					
		int comparacion = cadenaA.compareTo(cadenaB);//esto lo que hace es hacer la resta entre cadena A y cadena B si sale negativo vamos al siguiente orden (if).
		if (comparacion <=0) {
			
		System.out.println("el orden es :" + cadenaA +" "+ cadenaB);
		}
		else {
			System.out.println("el orden es ." + cadenaB +" "+ cadenaA);
		}
		scanner.close();
		
		
	
		}
	

}
