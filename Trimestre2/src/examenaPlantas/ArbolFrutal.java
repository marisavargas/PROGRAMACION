package examenaPlantas;

import java.math.BigDecimal;

public class ArbolFrutal extends Arbol {

	private String especie;

	public ArbolFrutal(Integer numeroSerie) {
		super(numeroSerie);
		// TODO Auto-generated constructor stub
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public Boolean sePuedeExpotar() {
		if (Altura.compareTo(new BigDecimal(150)) < 0) {

			return false;

		}
		return true;

	}

	@Override
	public BigDecimal getAlturaMinimaExportacion() {
		
		return new BigDecimal (150);
	}

	@Override
	public BigDecimal getPrecioMinimaExportacion() {
		
		return getExportfrutal();
	}
}
