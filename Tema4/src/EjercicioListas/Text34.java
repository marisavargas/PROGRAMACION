package EjercicioListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" indique cinco cadenas");
		List<String> cadenas=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			cadenas.add(sc.nextLine().toUpperCase());
			
		}
		if( cadenas.contains("")) {
			System.out.println("la cadena esta vacia");
		}
		System.out.println(cadenas);
		for (int i = 0; i < cadenas.size(); i++) {
			if( cadenas.get(i).length()<6) {
				cadenas.remove(i);				
			}
		}
		System.out.println(cadenas);
		sc.close();
		

	}

}
