package Ejercicio18;
/*ejercicio22*/
public class Curso {
	private String identificador;
	private String descripcion;
	private Alumno [] alumnos; /* ejercicio 30*/
	
	public Curso () {
		
	}
	
	public Curso(Alumno[] alumnos) {  /* ejercicio 30*/
		super();
		this.alumnos = alumnos;
	}
	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void addAlumnos( Alumno alum) {  /*ejercicio 30*/
		
		for (int i = 0; i < alumnos.length; i++) {
			if( alumnos[i] == null) {
				alumnos[i]=alum;
			}
		}
	}
}
