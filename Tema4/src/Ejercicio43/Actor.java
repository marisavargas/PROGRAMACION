package Ejercicio43;

public class Actor extends Empleados {

	public Actor(String nombre, Integer fecha_Nacimiento, String nacionalidas) {
		super(nombre, fecha_Nacimiento, nacionalidas);
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

}
