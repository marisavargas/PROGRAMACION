package ejercicio7;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Academia {
	private String ciudad;
	private String telefono;
	private List<Curso> cursos;

	public Academia() {
		super();
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Curso> getCursoDisponible() {
		List<Curso> cursosDisponible = new ArrayList<>();
		for (Curso curso : cursos) {
			if (curso.isPlazasLibres() == true && curso.getFechaFin().isAfter(LocalDate.now())) {
				cursosDisponible.add(curso);
			}
		}return cursosDisponible;
	}
	public BigDecimal getPrecioMedio() {
		BigDecimal precioMedio= new BigDecimal(0);
		for (Curso curso : cursos) {
			precioMedio=curso.getPrecio().add(precioMedio);
			
		}return precioMedio.divide(new BigDecimal(cursos.size()));
		
	}
	public void borrarCursosPasados() {
		
		 for (Curso curso : cursos) {
			if ( curso.getFechaFin().isBefore(LocalDate.now())) {
				cursos.remove(curso);
		}
	}
	}
}