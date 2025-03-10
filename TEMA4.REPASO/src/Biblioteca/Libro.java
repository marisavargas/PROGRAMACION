package Biblioteca;

import java.time.LocalDate;

public class Libro extends Publicacion {
Boolean prestadoLibro;
Boolean consultadoLibro;
public Libro(Integer codigo, String autor, String titulo, LocalDate anoPublicacion, Boolean prestadoLibro,
		Boolean consultadoLibro) {
	super(codigo, autor, titulo, anoPublicacion);
	this.prestadoLibro = false;
	this.consultadoLibro = false;
}
@Override
public String toString() {
	return "Libro [prestadoLibro=" + prestadoLibro + ", consultadoLibro=" + consultadoLibro + "]";
}

}
