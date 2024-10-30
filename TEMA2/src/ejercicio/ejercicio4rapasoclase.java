package ejercicio;

import java.util.Scanner;

public class ejercicio4rapasoclase {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Dime el numero de unidades");
		double unidades = sc.nextDouble();
		double precio = sc.nextDouble();
		double compra = sc.nextDouble();
		double descuento = sc.nextDouble();
				
		if ( unidades > 100 ) {
			
			 descuento = 0.40;
			
		}else if (unidades >=25 ) {
			 descuento =  0.20;
			
		}else if ( unidades >=10) {
			  descuento = 0.10;
			
		}else{
			
			double subtotal = precio * unidades;
			double totalDescuento = subtotal * descuento;
			double total = subtotal - totalDescuento ;
			System.out.println("  subtotal " + subtotal);
			System.out.println(" descuento aplicado" + totalDescuento);
			System.out.println(" total a pagar"+ total);
			sc.close();		
		}
	}

}
