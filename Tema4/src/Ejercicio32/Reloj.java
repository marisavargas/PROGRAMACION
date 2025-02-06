package Ejercicio32;

public class Reloj {
	public Integer horas;
	public Integer minutos;
	public Integer segundos;
	public boolean formato24Horas;

	public Reloj() {
		horas = 00;
		minutos = 00;
		segundos = 00;
		formato24Horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos, boolean formato24horas) {
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

	public boolean isFormato24horas() {
		return formato24Horas;
	}

	public void setFormato24horas(boolean formato24horas) {
		this.formato24Horas = formato24horas;
	}

	public void ponerEnHoraA(Integer horas, Integer minutos) {

	}

	public void ponerEmHoraB(Integer horas, Integer minutos, Integer Segundos) {

	}
	public boolean check(Integer horas,Integer minutos, Integer segundos) {
		if(hora>0 )
	}
}
