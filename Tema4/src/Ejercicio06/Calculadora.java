package Ejercicio06;

public class Calculadora {
	public static final String ADD = "ADD";
	public static final String SUB = "SUB";
	public static final String MUL = "MUL";
	public static final String DIV = "DIV";

	public static Integer getSuma(Integer num1, Integer num2) {
		Integer Suma = num1 + num2;
		return Suma;
	}

	public static Integer getResta(Integer num1, Integer num2) {
		Integer Resta = num1 - num2;
		return Resta;
	}

	public static Integer getMultiplicacion(Integer num1, Integer num2) {
		Integer Multiplicacion = num1 * num2;
		return Multiplicacion;
	}

	public static Integer getDivision(Integer num1, Integer num2) {
		Integer Division = num1 / num2;
		return Division;
	}

	public static Integer calcular(String cadena, Integer num1, Integer num2) {
		Integer resultado =0;
		if (cadena.equals(ADD)) {
			resultado = Calculadora.getSuma(num1, num2);

		} else if (cadena.equals(SUB)) {
			resultado = Calculadora.getResta(num1, num2);

		} else if (cadena.equals(MUL)) {
			resultado = Calculadora.getMultiplicacion(num1, num2);

		} else if (cadena.equals(DIV)) {
			resultado = Calculadora.getDivision(num1, num2);

		}
		return resultado;

	}
}