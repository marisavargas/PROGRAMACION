package Ejercicio59;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Geografia {
	Map<String, String> paises;

	public Geografia(Map<String, String> paises) {

		paises = new HashMap<>();

	}

	public Boolean agregarPais(String pais, String capital) {
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			String capitalIni = capital.substring(0, 1).toUpperCase() + capital.substring(1, capital.length());

			if (paises.containsKey(pais)) {
				paises.put(pais.toUpperCase(), capitalIni);
				return true;
			} else {
				paises.put(pais.toUpperCase(), capitalIni);
				return false;
			}
		}
		return false;
	}

	public String obtenerCapital(String pais) {

		for (Map.Entry<String, String> entry : paises.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(pais)) {
				return entry.getValue();
			} else {
				return "";
			}

		}
		return "";
	}
	public void imprimirPais() {
		Set<Entry<String,String>>impriPaises= paises.entrySet();
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			
			System.out.print(entry.getKey() + "pais");
			System.out.print(entry.getValue()+ "capital");
			
		}
	}
	public void eliminarPais(String pais) {
		paises.remove(pais.toUpperCase());
		
	}
}
