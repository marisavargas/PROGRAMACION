package ejercicio54;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Cargo extends Movimiento {
	private String cifEmpresa;

	public Cargo(BigDecimal importe, String cifEmpresa) {
		super(importe);
		this.cifEmpresa = cifEmpresa;
	}

	public String getCifEmpresa() {
		return cifEmpresa;
	}

	public void setCifEmpresa(String cifEmpresa) {
		this.cifEmpresa = cifEmpresa;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		return "[C" + "-" + fecha + "-" + formato.format(importe) + "-" + cifEmpresa + "]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "C";
	}
}
