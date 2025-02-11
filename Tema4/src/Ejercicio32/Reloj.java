package Ejercicio32;

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

	public boolean isFormato24horas() {
		return formato24Horas;
	}

	public void setFormato24horas(boolean formato24horas) {
		this.formato24Horas = formato24horas;
	}

	public void ponerEnHoraA(Integer horas, Integer minutos) {
			this.horas=horas;
			this.minutos=minutos;
			
	}

	public void ponerEmHoraB(Integer horas, Integer minutos, Integer Segundos, Integer segundos) {
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	public boolean check() {
		if(horas>23 || horas<0) {
			return false;
		}
		if(minutos>59 || minutos<0) {
			return false;
		}
		if(segundos>59 || segundos<0) {
			return false;
		}	
			return true;
	}

	
	
}
