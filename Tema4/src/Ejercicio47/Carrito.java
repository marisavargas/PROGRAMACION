package Ejercicio47;

import java.time.LocalDate;
import java.util.List;

public class Carrito {
	protected LocalDate fecha_Creacion;
	protected LocalDate fecha_Actulizacion;
	private Cliente clienteNuevo;
	private List<Articulo> listaArticulo;
	
	
	public Carrito(Cliente clienteNuevo) {
		super();
		this.clienteNuevo = clienteNuevo;
		  fecha_Creacion= LocalDate.now();
		 fecha_Actulizacion= LocalDate.now();
	}
	
	public  Integer getCantidad( ) {
		Integer cantidad = 0;
		for (int i = 0; i < listaArticulo; i++) {
			cantidad=listaArticulo.get(i).getDescripcion()
		}
		
	}
	


	public LocalDate getFecha_Creacion() {
		return fecha_Creacion;
	}

	public void setFecha_Creacion(LocalDate fecha_Creacion) {
		this.fecha_Creacion = fecha_Creacion;
	}

	public LocalDate getFecha_Actulizacion() {
		return fecha_Actulizacion;
	}

	public void setFecha_Actulizacion(LocalDate fecha_Actulizacion) {
		this.fecha_Actulizacion = fecha_Actulizacion;
	}

	public List<Articulo> getListaArticulo() {
		return listaArticulo;
	}

	public void setListaArticulo(List<Articulo> listaArticulo) {
		this.listaArticulo = listaArticulo;
	}

}
