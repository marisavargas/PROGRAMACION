package librerias;

import java.time.LocalDate;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Libreria sanPablo = new Libreria();
sanPablo.setDireccion("\"Avd. de los sueños perdidos,89\"");
sanPablo.setTelefono(954696954);

LIbroFisico lf1= new LIbroFisico("Cuentos Eva Luna","Isabel Allende",LocalDate.of(1997,8,7),120,119,90,25);
LIbroFisico lf2= new LIbroFisico("Cuentos para no dormir","edgan Alan Poe",LocalDate.of(1906,1,6),250,120,90,120);
LibroDigital ld1 = new LibroDigital("sobra y lune", "Mayte Martin",LocalDate.of(1998,5,5),90);
LibroDigital ld2= new LibroDigital("la sombra del viento","Carlos Ruiz Zafon",LocalDate.of(2007,10,5),420);
sanPablo.getLibros().add(ld1);
sanPablo.getLibros().add(ld2);
sanPablo.getLibros().add(lf1);
sanPablo.getLibros().add(lf2);
System.out.println(sanPablo.obtenerNumPaginasMedio());
System.out.println(sanPablo.obtenerPesoTotal());
System.out.println(sanPablo.obtenerLibroMasAntiguo());
	}

}
