package RepeticionEjercicio;

import java.util.Scanner;

public class Ejercicio11Tema2BasicoRepetido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email ;
		String parte;
		Boolean valido= true;
		do {
		System.out.println("Introduce un email");
		email = sc.nextLine();
		parte=email.substring(email.indexOf("@")+1);
			if ((! email.contains("@") )|| parte.startsWith(".")|| email.endsWith(".")) {
				valido=false;
				System.out.println("El email no es valido");
			}else { valido =true;
			}
				
		} while ( valido == false);
		
		System.out.println("el email es valido   "  +  email ) ;
	}	
}
