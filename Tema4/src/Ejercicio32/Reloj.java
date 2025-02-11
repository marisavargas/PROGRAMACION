package Ejercicio32;

import java.util.Objects;

public class Reloj {
	public Integer horas;
	public Integer minutos;
	public Integer segundos;
	public boolean formato24Horas;

	public Reloj() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
		this.formato24Horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24Horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setFormato24horas(boolean formato24horas) {
		this.formato24Horas = formato24horas;
	}

	public void ponerEnHoraA(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;

	}

	public void ponerEmHoraB(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public boolean check() {
		if (horas > 23 || horas < 0) {
			return false;
		}
		if (minutos > 59 || minutos < 0) {
			return false;
		}
		if (segundos > 59 || segundos < 0) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		if  (check ()) {
			if( formato24Horas== false && horas>=13) {
				return (horas-12) + ":" + minutos +":" + segundos +"AM";
				
			}else {
				return (horas) + ":" + minutos +":" + segundos +"PM";
			}
			
		}return "hora incorrecta";
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}
	

}
