package ExamenBMarisaVargas;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plantacion  objeto1=  new Plantacion (" 98765432X");
		System.out.println(objeto1);
		 ArbolPino ap1=  new ArbolPino(10);
		 System.out.println(ap1);
		 ArbolPino ap2=  new ArbolPino(11);
		 System.out.println(ap2);
		 ArbolPino ap3=  new ArbolPino(12);
		 System.out.println(ap3);
		 ArbolFrutal af1= new ArbolFrutal (20,"Naranjo");
		 System.out.println(af1);
		 ArbolFrutal af2= new ArbolFrutal (21,"Limonero");
		 System.out.println(af2);
		 
		 
	}

}
