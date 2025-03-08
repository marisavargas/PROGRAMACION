package librerias;

import java.time.LocalDate;

public  abstract class Libro {
protected String titulo;
protected String autor;
protected LocalDate fechaEdicion;
protected Integer numeroPagina;
protected Integer peso;
public Libro(String titulo, String autor, LocalDate fechaEdicion, Integer numeroPagina, Integer peso) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.fechaEdicion = fechaEdicion;
	this.numeroPagina = numeroPagina;
	this.peso=peso;
}

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public LocalDate getFechaEdicion() {
	return fechaEdicion;
}
public void setFechaEdicion(LocalDate fechaEdicion) {
	this.fechaEdicion = fechaEdicion;
}
public Integer getNumeroPagina() {
	return numeroPagina;
}
public void setNumeroPagina(Integer numeroPagina) {
	this.numeroPagina = numeroPagina;
}
public Integer getPeso() {
	return peso;
}
public void setPeso(Integer peso) {
	this.peso = peso;
}
public String toString() {
	return "titulo=" + titulo + ", autor=" + autor + ", fechaEdicion=" + fechaEdicion + ", paginas="
			+ numeroPagina;
}	



}
