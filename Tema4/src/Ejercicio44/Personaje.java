package Ejercicio44;

public  abstract class Personaje {
protected String nombre;
protected Integer codigo;
protected abstract final getVidas

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getCodigo() {
	return codigo;
}
public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}
@Override
public String toString() {
	return "Personaje [nombre=" + nombre + ", codigo=" + codigo + "]";
}

}
