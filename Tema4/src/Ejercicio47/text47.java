package Ejercicio47;

public class text47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
				Cliente cliente = new Cliente();
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
				carrito.borrarArticulo(1);
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


