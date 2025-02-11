package Ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class EquipoCombate {
	private List<Personaje> equipo;
	public EquipoCombate() {
		equipo= new ArrayList<>();
	}

	public void añadirPersonaje(Personaje perso) {
		if (equipo.size() >= 5 || equipo.contains(perso)) {

		} else {
			equipo.add(perso);

		}
	}

	public Integer getVidas() {
		Integer masVida = 0;
		for (int i = 0; i < equipo.size(); i++) {
			masVida = masVida + equipo.get(i).getVida();
		}
		return masVida;
	}

	@Override
	public String toString() {
		return "EquipoCombate [equipo=" + equipo + "]";
	}
	
}
