package examenaPlantas;

import java.math.BigDecimal;

public class ArbolPino extends Arbol {

	public ArbolPino(Integer numeroSerie) {
		super(numeroSerie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean sePuedeExpotar() {
		if (Altura.compareTo(new BigDecimal(100)) < 0) {
			return false;
		}
		return true;
	}

	@Override
	public BigDecimal getAlturaMinimaExportacion() {
		
		return  new BigDecimal(100);
	}

	@Override
	public BigDecimal getPrecioMinimaExportacion() {
		
		return  getExportpino();
	}

}
