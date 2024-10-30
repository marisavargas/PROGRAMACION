package ejercicio;

import java.util.Scanner;

public class ejercicio13repaso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		String texto = scanner.nextLine();
		int longuitudTexto = texto.length();
		int i = 0;
		int fin;
		while (i < longuitudTexto) {
			fin = i+5;
			
			if (fin>longuitudTexto){   // esto se hace para el final para que no se quede pillado
				fin = longuitudTexto;
			}							// y por eso lo decimos que coja hasta el final de la cadena solo
				String trozo = texto.substring(i, fin);
				System.out.println(trozo);
			 i = i+5;// aqui vuelvo a definir la variable i para que me sume 5
		}scanner.close();
	}   								///			OJO ESTO HAY QUE ESTUDIARSELO
	
}
