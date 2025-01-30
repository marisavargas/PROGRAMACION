package Ejercicio18;

import java.util.List;

public class Text36 {
	private String identificador;
	private String descripcion;
	List < Alumno> alumnos; /* ejercicio 35*/
	
	public Text36() {
		
	}
	
	public Text36(List<Alumno>alumnos) {  /* ejercicio 35*/
		super();
		this.alumnos = alumnos;
	}
	
	public List <Alumno> getAlumnos() {
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
	
	public void addAlumnos( Alumno alum) {  /*ejercicio 35*/
		
		for (int i = 0; i < alumnos.size(); i++) {
			if( alumnos.get(i) == null) {
				alumnos.add(alum);
			}
		}
	}
}
