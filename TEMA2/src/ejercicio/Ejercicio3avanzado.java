package ejercicio;

public class Ejercicio3avanzado {

	public static void main(String[] args) {
	
	for (int i = 1; i < 6; i++) {
		for (int j = 1; j < 10; j++) {
			if(i==1) {
			System.out.print(j);
			}else {
				j=(i+j);
				System.out.print(j);
			}
		}System.out.println();
			
	}

	}

}
