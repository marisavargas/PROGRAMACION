package hospital;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public  abstract class Cita {
protected String paciente;
protected LocalDate fechaCita;
protected Integer hora;
protected Boolean seguro;
protected Boolean facturada;
public Cita(String paciente, LocalDate fechaCita, Integer hora, Boolean seguro) {
	super();
	this.paciente = paciente;
	this.fechaCita = fechaCita;
	this.hora = hora;
	this.seguro = seguro;
	this.facturada = false;
}
public String getPaciente() {
	return paciente;
}
public void setPaciente(String paciente) {
	this.paciente = paciente;
}
public LocalDate getFechaCita() {
	return fechaCita;
}
public void setFechaCita(LocalDate fechaCita) {
	this.fechaCita = fechaCita;
}
public Integer getHora() {
	return hora;
}
public void setHora(Integer hora) {
	this.hora = hora;
}
public Boolean getSeguro() {
	return seguro;
}
public void setSeguro(Boolean seguro) {
	this.seguro = seguro;
}
public Boolean getFacturada() {
	return facturada;
}
public void setFacturada(Boolean facturada) {
	this.facturada = facturada;
}
public abstract BigDecimal getImporteFactura(); 
	
public Integer getDiasHastaCita() {
	
	if(fechaCita.isAfter(LocalDate.now())){
Period periodo= fechaCita.until(LocalDate.now());
Integer cantidadDias= periodo.getDays();
return cantidadDias;

}	else {
	System.out.println("tu cita ya a pasado");
	return -1;
}
}
@Override
public String toString() {
	DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String fecha= fechaCita.format(formato);
		if(seguro=true) {
			return   paciente + "-"+fecha +" - "  + hora +": hora"+ "-" +"con seguro"  ;
		}else {
			return   paciente + "-"+fecha +" - "  + hora +": hora"+ "-" +"sin seguro"  ;
	}
	
}
@Override
public int hashCode() {
	return Objects.hash(fechaCita, hora);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cita other = (Cita) obj;
	return Objects.equals(fechaCita, other.fechaCita) && Objects.equals(hora, other.hora);
}


}