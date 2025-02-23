package ejercicio52;

import java.math.BigDecimal;

public class Articulo  {
 protected String descripcion;
 protected BigDecimal precio;
 
 
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public BigDecimal getPrecio() {
	return precio;
}
public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}
 
}
