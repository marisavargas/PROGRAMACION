package ejercicio54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Text54 {

	public static <CuentaDeAhorros> void main(String[] args) {
		 CuentaDeAhorros cuenta = new CuentaDeAhorros("12345678901234567890");
	        System.out.println("Dinero inicial en cuenta: " + cuenta.obtenerTotal() + " €");

	        // 2. Añadir 2 cargos, 2 ingresos y 1 retirada
	        cuenta.añadirMovimiento(new Cargo(LocalDate.of(2022, 2, 18), new BigDecimal("33.21"), "98765432F"));
	        cuenta.añadirMovimiento(new Cargo(LocalDate.of(2022, 2, 19), new BigDecimal("20.00"), "12345678X"));
	        cuenta.añadirMovimiento(new Ingreso(LocalDate.of(2022, 2, 18), new BigDecimal("50.00"), "Pago por servicio"));
	        cuenta.añadirMovimiento(new Ingreso(LocalDate.of(2022, 2, 19), new BigDecimal("10.00"), "Venta producto"));
	        cuenta.añadirMovimiento(new Retirada(LocalDate.of(2022, 2, 20), new BigDecimal("15.00")));
	}

}
