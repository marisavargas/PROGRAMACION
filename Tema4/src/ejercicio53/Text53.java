package ejercicio53;

import java.math.BigDecimal;

public class Text53 {

	public static void main(String[] args) {
		Hucha hucha = new Hucha();
		System.out.println(hucha);
		hucha.meterDinero(new BigDecimal (100));
		System.out.println(hucha);
		hucha.meterDinero(new BigDecimal (50.501));
		System.out.println(hucha);
		hucha.sacarDinero(new BigDecimal (20.05));
		System.out.println(hucha);
		hucha.sacarDinero(new BigDecimal(200));
		System.out.println(hucha);
		hucha.meterDinero(new BigDecimal(200));
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
	}	
}
