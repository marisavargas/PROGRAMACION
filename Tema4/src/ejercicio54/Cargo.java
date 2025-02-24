package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cargo extends Movimiento {
 private String cifEmpresa;

public Cargo(LocalDate fecha, BigDecimal importe,String cifEmpresa) {
	super(fecha, importe);
	this.cifEmpresa=cifEmpresa;
}

@Override
public String toString() {
	return String.format("[C-%s- %.2f €- %s]", fecha, importe,cifEmpresa);
			} 
}
