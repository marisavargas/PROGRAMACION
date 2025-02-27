package ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ingreso extends Movimiento {
	private String descripcion;

	public Ingreso(BigDecimal importe, String descripcion) {
		super(importe);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		return "[I" + "-" + fecha + "-" + formato.format(importe) + "-" + descripcion + "]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "I";
	}
}
