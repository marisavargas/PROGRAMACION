package Ejercicio43;

public abstract class Empleados {
	public static final  Integer SUELDOACTOR= 100000;
	public static final Integer SUELDOGUION = 50000;
	public static final Integer SUELDODIREC = 200000;

	private String nombre;
	private String fecha_Nacimiento;
	private String nacionalidas;
	public abstract  Integer getSueldo();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getNacionalidas() {
		return nacionalidas;
	}

	public void setNacionalidas(String nacionalidas) {
		this.nacionalidas = nacionalidas;
	}

}
