package Biblioteca;

import java.time.LocalDate;

public class Revista extends Publicacion{
	Boolean consultarRevista;
		
	public Revista(Integer codigo, String autor, String titulo, LocalDate anoPublicacion) {
		super(codigo, autor, titulo, anoPublicacion);
		// TODO Auto-generated constructor stub
		consultarRevista=false;
	}
		
	public Boolean getConsultarRevista() {
		return consultarRevista;
	}

	public void setConsultarRevista(Boolean consultarRevista) {
		this.consultarRevista = consultarRevista;
	}

	@Override
	public String toString() {
		return "Revista [consultarRevista=" + consultarRevista + "]";
	}
	

}
