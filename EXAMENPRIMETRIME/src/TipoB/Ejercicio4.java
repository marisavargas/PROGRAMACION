package TipoB;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean num = false;
		String []array ;
		String par ;
		Boolean hayPar= false;
		do {
			
		System.out.println("Indique una lista de numeros emtre 10 y 99 separados por guiones");
		String lista = sc.nextLine();
		array = lista.split("-");
		for (int i = 0; i < array.length; i++) {

			if (Integer.parseInt(array[i]) < 100
					&& Integer.parseInt(array[i]) > 9) { /* aqui ponemos en la condicion el paso de cadena a numero */
				num = true;
			}else {
				System.out.println("El numero  " + array [i] + "no esta en los limites solcitados");
				num = false;
				break;
			}
			}
		}while( num == false);
		 par = array[0];
		for (int i = 0; i < array.length; i++) {
			if( Integer.parseInt(array[i]) %2==0) {
				if( Integer.parseInt(array[i])< Integer.parseInt(par)) {
				par =(array [i]);
				hayPar = true;
			}
			
		}

	}  if( hayPar== false) {
		System.out.println("No hay ningun numero par");
	}else {
		System.out.println(" el numero mas pequeño par es  " + par );
	}sc.close();
	}
}
