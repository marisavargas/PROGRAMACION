package Ejercicio43;

import java.util.ArrayList;
import java.util.List;

public  class Pelicula extends Empleados {
	private Integer anoEstreno;
	private String titulo;
	private List<Actor> actores;
	private Guionistas guionista;
	private Directores direct;
	
	public Pelicula(Integer anoEstreno, String titulo, Guionistas guionista, Directores direct) {
		super();
		this.anoEstreno = anoEstreno;
		this.titulo = titulo;
		this.guionista = guionista;
		this.direct = direct;
		actores = new ArrayList<>();
	}
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
	@Override
	public Integer getSueldo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
