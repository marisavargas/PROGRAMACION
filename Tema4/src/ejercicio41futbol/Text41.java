package ejercicio41futbol;

import java.util.Scanner;

public class Text41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipoLocal = crearEquipo(sc);
		Equipo equipoVisitante = crearEquipo(sc);
		System.out.println(equipoLocal);
		System.out.println(equipoVisitante);
		Pastido nuevoPartido = new Pastido();
		nuevoPartido.setEquipoLocal(equipoLocal);
		nuevoPartido.setEquipoVisitante(equipoVisitante);
		Resultado resultado = new Resultado();
		nuevoPartido.setResultado(resultado);
		
		

	}
	private static Equipo crearEquipo (Scanner sc) {
		System.out.println("¿dime el nombre del equipo?");
		Equipo equipo = new Equipo(sc.nextLine());
		for (int i = 0; i < 3; i++) {
			System.out.println("Indique el nonbre y dosal del un jugador");
			String nombre = sc.nextLine();
			Integer dorsal = sc.nextInt();
			Jugador jugador = new Jugador (nombre,dorsal);
			equipo.getJugadores().add(jugador);
			if(i==1) {
				equipo.setCapitan(jugador);
			}
		}return equipo;
	}
	

}
