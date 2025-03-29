package Tema55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Evaluacion {

	private Map<String, BigDecimal> alumnos;

	public Evaluacion() {
		super();
		alumnos = new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public Boolean addNota(String dni, BigDecimal nota) {

		for (Map.Entry<String, BigDecimal> entry : alumnos.entrySet()) {
			String key = entry.getKey();
			BigDecimal val = entry.getValue();
			if (key.equals(dni) && val == null) {
				alumnos.put(dni, nota);
				return true;
			}

		}
		if (!alumnos.containsKey(dni)) {
			alumnos.put(dni, nota);
			return true;
		} else {
			return false;
		}
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (alumnos.containsKey(dni) && !(alumnos.get(dni) == null)) {
			alumnos.put(dni, nota);
			return true;

		} else {
			return false;
		}
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		if (alumnos.get(dni) == null) {
			return BigDecimal.ZERO;
		} else {
			return alumnos.get(dni);
		}

	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal sumaNota = new BigDecimal(0);
		Collection<BigDecimal> notas = alumnos.values();
		for (BigDecimal nota : notas) {
			if (!(nota == null)) {
				sumaNota = sumaNota.add(nota);

			}
		}
		return sumaNota.divide(new BigDecimal(alumnos.size()), 2, RoundingMode.HALF_DOWN);
	}
	public Integer obtenerCantidadAprobaddos() {
		Integer contador=0;
		Collection<String> notas = alumnos.keySet();
		for (String nota : notas) {
			if (alumnos.get(nota).compareTo(new BigDecimal(5)) > 0) {
				  contador ++;

			}
		}
		return contador;
	}

	public List<String> obtenerSuspensos() {
		List<String> alumnoSuspensos = new ArrayList<>();
		Collection<String> notas = alumnos.keySet();
		for (String nota : notas) {
			if (alumnos.get(nota).compareTo(new BigDecimal(5)) < 0) {
				alumnoSuspensos.add(nota);

			}
		}
		return alumnoSuspensos;
	}

	public void borrarAprobados() {
		Set<String> dnis = alumnos.keySet();
		Iterator<String> it = dnis.iterator();
		while (it.hasNext()) {
			String dni = (String) it.next();
			if (alumnos.get(dni).compareTo(new BigDecimal(5)) < 0) {
				it.remove();
			}
		}

	}

	@Override
	public String toString() {
		DecimalFormat ft = new DecimalFormat("#.0");
		String aprobados = "Aprobados:\n";
		String suspensos = "Suspensos:\n";

		Set<String> dnis = alumnos.keySet();
		for (String dni : dnis) {
			String linea = "\t" + dni + " (" + ft.format(alumnos.get(dni)) + ")\n";
			if (alumnos.get(dni).compareTo(new BigDecimal(5)) < 0) {
				aprobados += linea;
			} else {
				suspensos += linea;
			}
		}

		return aprobados + "\n" + suspensos;
	}

	

}
