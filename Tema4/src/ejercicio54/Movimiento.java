package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

abstract class Movimiento {
protected LocalDate fecha;
protected BigDecimal importe;
public Movimiento(LocalDate fecha, BigDecimal importe) {
	super();
	this.fecha = fecha;
	this.importe = importe;
}
public LocalDate getFecha() {
	return fecha;
}

public BigDecimal getImporte() {
	return importe;
}
@Override
public String toString() {
	return "Movimiento [fecha=" + fecha + ", importe=" + importe + "]";
}


}
