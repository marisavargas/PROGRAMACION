package Ejercicio44;

public class Text44 {

	public static void main(String[] args) {
		Asesino asesino1 = new Asesino("pepe", "B01");
		Asesino asesino2 = new Asesino("antonio", "B02");
		Asesino asesino3 = new Asesino("juan", "B03");
		EquipoCombate equi = new EquipoCombate();
		equi.añadirPersonaje(asesino3);
		equi.añadirPersonaje(asesino2);
		equi.añadirPersonaje(asesino1);
		Parasito parasito1 = new Parasito("blas", "B69");
		System.out.println(parasito1);
		equi.añadirPersonaje(parasito1);
		Jugador juga = new Jugador("torre",equi);
		System.out.println(equi);
		Parasito parasito2 = new Parasito("yo", "B04");
		Parasito parasito3 = new Parasito("tu", "B05");
		juga.getEquipo().añadirPersonaje(parasito3);
		juga.getEquipo().añadirPersonaje(parasito2);
		System.out.println(juga);
		 System.out.println(juga.getEquipo().getVidas());
	}

}
