package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

abstract class Movimiento {
protected LocalDate fecha;
protected BigDecimal importe;
public Movimiento( BigDecimal importe) {
	super();
	this.fecha = LocalDate.now();
	this.importe = importe;
}
public LocalDate getFecha() {
	return fecha;
}

public BigDecimal getImporte() {
	return importe;
}
public abstract String getTipo(); 




}
