package Ejercicio59;

import java.math.BigDecimal;
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
			}

		}
		return "";
	}

	public void imprimirPais() {
		Set<Entry<String, String>> impriPaises = paises.entrySet();
		for (Map.Entry<String, String> entry : paises.entrySet()) {

			System.out.print(entry.getKey() + "pais");
			System.out.print(entry.getValue() + "capital");

		}
	}

	public void eliminarPais(String pais) {
		paises.remove(pais.toUpperCase());

	}

	public BigDecimal calcularLonguitudMediaPaises() {
		Set<String> conjuntoPaises = paises.keySet();
		Integer contador = 0;
		if (paises.size() != 0) {
			for (String pais : conjuntoPaises) {
				contador += pais.length();

			}
			return (new BigDecimal(contador).divide(new BigDecimal(paises.size())));
		} else {
			return BigDecimal.ZERO;
		}

	}

	public void eliminarPaisConCapitalLetra(String letra) {
		for (Map.Entry<String, String> entry : paises.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			if (capital.substring(0, 1).equalsIgnoreCase(letra)) {
				paises.remove(pais);
				break;
			}

		}
	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer contador = 0;

		for (Map.Entry<String, String> entry : paises.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			if (capital.substring(0, 1).equalsIgnoreCase(letra)) {
				contador++;
			}
		}
		return contador;
	}

	public void imprimirNumeroPaisesLetra(String letra) {
		Boolean hay = false;

		for (Map.Entry<String, String> entry : paises.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			if (capital.substring(0, 1).equalsIgnoreCase(letra)) {
				System.out.println(pais + capital);
				hay = true;

			}
		}
		if (hay == false) {
			System.out.println("Ninguna capital del mapa comienza por " + letra);
		}

	}

	public void mismaLetra() {
		Boolean hay = false;

		for (Map.Entry<String, String> entry : paises.entrySet()) {
			String pais = entry.getKey();
			String capital = entry.getValue();
			if (capital.substring(0, 1).equalsIgnoreCase(pais.substring(0, 1))) {
				System.out.println(pais + capital);
				hay = true;

			}
		}
		if (hay == false) {
			System.out.println("Ninguna capital del mapa comienza por  letra");
		}

	}

}
