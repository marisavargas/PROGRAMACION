package eje.fijo.movil;

import java.math.BigDecimal;

public class localizacionGps {
	private BigDecimal longitud;
	private BigDecimal latitud;
	
	
	public localizacionGps(BigDecimal longitud, BigDecimal latitud) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
	}
	public BigDecimal getLongitud() {
		return longitud;
	}
	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}
	public BigDecimal getLatitud() {
		return latitud;
	}
	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

}
