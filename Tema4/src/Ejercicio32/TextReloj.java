package Ejercicio32;

import java.util.Scanner;

public class TextReloj {

	public static void main(String[] args) {
		Reloj reloj= new Reloj();
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la hora de reloj");
		Integer hora=sc.nextInt();
		System.out.println("Indique los minutos del reloj");
		Integer minutos =sc.nextInt();
		System.out.println("Indique los segundos del reloj");
		Integer segundos =sc.nextInt();
		reloj.ponerEmHoraB(hora, minutos, segundos);
		System.out.println(reloj);
		reloj.setFormato24horas(false);
		System.out.println(reloj);
		reloj.ponerEnHoraA(24,17);
		System.out.println(reloj);
		reloj.ponerEnHoraA(21,82);
		System.out.println(reloj);
		reloj.ponerEmHoraB(17,16,15);
		System.out.println(reloj);
		Reloj relojNuevo = new Reloj(17,16,15);
		System.out.println(reloj.equals(relojNuevo));
		
	}

}
