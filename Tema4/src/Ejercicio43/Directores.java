package Ejercicio43;

public class Directores extends Empleados {

	@Override
	public String toString() {
		return "Directores [getNombre()=" + getNombre() + ", getFecha_Nacimiento()=" + getFecha_Nacimiento()
				+ ", getNacionalidas()=" + getNacionalidas() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public Integer getSueldo() {
		return SUELDODIREC;
	}
}
