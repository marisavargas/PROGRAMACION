package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ingreso extends Movimiento {
	 private String descripcion;

	    public Ingreso(LocalDate fecha, BigDecimal importe, String descripcion) {
	        super(fecha, importe);
	        this.descripcion = descripcion;
	    }
	    @Override
	    public String toString() {
	        return String.format("[I - %s - %.2f € - %s]", fecha, importe, descripcion);
	    }
}
