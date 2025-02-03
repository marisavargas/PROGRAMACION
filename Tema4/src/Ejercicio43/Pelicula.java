package Ejercicio43;

import java.util.List;

public abstract class Pelicula extends Empleados {
	private Integer anoEstreno;
	private String titulo;
	private List<Actor> actores;
	private Guionistas guionista;
	private Directores direct;
	
	public Integer getAnoEstreno() {
		return anoEstreno;
	}
	public void setAnoEstreno(Integer anoEstreno) {
		this.anoEstreno = anoEstreno;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Actor> getActores() {
		return actores;
	}
	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
	
}
