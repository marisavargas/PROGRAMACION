package examenAnimales;

import java.math.BigDecimal;

public class Cerdo extends Animal {
	private String raza;

	public Cerdo(Integer numeroRegstro) {
		super(numeroRegstro);
		// TODO Auto-generated constructor stub
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public BigDecimal getPesoMinVenta() {

		return new BigDecimal(100);
	}

	@Override
	public BigDecimal getPrecioVentaKg() {

		return VENTACERDO;
	}

	@Override
	public Boolean sePuedeVender() {
		if (peso.compareTo(getPesoMinVenta()) < 0) {
			return false;
		}
		return true;
	}

}
