package examenaPlantas;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Texplantas {

	public static void main(String[] args) {
		Plantacion plant1 = new Plantacion("98765432X");
		System.out.println(plant1);

		ArbolPino pino10 = new ArbolPino(10);
		System.out.println(pino10);
		ArbolPino pino11 = new ArbolPino(11);
		System.out.println(pino11);
		ArbolPino pino12 = new ArbolPino(12);
		System.out.println(pino12);

		ArbolFrutal frutal20 = new ArbolFrutal(20);
		frutal20.setEspecie("Naranjo");
		ArbolFrutal frutal21 = new ArbolFrutal(21);
		frutal21.setEspecie("Limonero");

		frutal20.setAltura(new BigDecimal(181.4));
		LocalDate fecha1 = LocalDate.of(2021, 1, 15);
		frutal20.setFechaPlantacion(fecha1);
		frutal21.setAltura(new BigDecimal(84));
		LocalDate fechaPino = frutal20.getFechaPlantacion().plusMonths(3);
		pino10.setFechaPlantacion(fechaPino);
		pino11.setFechaPlantacion(fechaPino);
		pino12.setFechaPlantacion(fechaPino);
		pino10.setAltura(new BigDecimal(80));
		pino11.setAltura(new BigDecimal(80));
		pino12.setAltura(new BigDecimal(100));
		System.out.println(plant1);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(pino10.getFechaPlantacion().format(formato));
		System.out.println(pino10.getEdad() + " meses");
		DecimalFormat formato1 = new DecimalFormat(" #,###.00 €");
		System.out.println(formato1.format(plant1.calculaGananciaTotal()));
		plant1.exportarArboles();
		System.out.println(plant1);
	}

}
