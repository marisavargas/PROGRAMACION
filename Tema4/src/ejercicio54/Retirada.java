package ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Retirada extends Movimiento {

	public Retirada(BigDecimal importe) {
		super(importe);
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		return "[R" + "-" + fecha + "-" + formato.format(importe) + "]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "R";
	}
}