package librerias;

import java.time.LocalDate;

public class LibroDigital extends Libro{

	public LibroDigital(String titulo, String autor, LocalDate fechaEdicion, Integer numeroPagina) {
		super(titulo, autor, fechaEdicion, numeroPagina,0);
	}
	@Override
	public String toString() {
		return super.toString();
	}


}
