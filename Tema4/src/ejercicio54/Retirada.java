package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Retirada extends Movimiento {

	public Retirada(LocalDate fecha, BigDecimal importe) {
	        super(fecha, importe);
}
	  @Override
	    public String toString() {
	        return String.format("[R - %s - %.2f €]", fecha, importe);
	    }
}