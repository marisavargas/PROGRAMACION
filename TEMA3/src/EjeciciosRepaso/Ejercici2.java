package EjeciciosRepaso;

public class Ejercici2 {

	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		int contador=0;
		Double notaMedia = 0.0;
		for (int i = 0; i < listaNotas.length; i++) {
			
				if(listaNotas[i] > 5) {
					notaMedia = listaNotas[i] + notaMedia;
				
				contador++;
				}
			
		}
		System.out.println("hay " + notaMedia/contador + " alumnos suspenso");


		
		
		
		
		
		
		
		
	}

}
		/*Haz un programa que calcule la media de los alumnos que han aprobado. Imprime el resultado. 
		Debería ser: */
