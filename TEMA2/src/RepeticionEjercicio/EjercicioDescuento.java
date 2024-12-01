package RepeticionEjercicio;

import java.util.Scanner;

public class EjercicioDescuento {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Double precio ;
		Integer unidades;
		do {
		System.out.println("Indicame el precio del producto");
		 precio = sc.nextDouble();
		System.out.println("Indicame el numero de unidades");
		 unidades = sc.nextInt();
		Double subtotal = precio * unidades;
		System.out.println(subtotal);
		
		if (unidades >100 ) {
			 System.out.println( subtotal * 0.40);
			 System.out.println( subtotal - (subtotal * 0.40));
			 
		}
		else if (unidades >25 && unidades <100 ) {
			 System.out.println( subtotal * 0.20);
			 System.out.println( subtotal - (subtotal * 0.20));
			 
		}
		else if (unidades >10 && unidades <24 ) {
			 System.out.println( subtotal * 0.10);
			 System.out.println( subtotal - (subtotal * 0.10));
			 
		}else {
	}
		}while (!(unidades ==0 || precio ==0));
		sc.close();
	}	
}
