package examenaPlantas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Plantacion {
	private String cif;
	private List<Arbol> arboles;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public void addArbol(Arbol arbol) {
		arboles.add(arbol);

	}

	public List<Arbol> getArbolesAnualidad(Integer año) {
		List<Arbol> arbolPlantados = new ArrayList<>();
		for (Arbol arbol : arbolPlantados) {
			if (arbol.getFechaPlantacion().getYear() == año) {
				arbolPlantados.add(arbol);
			}
		}
		return arbolPlantados;

	}

	public BigDecimal getAlturaTotal() {
		BigDecimal alturaTotal = new BigDecimal(0);
		for (Arbol arbol : arboles) {
			alturaTotal = alturaTotal.add(arbol.getAltura());
		}

		return alturaTotal.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal calculaGananciaTotal() {
		BigDecimal sumaDinero = new BigDecimal(0);
		for (Arbol arbol : arboles) {
			if (arbol.sePuedeExpotar() == true) {
				sumaDinero = sumaDinero.add(arbol.getPrecioMinimaExportacion().multiply(arbol.getAltura()));
			}
		}
		return sumaDinero.setScale(2, RoundingMode.HALF_UP);
	}

	public void exportarArboles() {
		Iterator<Arbol> iterador = arboles.iterator();
		while (iterador.hasNext()) {
			Arbol arbol = iterador.next();
			if (arbol.sePuedeExpotar()) {
				iterador.remove();
			}

		}

	}

	@Override
	public String toString() {
		return "Plantacion " + cif + " arboles=" + arboles.size() + getAlturaTotal() + "cm total altura";
	}

}
