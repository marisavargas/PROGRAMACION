package ejercicio53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	private BigDecimal ahorrado;

	public Hucha() {
		this.ahorrado = BigDecimal.ZERO;

	}

	public BigDecimal meterDinero(BigDecimal x) {
		ahorrado = ahorrado.add(x).setScale(2, RoundingMode.HALF_DOWN);
		return ahorrado;
	}

	public BigDecimal sacarDinero(BigDecimal j) {

		if (ahorrado.compareTo(j) > 0) {
			ahorrado = ahorrado.subtract(j);
			return ahorrado;
		} else {

			return ahorrado = ahorrado.subtract(ahorrado);

		}

	}

	public BigDecimal contarDinero() {
		return ahorrado;
	}

	public BigDecimal romperHucha() {
		BigDecimal guardar = ahorrado;
		ahorrado=BigDecimal.ZERO;
		return guardar;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		return formato.format(ahorrado);
	}
}
