package eje.fijo.movil;

import java.math.BigDecimal;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
localizacionGps gps= new localizacionGps (new BigDecimal(80), new BigDecimal(40));
Movil movil= new Movil(654654654, gps);
Fijo fijo = new Fijo( 954954954, "calle ancha numero 2-Sevilla");
movil.consultarNumero();
System.out.println(movil.numero);
fijo.consultarNumero();
System.out.println(fijo.numero);
movil.marcar(654654654);
fijo.marcar(610610610);
movil.colgar();
movil.colgar();
}

}
