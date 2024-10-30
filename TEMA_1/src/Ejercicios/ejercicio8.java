import java.util.Scanner;

public class ejercicio8 {

	public ejercicio8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("dame un nùmero entero");
		String a = scanner.nextLine();
		System.out.println("dame un nùmero decimal");
		Double b = scanner.nextDouble();
		System.out.println("dame un nùmero entero");
		Float c = scanner.nextFloat();
		long x1 = Long.parseLong(a);
		String x2 = b.toString();
		Integer x3 = b.intValue();
		Long X4 = c.longValue();
		System.out.println("Valor de x1 (long)" + x1);
		System.out.println("valor de x2 (string)" + x2);
		System.out.println("Valor de x3 (integer)" + x3);
		System.out.println("valor de x4 (long)" + X4);
		scanner.close();
	}

}
