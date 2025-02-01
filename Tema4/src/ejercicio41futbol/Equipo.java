package ejercicio41futbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {
	private static  String competicion;  /*ejercicio42*/
	private String nombre;
	private Jugador capitan;
	private List<Jugador> jugadores;

	public Equipo(String nombre) {
<<<<<<< HEAD
		jugadores=  new ArrayList<>();
=======
>>>>>>> 90d4c0a41e0be9f07da04b8fdcc077c8b355a587
		this.nombre = nombre;
		jugadores = new ArrayList<Jugador>();
		
	}
	public static void setCompeticion(String competicion) {
		Equipo.competicion = competicion;
	}
	
	public static String getCompeticion() {
		return competicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return nombre + "- capitan=" + capitan + ", jugadores=" + jugadores + competicion;
=======
		return nombre + "- capitan=" + capitan.getNombre() + ", jugadores=" + jugadores();
>>>>>>> 90d4c0a41e0be9f07da04b8fdcc077c8b355a587
	}

}
