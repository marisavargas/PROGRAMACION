package Biblioteca;

import java.time.LocalDate;

public class libro extends publicacion {
Boolean prestadoLibro;
Boolean consultadoLibro;
public libro(Integer codigo, String autor, String titulo, LocalDate anoPublicacion, Boolean prestadoLibro,
		Boolean consultadoLibro) {
	super(codigo, autor, titulo, anoPublicacion);
	this.prestadoLibro = false;
	this.consultadoLibro = false;
}

}
