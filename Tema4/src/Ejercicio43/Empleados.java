package Ejercicio43;

public abstract class Empleados {
	public static final  Integer SUELDOACTOR= 100000;
	public static final Integer SUELDOGUION = 50000;
	public static final Integer SUELDODIREC = 200000;

	protected String nombre;
	protected Integer fecha_Nacimiento;
	protected String nacionalidas;
	public Empleados() {
		
	}
	
	public Empleados(String nombre, Integer fecha_Nacimiento, String nacionalidas) {
		super();
		this.nombre = nombre;
		this.fecha_Nacimiento = fecha_Nacimiento;
		this.nacionalidas = nacionalidas;
	}

	public abstract  Integer getSueldo();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(Integer fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getNacionalidas() {
		return nacionalidas;
	}

	public void setNacionalidas(String nacionalidas) {
		this.nacionalidas = nacionalidas;
	}

}
