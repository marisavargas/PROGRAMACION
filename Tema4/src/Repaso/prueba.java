package Repaso;

public class prueba {

	public static void main(String[] args) {
		caballo caballo1 = new caballo();
		System.out.println(caballo1.getColor());
		caballo1.setEdad(20);
		System.out.println(caballo1.anyoNacimiento());
		caballo1.setCarrerasGanadas(5);
		caballo1.incrementarCarrerasGanadas();
		caballo1.relincha();
		System.out.println(caballo1.getNombre());
		caballo1.setNombre("bolita");
		caballo1.setColor("negro");
		caballo1.setEdad(2);
		caballo1.setCarrerasGanadas(10);
		
		caballo caballo2 = new caballo("fideo",4,"blanco",2);
		caballo2.getNombre();
	}

}
