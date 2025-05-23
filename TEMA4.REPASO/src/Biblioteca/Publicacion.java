package Biblioteca;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Publicacion {
	protected Integer codigo;
	protected String autor;
	protected String titulo;
	protected LocalDate anoPublicacion;
	
	
	public Publicacion(Integer codigo, String autor, String titulo, LocalDate anoPublicacion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getAnoPublicacion() {
		return anoPublicacion;
	}
	public void setAnoPublicacion(LocalDate anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", anoPublicacion="
				+ anoPublicacion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(codigo, other.codigo);
	}
	

}
