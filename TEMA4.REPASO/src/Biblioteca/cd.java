package Biblioteca;

import java.time.LocalDate;

public class cd extends publicacion{
Boolean prestadoCd;
Boolean consultadoCd;
public cd(Integer codigo, String autor, String titulo, LocalDate anoPublicacion, Boolean prestadoCd,
		Boolean consultadoCd) {
	super(codigo, autor, titulo, anoPublicacion);
	this.prestadoCd = false;
	this.consultadoCd = false;
}

}
