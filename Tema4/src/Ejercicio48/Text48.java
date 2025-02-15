package Ejercicio48;

public class Text48 {

	public static void main(String[] args) {
		
		// 1
		Ciente cliente = new Ciente();
		cliente.setDni("12345678X");
		cliente.setNombre("Blas de los Montes");
		// 2
		Carrito carrito = new Carrito(cliente);
		System.out.println(carrito);
		// 3
		Ropa poncho = new Ropa();
		poncho.setColor("Azul");
		poncho.setDescripcion("Poncho");
		poncho.setTalla("XL");
		poncho.setPrecio(20.0);
		// 4
		carrito.addArticulo(poncho);
		carrito.addArticulo(poncho);
		System.out.println(carrito);
		// 5
		Libro nietzsche = new Libro();
		nietzsche.setAutor("Nietzsche");
		nietzsche.setDescripcion("As habl Zaratustra");
		nietzsche.setPrecio(15.0);
		// 6
		carrito.addArticulo(nietzsche);
		System.out.println(carrito);
		// 7
		carrito.borrarArticulo(nietzsche);
		System.out.println(carrito);
		// 8
		System.out.println(carrito.getPrecioMedio());
		// 9 
		carrito.vaciarCesta();
		System.out.println(carrito);
		// 10
		System.out.println(carrito.getPrecioMedio());
		
	}

	}


