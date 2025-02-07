package Ejercicio43;

public class Guionistas extends Empleados {

	
	public Guionistas(String nombre, Integer fecha_Nacimiento, String nacionalidas) {
		super(nombre, fecha_Nacimiento, nacionalidas);
		// TODO Auto-generated constructor stub
	}
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
