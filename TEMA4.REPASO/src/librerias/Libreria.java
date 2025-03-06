package librerias;

import java.util.List;

public class Libreria {
 private List <Libro> libros ;
 private String direccion;
 private Integer telefono;

 
 public Integer obtenerPesoTotal() {
	 Integer sumaPeso=0;
	 for (Libro libro : libros) {
		sumaPeso=sumaPeso + libro.getPeso();
	
	}return sumaPeso;
 }
 
 
}
