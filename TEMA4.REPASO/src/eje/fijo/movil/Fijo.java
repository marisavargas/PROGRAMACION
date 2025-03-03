package eje.fijo.movil;

public class Fijo extends Telefono {
private String direccion;

public Fijo(Integer numero, String direccion) {
	this.numero=numero;
	this.direccion = direccion;
	this.enLlamada= false;
	}
}








