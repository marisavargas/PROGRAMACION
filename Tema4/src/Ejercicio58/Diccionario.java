package Ejercicio58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> mapa;

	public Diccionario() {
		mapa = new HashMap<>();
	}

	public void cargarDiccionario(List<String> lista) {
		for (String patata : lista) {
			String clave = patata.substring(0, 1).toUpperCase();
			if (!mapa.containsKey(clave)) {
				List<String> peo = new ArrayList<>();
				peo.add(patata);
				mapa.put(clave, peo);
			} else {
				mapa.get(clave).add(patata);
			}
		}
	}

	public void borrarDiccionario() {
		mapa.clear();
	}

	public void imprimirPalabras(String letra) {
		if (mapa.containsKey(letra.toUpperCase())) {
			System.out.println("Letra: " + letra.toUpperCase());
			System.out.println("Hay " + mapa.get(letra).size() + " palabras que empiezan por " + letra + ":");
			for (String patata : mapa.get(letra.toUpperCase())) {
				System.out.println(patata);

			}
		} else {
			System.out.println("No hay palabras que empiezan por " + letra);
		}
	}

}
