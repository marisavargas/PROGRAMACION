package RepeticionEjercicio;

import java.util.Scanner;

public class ejercici3repasonuevo {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Integer opcion ;
	do {
	
	System.out.println("***MENU***");
	System.out.println("1.Abrir");
	System.out.println("2.Guardar");
	System.out.println("3.MOdificacion");
	System.out.println("4.Salir");
	 opcion = sc.nextInt();
	 if (opcion >4 || opcion <=0) {
		 System.out.println("esta numero no es correcto, elije otra opcion");
	 }
	 if(opcion==1) {
		 System.out.println("1.Abrir");
	 }
	 if(opcion ==2) {
		 System.out.println("2.Guardar");
	 }
	 if(opcion ==3) {
		 System.out.println("3.Modificar");
	 }
	
	}while ( opcion!=4 );
	System.out.println("Bye, Bye");
	sc.close();
}
}