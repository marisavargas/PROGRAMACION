package examenAnimales;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public  abstract class Animal {
protected Integer numeroRegstro;
protected LocalDate fechaNacimiento;
protected BigDecimal peso;
public final static BigDecimal VENTAPOLLO= new BigDecimal(1.5);
public final static BigDecimal VENTACERDO=  new BigDecimal (4.5);
public Animal(Integer numeroRegstro) {
	super();
	this.numeroRegstro = numeroRegstro;
	this.fechaNacimiento=LocalDate.now();
	this.peso=new BigDecimal(0);
}
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public BigDecimal getPeso() {
	return peso;
}
public void setPeso(BigDecimal peso) {
	this.peso = peso;
}
public Integer getNumeroRegstro() {
	return numeroRegstro;
}
public abstract BigDecimal getPesoMinVenta();
	
public abstract BigDecimal getPrecioVentaKg();

public Integer getEdad() {
	Period periodo = fechaNacimiento.until(LocalDate.now());
	Integer edad = periodo.getMonths()+(periodo.getYears()*12);
		return edad;
}
public abstract Boolean sePuedeVender();
@Override
public int hashCode() {
	return Objects.hash(numeroRegstro);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Animal other = (Animal) obj;
	return Objects.equals(numeroRegstro, other.numeroRegstro);
}
	


}
