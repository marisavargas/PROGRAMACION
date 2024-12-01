package RepeticionEjercicio;

import java.util.Iterator;
import java.util.Random;

public class EjercicioMenorMayor {

	public static void main(String[] args) {
		Random randon = new Random();
		Integer maximo = 0;
		Integer minimo = 0;
		Integer[] array = new Integer[10];
		for (int i = 0; i < array.length; i++) {
			Integer aleatorio = randon.nextInt(1, 21);
			array[i] = aleatorio;
			System.out.print(  array [i] +" - ");
		}
		Integer posicionMin = 0;
		Integer posicionMix = 0;
		maximo = array[0];
		minimo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
				posicionMix = i;
			}
			if (array[i] < minimo) {
				minimo = array[i];
				posicionMin = i;
			}
		}
		System.out.println();
		System.out.println("el valor maximo es  " + maximo + "   esta en la posicion  " + posicionMix);
		System.out.println("el valor minimo es  " + minimo + " esta en la posicion  " + posicionMin);

	}

}

/*escribe un programa que genere 10 numeros random del 1 al 20, los almacene en un array y que luegos
 * muestre el valor maximo y su pocision y el valor minimo y su posicion*/
