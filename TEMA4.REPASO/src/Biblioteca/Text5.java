package Biblioteca;

import java.time.LocalDate;

public class Text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Cd cd= new Cd(2,"yo","tu",LocalDate.of(2023,4,26),true,true);
Libro lb= new Libro(3,"yo","tu",LocalDate.of(2023,4,26),true,true);
Revista rb=new Revista(4,"yo","tu",LocalDate.of(2023,4,26));
Biblioteca biblio= new Biblioteca();
biblio.getPublicaciones().add(rb);
biblio.getPublicaciones().add(lb);
biblio.getPublicaciones().add(cd);


	}

}
