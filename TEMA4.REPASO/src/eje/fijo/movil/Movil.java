package eje.fijo.movil;

public class Movil extends Telefono {
 localizacionGps gps;

public Movil(Integer numero, localizacionGps gps) {
	super(numero);
	this.gps = gps;
	
}
 
	
}
