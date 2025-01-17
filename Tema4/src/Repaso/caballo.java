package Repaso;

public class caballo {
	private String nombre;
	private Integer carrerasGanadas;
	private String color;
	private Integer edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(Integer carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void imprimeCarrerasGanadas() {
		System.out.println(" el numero de carrera ganadas es " + this.carrerasGanadas);
	}

	public Integer anyoNacimiento() {
		return 2025 - this.edad;
	}

	public void incrementarCarrerasGanadas() {
		this.carrerasGanadas++;
	}
	public void relincha() {
		System.out.println("Hiiiiiiiiiieeeeeee");
	}
	public caballo () {
	
	}
	public caballo ( String nombre, Integer carrerasGanadas, String color, Integer edad) {
		this.nombre= nombre;
		this.edad=edad;
		this.carrerasGanadas= carrerasGanadas;
		this.color= color;
	}
}
/*
 * hemos cambiados los atributos de publicos a privados para construir metodos ,
 * pero no podemos hacerlo en mains cuando es privado
 */