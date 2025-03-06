package librerias;

import java.util.List;

public class Libreria {
 private List <Libro> libros ;
 private String direccion;
 private Integer telefono;
 
 public Libreria(String direccion, Integer telefono) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
	}
 
 public Integer obtenerPesoTotal() {
	 Integer sumaPeso=0;
	 for (Libro libro : libros) {
		sumaPeso=sumaPeso + libro.getPeso();
	
	}return sumaPeso;
 }
 public Integer obtenerNumPaginasMedio() {
	Integer total=0;
	 if( this.libros.isEmpty())
		 return 0;
	 
	 for (Libro libro : libros) {
		total+=libro.getNumeroPagina();
		
		
	}return total/ this.libros.size();
 }
 public String obtenerLibroMasAntiguo() {
	 Libro fechaMasAntigua = libros.get(0);
	 for (Libro libro : libros) {
		 
		 if(libro.fechaEdicion.isBefore(fechaMasAntigua.getFechaEdicion())) {
			  return libro.getAutor();
			
		 }
	
		
	}
		
	}
	 }
 


