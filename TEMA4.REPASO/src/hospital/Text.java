package hospital;

import java.time.LocalDate;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el nombre del medico");
		String medico1 = sc.nextLine();
		Agenda agenda= new Agenda(medico1);
		LocalDate fecha1= LocalDate.of(2024,4,12);
		CitaNormal citaNomal1=new CitaNormal("marisa",fecha1,10,true);
		LocalDate fecha2= LocalDate.of(2023,5,6);
		CitaRevision citaRevi1= new CitaRevision("manoli",fecha2,12,false,5);
		agenda.addCita(citaRevi1);
		agenda.addCita(citaNomal1);
		System.out.println(agenda.getImportePendienteFacturar());
		System.out.println("indique el nombre de un paciente");
		String paciente = sc.nextLine();
		System.out.println(agenda.tieneCitaProxima(paciente));
		citaNomal1.setFacturada(true);
		agenda.borrarCitasFacturas();
		System.out.println(agenda);
	}

}
