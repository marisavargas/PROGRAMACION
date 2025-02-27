package eje.telefono;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
private String marca;
private String modelo;
private String imei;
private BigDecimal precio;
private LocalDate fechaFabricacion;
private Boolean activo;
public Smartphone() {
	super();
	this.precio= precio.ZERO;
	this.activo=true;
}
public Smartphone(String imei) {
	super();
	this.imei = imei;
	this.precio= precio.ZERO;
	this.activo=true;
}
public Smartphone(String marca, String modelo, String imei) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.imei = imei;
	this.precio= precio.ZERO;
	this.activo=true;
}
public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}
public void activar() {
	this.activo= true;
}
public void desactivar() {
	this.activo= false;
}
public Integer getEdad() {
	LocalDate año= LocalDate.of(1,4 ,2000);
	Period periodo =fechaFabricacion.until(año);
	return periodo.getYears();
}
public  void cambiarMarcaModelo(String marca,String modelo) {
	this.marca=marca;
	this.modelo=modelo;
}
public void establecerFabricacion(LocalDate fechaFabricacion) {
	this.fechaFabricacion= fechaFabricacion;
}
public BigDecimal getPrecioMasIva() {
	BigDecimal iva= precio.multiply(new BigDecimal (0.21));
	BigDecimal precioMasIva = precio.add(iva);
	return precioMasIva;
}
public Boolean isAltaGama(BigDecimal precioBase) {
	if(precio.compareTo(precioBase)==1) {
		return true;
	}
	else {
		return false;
	}
}
public Boolean isDatoCompleto() {
	if( imei.isEmpty()|| imei.isBlank() || precio==null) {
		return false;
	
	}else {
		return true;
		
	}
	
}
public Boolean esGratir() {
	if(precio.equals(BigDecimal.ZERO) ) {
		return true;
	}else {
		return false;
	}
}
public void rebaja() {
	precio=precio.subtract(new BigDecimal(10));
}
@Override
public String toString() {
	if(activo=false) {
		return  marca + "(" + modelo + ")"+ "-inactivo"; 
	}
		return marca + "(" + modelo + ")"; 
}

}