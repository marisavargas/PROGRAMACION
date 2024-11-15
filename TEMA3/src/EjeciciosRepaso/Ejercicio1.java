package EjeciciosRepaso;

public class Ejercicio1 {

	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		int contador=0;
		for (int i = 0; i < listaNotas.length; i++) {
			
				if(listaNotas[i] < 5) {
			
				
				contador++;
				}
			
		}
		System.out.println("hay " + contador + "alumnos suspenso");

	}

}

/*
 * Haz un programa que cuente cuántos alumnos han suspendido (tienen menos de un
 * 5). Imprime la cantidad. El resultado debería ser:
 */