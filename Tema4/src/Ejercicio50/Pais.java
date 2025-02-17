package Ejercicio50;

import java.util.Objects;

public class Pais {
	
public String descripcion;
public String codigo;
public Pais (String codigo,String descripcion) {
	this.descripcion= descripcion;
	this.codigo=codigo;

}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
@Override
public String toString() {
	return "Pais [descripcion=" + descripcion + ", codigo=" + codigo + "]";
}
@Override
public int hashCode() {
	return Objects.hash(codigo.toUpperCase());
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pais other = (Pais) obj;
	return Objects.equals(codigo.toUpperCase(), other.codigo.toUpperCase());
}

	
}





