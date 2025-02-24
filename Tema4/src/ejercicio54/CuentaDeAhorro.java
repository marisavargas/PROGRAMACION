package ejercicio54;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CuentaDeAhorro {
	private String numeroCuenta;
	private List<Movimiento> movimientos;
	private BigDecimal saldo;

	public void CuentaAhorros(String numeroCuenta) {
	        this.numeroCuenta = numeroCuenta;
	        this.movimientos = new ArrayList<>();
	        this.saldo = BigDecimal.ZERO;

	public void añadirMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);
		
		if (movimiento instanceof Cargo) {
			saldo = saldo.subtract(movimiento.getImporte());
		} else if (movimiento instanceof Ingreso) {
			saldo = saldo.add(movimiento.getImporte());
		} else if (movimiento instanceof Retirada) {
			saldo = saldo.subtract(movimiento.getImporte());
		}
	}
	  public BigDecimal obtenerTotal() {
	        return saldo;
	    }
	  public List<String> obtenerMovimientos() {
	        List<String> listaMovimientos = new ArrayList<>();
	        for (Movimiento m : movimientos) {
	            listaMovimientos.add(m.toString());
	        }
	        return listaMovimientos;
	    }
	  public List<String> obtenerRetiradas() {
	        List<String> listaRetiradas = new ArrayList<>();
	        for (Movimiento m : movimientos) {
	            if (m instanceof Retirada) {
	                listaRetiradas.add(m.toString());
	            }
	        }
	        return listaRetiradas;
	    }
	  public List<String> obtenerIngresos() {
	        List<String> listaIngresos = new ArrayList<>();
	        for (Movimiento m : movimientos) {
	            if (m instanceof Ingreso) {
	                listaIngresos.add(m.toString());
	            }
	        }
	        return listaIngresos;
	    }
	  public List<String> obtenerCargos() {
	        List<String> listaCargos = new ArrayList<>();
	        for (Movimiento m : movimientos) {
	            if (m instanceof Cargo) {
	                listaCargos.add(m.toString());
	            }
	        }
	        return listaCargos;
	    }
	  
}
