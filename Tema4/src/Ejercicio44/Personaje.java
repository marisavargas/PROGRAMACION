package Ejercicio44;

public  abstract class Personaje {
protected String nombre;
protected String codigo;
protected Integer vida;
protected Integer daño;
protected Integer segundo;
 
public Personaje(String nombre, String codigo) {
	super();
	this.nombre = nombre;
	this.codigo = codigo;
}
public Integer getVida() {
	return vida;
}
public Integer getDaño() {
	return daño;
}
public Integer getSegundo() {
	return segundo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
@Override
public String toString() {
	return "Personaje [nombre=" + nombre + ", codigo=" + codigo + ", vida=" + vida + ", daño=" + daño + ", segundo="
			+ segundo + "]";
}


}
