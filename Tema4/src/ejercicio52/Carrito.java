package ejercicio52;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	protected LocalDate fecha_Creacion;
	protected LocalDate fecha_Actulizacion;
	private Cliente clienteNuevo;
	private List<Articulo> listaArticulo;

	public Carrito(Cliente clienteNuevo) {
		this.clienteNuevo = clienteNuevo;
		fecha_Creacion = LocalDate.now();
		fecha_Actulizacion = LocalDate.now();
		listaArticulo = new ArrayList<>();
	}

	public Integer getCantidad() {

		return listaArticulo.size();
	}

	public BigDecimal precioTotal() {
		BigDecimal precioTotal = BigDecimal.ZERO;
		for (int i = 0; i < listaArticulo.size(); i++) {
			precioTotal = listaArticulo.get(i).getPrecio().add(precioTotal);

		}
		return precioTotal;
	}

	public BigDecimal getPrecioMedio() {
		if (getCantidad() == 0) {
			return BigDecimal.ZERO;
		}
		BigDecimal cantidad = new BigDecimal(getCantidad());
		return precioTotal().divide(new BigDecimal(getCantidad()), 2, RoundingMode.HALF_UP);

	}

	public Cliente getClienteNuevo() {
		return clienteNuevo;
	}

	public void setClienteNuevo(Cliente clienteNuevo) {
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

	public List<Articulo> getListaArticulo() {
		return listaArticulo;
	}

	public void setListaArticulo(List<Articulo> listaArticulo) {
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

	public void borrarArticulo(int posicion) {

		if (posicion >= 0 && posicion < this.listaArticulo.size())
			listaArticulo.remove(posicion);
		fecha_Creacion = LocalDate.now();
	}

	public void vaciarCesta() {
		listaArticulo.clear();
		fecha_Creacion = LocalDate.now();
	}

}
