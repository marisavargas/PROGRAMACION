package ejercicio56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer>patatas = new HashMap<>();

		Integer contadorTotal=0;
		do {
		System.out.println("Introduce un numero");
		Integer numero=sc.nextInt();
		if(!patatas.equals(0)) {
			if(patatas.containsKey(numero)) {
				Integer cantidadActual = patatas.get(numero);
				patatas.put(numero, cantidadActual+1);
				
			}
			else {
				patatas.put(numero,1);
			}
			contadorTotal ++;
		}
		}
		while(!patatas.equals(0));
			sc.close();
			imprimirNumeros(patatas,contadorTotal);
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
