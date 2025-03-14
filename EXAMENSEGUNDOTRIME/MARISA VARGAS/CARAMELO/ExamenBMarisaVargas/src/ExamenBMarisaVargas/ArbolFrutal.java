package ExamenBMarisaVargas;

import java.math.BigDecimal;

public class ArbolFrutal extends Arbol {

	private String especie;

//Belen: estas dos constantes son BigDecimal
	/*
	 * private static final BigDecimal ALTURA_MINIMA_EXPORTACION = new
	 * BigDecimal("150"); private static final BigDecimal PRECIO_POR_CM = new
	 * BigDecimal("0.5");
	 */
	public static final Integer ALTURAFRUTAL = 150;
	public static final Double PRECIOFRUTAL = 0.5;

	public ArbolFrutal(Integer numSerie, String especie) {
		super(numSerie);
		this.especie = especie;
	}

	public ArbolFrutal(Integer numSerie) {
		super(numSerie);
		// TODO Auto-generated constructor stub
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

//Belen: faltan los metodos abstractos

};
