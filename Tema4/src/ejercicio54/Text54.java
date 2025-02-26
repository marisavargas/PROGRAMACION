
package ejercicio54;

import java.math.BigDecimal;

public class Text54 {

	public static <CuentaDeAhorros> void main(String[] args) {
		 CuentaDeAhorro cuenta = new CuentaDeAhorro("12345678901234567890");
	        System.out.println("Dinero inicial en cuenta: " + cuenta.obtenerTotal() + " €");

	        // 2. Añadir 2 cargos, 2 ingresos y 1 retirada
	        cuenta.añadirMovimiento(new Cargo(new BigDecimal("33.21"), "98765432F"));
	        cuenta.añadirMovimiento(new Cargo( new BigDecimal("20.00"), "12345678X"));
	        cuenta.añadirMovimiento(new Ingreso( new BigDecimal("50.00"), "Pago por servicio"));
	        cuenta.añadirMovimiento(new Ingreso( new BigDecimal("10.00"), "Venta producto"));
	        cuenta.añadirMovimiento(new Retirada( new BigDecimal("15.00")));
	        System.out.println(cuenta.obtenerTotal());
	        System.out.println(cuenta.obtenerMovimientos());
	        System.out.println(cuenta.obtenerIngresos());
	        System.out.println(cuenta.obtenerRetiradas());
	        System.out.println(cuenta.obtenerCargos());
	      
	}

}
