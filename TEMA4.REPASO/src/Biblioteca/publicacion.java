package Biblioteca;

import java.time.LocalDate;

public abstract class publicacion {
	protected Integer codigo;
	protected String autor;
	protected String titulo;
	protected LocalDate anoPublicacion;
	
	
	public publicacion(Integer codigo, String autor, String titulo, LocalDate anoPublicacion) {
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
	

}
