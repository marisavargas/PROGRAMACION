package RepeticionEjercicio;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBorrarValor {

	public static void main(String[] args) {
		Random random = new Random ();
		Integer []array =  new Integer[10];
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		for (int i = 0; i < array.length; i++) {
			Integer aleatorio = random.nextInt(1,51);
			array[i]= aleatorio;
			System.out.print(array [i] + " ");
			
		}
		System.out.println("introduce un numero");
		 num= sc.nextInt();
		 for (int i = 0; i < array.length; i++) {
			 if( array [i] == num) {
				 array [i] =0;
				}
			 System.out.print( array [i]+" ");
		} 
		sc.close(); 
	}

}/* escribe un programa que genere 10 numeros aleatorios del 1 al 50,  los imprima
y luego recorra el array y borre el valor que le pedimos al usuario y nos muestre de nuevo el arra
una vez modificado*/
