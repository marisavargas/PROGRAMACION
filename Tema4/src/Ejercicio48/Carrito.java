package Ejercicio48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Carrito {

	protected LocalDate fecha_Creacion;
	protected LocalDate fecha_Actulizacion;
	private Ciente clienteNuevo;
	private Set<Articulo> listaArticulo;

	public Carrito(Ciente clienteNuevo) {
		this.clienteNuevo = clienteNuevo;
		fecha_Creacion = LocalDate.now();
		fecha_Actulizacion = LocalDate.now();
		listaArticulo = new HashSet<>();
	}

	public Integer getCantidad() {

		return listaArticulo.size();
	}

	public Double precioTotal() {
		Double precioTotal = 0.0;
		for (Articulo articulo : listaArticulo) {
			precioTotal += articulo.getPrecio();
		}
		return precioTotal;

	}

	public Double getPrecioMedio() {
		if (getCantidad() == 0) {

		}
		return 0.0;
	}

	public Ciente getClienteNuevo() {
		return clienteNuevo;
	}

	public void setClienteNuevo(Ciente clienteNuevo) {
		this.clienteNuevo = clienteNuevo;
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

	public Set<Articulo> getListaArticulo() {
		return listaArticulo;
	}

	public void setListaArticulo(Set<Articulo> listaArticulo) {
		this.listaArticulo = listaArticulo;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Cliente: " + clienteNuevo.getDni() + " / " + clienteNuevo.getNombre() + " Artculos: " + getCantidad()
				+ " / " + precioTotal() + " euros" + " Fecha ltima actualizacin :" + fecha_Creacion.format(formato);
	}

	public void addArticulo(Articulo arti) {
		listaArticulo.add(arti);
		fecha_Creacion = LocalDate.now();
	}

	public void borrarArticulo(String nombre) {

		// hay que comprobar si la posicion es correcta:

		if (!listaArticulo.isEmpty()) // < getCantidad()
		{
			listaArticulo.remove(nombre);
			fecha_Creacion = LocalDate.now();
		}
	}

	public void vaciarCesta() {
		listaArticulo.clear();
		fecha_Creacion = LocalDate.now();
	}

}
