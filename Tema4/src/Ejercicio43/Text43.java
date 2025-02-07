package Ejercicio43;

public class Text43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor actor1 = new Actor("Blas Blau ",1983,"España");
		Actor actor2= new Actor("Laura Pozo",1981,"Italia");
		Actor actor3= new Actor("Marcel Cade",2001,"Suiza");
		Actor actor4= new Actor("Violeta Volo",1999,"Rusia");
		Guionistas gion1= new Guionistas("Marco Smith ",1988,"Reino Unido");
		Guionistas gion2= new Guionistas("Cheng Shu ",1977,"China");
		Directores direct1= new Directores("Sara Marea",1994,"Portugal");
		Pelicula peli1= new Pelicula(2027,"Do you now blas?",gion1, direct1);
		peli1.getActores().add(actor1);
		peli1.getActores().add(actor2);
		Pelicula peli2 = new Pelicula(2027,"Muerte en la sombra",gion2,direct1);
		peli1.getActores().add(actor1);
		peli1.getActores().add(actor2);
		peli1.getActores().add(actor3);
		peli1.getActores().add(actor4);
	}

}
