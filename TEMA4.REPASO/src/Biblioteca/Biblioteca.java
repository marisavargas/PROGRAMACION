package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
List<Publicacion>publicaciones;


public Biblioteca() {
	super();
	this.publicaciones = new ArrayList<>();
}

public List<Publicacion> getPublicaciones() {
	return publicaciones;
}

public void setPublicaciones(List<Publicacion> publicaciones) {
	this.publicaciones = publicaciones;
}

}
