import java.util.Scanner;

public class ejercicio6 {

	public ejercicio6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduce el predio sin IVA del articulo:");
		double iva = 0.21;
		double precioArticulo = scanner.nextDouble();
		double total = precioArticulo * iva;

		System.out.println("el precio fina del articulo es: " + total + "euros") ;

		scanner.close();
	}


}
