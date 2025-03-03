package eje.fijo.movil;

import java.math.BigDecimal;

public  class Movil extends Telefono {
private BigDecimal longitud;
private BigDecimal latitud;

public Movil(Integer numero, BigDecimal longitud,BigDecimal latitud) {
	this.numero=numero;
	this.longitud=longitud;
	this.latitud=latitud;
	this.enLlamada= false;
}



}
