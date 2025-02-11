package Ejercicio44;

public class Jugador {
	private String nombre;
	public EquipoCombate equipo;
    
	public Jugador(String nombre, EquipoCombate equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EquipoCombate getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoCombate equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}

}
