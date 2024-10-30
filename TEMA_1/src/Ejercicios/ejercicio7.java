import java.util.Scanner;

public class ejercicio7 {

	public ejercicio7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique su peso");
		double masa = scanner.nextDouble();
		System.out.println("Indique su altura");
		double altura = scanner.nextDouble();
		System.out.println(" su imc :" + masa / (altura * altura) );
	scanner.close();
	
	
		
	}

}
