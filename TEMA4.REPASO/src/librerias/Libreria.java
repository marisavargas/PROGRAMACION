package librerias;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
 private List <Libro> libros ;
 private String direccion;
 private Integer telefono;
 
 public Libreria(String direccion, Integer telefono) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
		this.libros=new ArrayList<>();
	}
 public Libreria() {
	 	this.libros=new ArrayList<>();
 }
 
 public List<Libro> getLibros() {
	return libros;
}


public void setLibros(List<Libro> libros) {
	this.libros = libros;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public Integer getTelefono() {
	return telefono;
}


public void setTelefono(Integer telefono) {
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
 public Libro obtenerLibroMasAntiguo() {
		
		if(libros!=null &&  !this.libros.isEmpty()) {
			
			Libro old = this.libros.get(0);
			for (Libro libro : this.libros) {
				
				if(libro.getFechaEdicion().isBefore(old.getFechaEdicion())) {
					old= libro; 
				}
			}
			return old;
		}
		return null;		
	}

		
	}
	 
 


