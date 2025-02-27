package ejercicio54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CuentaDeAhorro {
	private String numeroCuenta;
	private List<Movimiento> movimientos;
	private BigDecimal saldo;

	public CuentaDeAhorro(String numeroCuenta) {
		this.movimientos = new ArrayList<>();
		this.saldo = BigDecimal.ZERO;
		if (numeroCuenta.length() == 20) {
			this.numeroCuenta = numeroCuenta;
		}
	}

	public void añadirMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);

	}

	public BigDecimal obtenerTotal() {
		for (Movimiento movimiento : movimientos) {
			if (movimiento.getTipo().equals("I")) {
				saldo = saldo.add(movimiento.getImporte());
			} else {
				saldo = saldo.subtract(movimiento.getImporte());
			}
		}
		return saldo.setScale(2, RoundingMode.HALF_DOWN);
	}

	public List<String> obtenerMovimientos() {
		List<String> listaMovimientos = new ArrayList<>();
		for (Movimiento m : movimientos) {
			listaMovimientos.add(m.toString());
		}
		return listaMovimientos;
	}

	public void obtenerRetiradas() {
		for (Movimiento m : movimientos) {
			if (m.getTipo().equals("R")) {
				System.out.println(m);
			}
		}

	}

	public void obtenerIngresos() {
		for (Movimiento m : movimientos) {
			if (m.getTipo().equals("I")) {
				System.out.println(m);

			}
		}

	}

	public void obtenerCargos() {

		for (Movimiento m : movimientos) {
			if (m.getTipo().equals("C")) {
				System.out.println(m);
			}
		}

	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
