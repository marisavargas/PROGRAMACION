package Biblioteca;

import java.time.LocalDate;

public class Cd extends Publicacion{
Boolean prestadoCd;
Boolean consultadoCd;
public Cd(Integer codigo, String autor, String titulo, LocalDate anoPublicacion, Boolean prestadoCd,
		Boolean consultadoCd) {
	super(codigo, autor, titulo, anoPublicacion);
	this.prestadoCd = false;
	this.consultadoCd = false;
}
@Override
public String toString() {
	return "Cd [prestadoCd=" + prestadoCd + ", consultadoCd=" + consultadoCd + "]";
}

}
