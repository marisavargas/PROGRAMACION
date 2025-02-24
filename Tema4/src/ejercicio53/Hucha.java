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

	public BigDecimal sacarDinero(BigDecimal dinero) {
		
	
		if(ahorrado.compareTo(dinero)>0) {
		ahorrado= ahorrado.subtract(dinero);
	
		return ahorrado=  BigDecimal.ZERO;
		
	}else {
		
		return ahorrado= ahorrado.subtract(dinero);
	
	}

}	
	public BigDecimal contarDinero() {
		return ahorrado;
	}

	public BigDecimal romperHucha() {
		
		
		return ahorrado;
	}

	@Override
	public String toString() {
		BigDecimal formato = new DecimalFormat("#,###.00€");
		return formato.format(ahorrado);
	}
}


