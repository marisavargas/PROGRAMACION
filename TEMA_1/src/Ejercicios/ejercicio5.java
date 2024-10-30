import java.util.Scanner;
public class ejercicio5 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ¿Cuanto te gustarìa ganar este año?");
		double salario = scanner.nextInt();
		double meses = 12 ;
		double mensualidad = salario / meses ;
		System.out.println("Tu sueldo mensual seria de " + mensualidad + "euro" ) ;
		scanner.close();
		
		
	
				
				
	}

}
