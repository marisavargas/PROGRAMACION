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
		System.out.println("indica los goles marcados por los locales");
		resultado.setGolesLocales(sc.nextInt());
		System.out.println("indica los goles marcados por los visitantes");
		resultado.setGolesVisitantes(sc.nextInt());
		System.out.println(nuevoPartido);
		System.out.println(nuevoPartido.equipoGanador());
		Jugador jugador = new Jugador( "jugador infiltrado",9);
		equipoVisitante.getJugadores().add(jugador);  /* ojo estudiar*/
		System.out.println(equipoVisitante);
		Jugador jugadorCapitan = equipoLocal.getJugadores().get(equipoLocal.getJugadores().size()-1);
		equipoLocal.setCapitan(jugadorCapitan);
		System.out.println(equipoLocal);
		Equipo.setCompeticion("liga nacional");  /*ejercicio42*/
		System.out.println(equipoVisitante);
		Equipo.setCompeticion("Copa internacional");
		System.out.println(equipoLocal);
		sc.close();
	}
	private static Equipo crearEquipo (Scanner sc) {
		System.out.println("¿dime el nombre del equipo?");
		Equipo equipo = new Equipo(sc.nextLine());
		for (int i = 0; i < 3; i++) {
			System.out.println("Indique el nombre y dosal del un jugador");
			String nombre = sc.nextLine();
			Integer dorsal = sc.nextInt();
			sc.nextLine();
			Jugador jugador = new Jugador (nombre,dorsal);
			equipo.getJugadores().add(jugador);
			if(i==0) {
				equipo.setCapitan(jugador);
			}
		}return equipo;
	}
	

}
