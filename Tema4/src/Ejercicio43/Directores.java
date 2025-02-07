package Ejercicio43;

public class Directores extends Empleados {
 
	
	public Directores(String nombre, Integer fecha_Nacimiento, String nacionalidas) {
		super(nombre, fecha_Nacimiento, nacionalidas);
		// TODO Auto-generated constructor stub
	}
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
