package Ejercicio45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Text45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su dia de nacimientos");
		Integer dia = sc.nextInt();
		System.out.println("Indique su mes de nacimientos");
		Integer mes = sc.nextInt();
		System.out.println("Indique su año de nacimientos");
		Integer año = sc.nextInt();
		LocalDate fecha_nacimiento = LocalDate.now();
		fecha_nacimiento = fecha_nacimiento.withDayOfMonth(dia);
		fecha_nacimiento = fecha_nacimiento.withMonth(mes);
		fecha_nacimiento = fecha_nacimiento.withYear(año);
		Boolean bisiesto = fecha_nacimiento.isLeapYear();
		Integer dia_naci = fecha_nacimiento.getDayOfMonth();
		LocalDate fecha_actual= LocalDate.now();
		Period period = fecha_nacimiento.until(fecha_actual);
		System.out.println(" tu edad es " +  period.getYears());
		
		LocalTime hora = LocalTime.now();
		DateTimeFormatter hora1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora Actual es :" + hora1.format(hora));
	}
	}
