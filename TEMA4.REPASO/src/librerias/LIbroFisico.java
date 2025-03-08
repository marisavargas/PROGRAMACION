package librerias;

import java.time.LocalDate;

public class LIbroFisico extends Libro{
private Integer ancho;
private Integer alto;

public LIbroFisico(String titulo, String autor, LocalDate fechaEdicion, Integer numeroPagina, Integer ancho,
		Integer alto, Integer peso) {
	super(titulo, autor, fechaEdicion, numeroPagina,peso);
	this.ancho = ancho;
	this.alto = alto;
	
}
public Integer getAncho() {
	return ancho;
}
public void setAncho(Integer ancho) {
	this.ancho = ancho;
}
public Integer getAlto() {
	return alto;
}
public void setAlto(Integer alto) {
	this.alto = alto;
}
@Override
public String toString() {
	return super.toString() + " - ancho: " + this.ancho + " - alto: "+ this.alto + " - peso: " + this.peso;
}



}
