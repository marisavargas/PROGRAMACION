package ejercicio56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer>numeros = new HashMap<>();

		Integer contadorTotal=0;
		do {
		System.out.println("Introduce un numero");
		Integer numero=sc.nextInt();
		if(!numero.equals(0)) {
			if(numeros.containsKey(numero)) {
				Integer cantidadActual = numeros.get(numero);
				numeros.put(numero, cantidadActual+1);
				
			}
			else {
				numeros.put(numero,1);
			}
			contadorTotal ++;
		}
		}
		while(!numeros.equals(0));
			sc.close();
			imprimirNumeros(numeros,contadorTotal);
		}
	private static void imprimirNumeros(Map<Integer,Integer> numeros,Integer numero) {
		for (Map.Entry<Integer,Integer>entry : numeros.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("Distribucion :");
			if (val==1) {
				System.out.println(" >numero " + key + "  : " + val + "vez");
			}
			else
				System.out.println(" >numero " + key + "  : " + val + "veces");
		}
}
}
