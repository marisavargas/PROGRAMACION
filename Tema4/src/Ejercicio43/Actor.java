package Ejercicio43;

import java.util.List;

public  class Actor extends Empleados {
private List <Actor> actores;
	public Actor() {
				
		
	}
	@Override
	public String toString() {
		return "Actor [getNombre()=" + getNombre() + ", getFecha_Nacimiento()=" + getFecha_Nacimiento()
				+ ", getNacionalidas()=" + getNacionalidas() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
@Override
	public Integer getSueldo() {
		return SUELDOACTOR;
		
	}
	public List <Actor> getActores() {
		return actores;
	}
	public void setActores(List <Actor> actores) {
		this.actores = actores;
	}
	


}
