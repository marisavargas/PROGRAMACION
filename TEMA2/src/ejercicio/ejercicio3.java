package ejercicio;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduce el predio sin IVA del articulo:");
		double ivaNormal= 0.21;
		double ivaReducido = 0.10;
		double ivaSuperreducido = 0.04;
		double ivaExento = 0;
		double precioArticulo = scanner.nextDouble();
		double tipoDeIva = scanner.nextDouble();
		System.out.println("¿que tipo de iva aplicamos al  articulo?");
		double total = precioArticulo * tipoDeIva ;
		

		System.out.println("el precio fina del articulo es: " + total + "euros") ;

		
		
		
		
	}

}
