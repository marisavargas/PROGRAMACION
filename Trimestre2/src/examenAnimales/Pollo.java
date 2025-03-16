package examenAnimales;

import java.math.BigDecimal;

public class Pollo extends Animal{

	public Pollo(Integer numeroRegstro) {
		super(numeroRegstro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getPesoMinVenta() {
		
		return  new BigDecimal(5);
	}

	@Override
	public BigDecimal getPrecioVentaKg() {
		
		return VENTAPOLLO;
	}

	@Override
	public Boolean sePuedeVender() {
		if(peso.compareTo(getPesoMinVenta())<0) {
			return false;
		}
				return true ;
	}
	

}
