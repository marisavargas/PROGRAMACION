package Ejercicio59;

import java.util.Scanner;

public class Text59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	Geografia paises= new Geografia() ;	
	paises.agregarPais("Egipto","El Cairo");
	paises.agregarPais("Suiza","Berna");
	paises.agregarPais("Austria","Praga");
	paises.agregarPais("Hungria","Budapest");
	paises.agregarPais("Brasil","Brasilia");
	System.out.println(paises);
	System.out.println("Indica una letra");
	String letra= sc.nextLine();
	paises.obtenerCapital(letra);
	System.out.println(letra);
	String nuevoPais= paises.mismaLetra();
	System.out.println(paises.mismaLetra());
	paises.eliminarPaisConCapitalLetra(letra);
	
	}

}
