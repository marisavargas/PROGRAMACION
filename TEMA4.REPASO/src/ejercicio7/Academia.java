package ejercicio7;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
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
		Iterator<Curso> iterator = cursos.iterator();
		while( iterator.hasNext()) {
			Curso curso= iterator.next();
			if ( curso.getFechaFin().isBefore(LocalDate.now())) {
				iterator.remove();
		}
		}
			
		
	}
	public Curso getCursoMasBarato() {
		Curso cursoBarato = cursos.get(0);
	for (int i = 0; i < cursos.size(); i++) {
		if(!(i+1>cursos.size())) {
				if(cursoBarato.getPrecio().compareTo(cursos.get(i + 1 ).getPrecio())<0 && 
				cursos.get(i).getFechaFin().isAfter(LocalDate.now())) {
					cursoBarato= cursos.get(i);
			}
		}
	}return cursoBarato;
	}
	public Integer getTotalPlazasLibres() {
		Integer plazasLibres=0;
		for (Curso curso : cursos) {
			 if(curso.isPlazasLibres()) {
				 plazasLibres+= curso.getNumPlazasTotal()-curso.getNumPlazasOcu();	
		}
		} return plazasLibres;
	}
	
	}
