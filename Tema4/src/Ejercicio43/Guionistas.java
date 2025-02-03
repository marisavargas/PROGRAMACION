package Ejercicio43;

public class Guionistas extends Empleados {

	@Override
	public String toString() {
		return "Guionistas [getSueldo()=" + getSueldo() + ", getNombre()=" + getNombre() + ", getFecha_Nacimiento()="
				+ getFecha_Nacimiento() + ", getNacionalidas()=" + getNacionalidas() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public Integer getSueldo() {
		return SUELDOGUION;
	}
}
