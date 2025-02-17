package Ejercicio49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class text49SEt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" indique cinco cadenas");
		Set<String> cadenas = new HashSet<>();
		
		Set<String>auxiliar = new HashSet<>();
		for (String string : auxiliar) {
			String cadenaMay = ((String) cadenas).toUpperCase();
			auxiliar.add(cadenaMay);
		}
		System.out.println(cadenas);
		if( cadenas.contains("")) {
			System.out.println("la cadena esta vacia");
		}
		System.out.println(cadenas);
		Iterator<String> iterador = cadenas.iterator();
		
		while(iterador.hasNext()) {
			if(iterador.next().length()<6) {
				iterador.remove();
			}
		}System.out.println(cadenas);
		sc.close();	
		}
		
}

