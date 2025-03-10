package ejercicio7;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Curso {

private String nombre;
private LocalDate fechaInicio;
private LocalDate fechaFin;
private BigDecimal precio;
private Integer numPlazasOcu;
private Integer numPlazasTotal;
public Curso(String nombre, BigDecimal precio, Integer numPlazasTotal) {
	super();
	this.nombre = nombre;
	this.precio = precio;
	this.numPlazasOcu = 0;
	this.numPlazasTotal = numPlazasTotal;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public LocalDate getFechaFin() {
	return fechaFin;
}
public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}
public BigDecimal getPrecio() {
	return precio;
}
public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}
public Integer getNumPlazasOcu() {
	return numPlazasOcu;
}
public void setNumPlazasOcu(Integer numPlazasOcu) {
	this.numPlazasOcu = numPlazasOcu;
}
public Integer getNumPlazasTotal() {
	return numPlazasTotal;
}
public void setNumPlazasTotal(Integer numPlazasTotal) {
	this.numPlazasTotal = numPlazasTotal;
}
public Integer getDuracionCurso() {
	Period periodo= fechaInicio.until(fechaFin);
	Integer duracion = periodo.getMonths();
	return duracion;
}
public Boolean isPlazasLibres() {
	Integer plazasLibre=numPlazasTotal-numPlazasOcu;
		
	if(plazasLibre>0) {
		return true;
	}else {
		return false;
	}
}
public BigDecimal getPrecioCurso() {
	BigDecimal duracionCurso= new BigDecimal(getDuracionCurso());
	BigDecimal precioMes=precio.divide(duracionCurso);
	return precioMes;
}



}
