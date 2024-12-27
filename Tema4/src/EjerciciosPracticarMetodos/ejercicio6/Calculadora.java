package EjerciciosPracticarMetodos.ejercicio6;
 
public class Calculadora {
public static final  String ADD = "ADD";
public static final  String SUB = "SUB";
public static final  String MUL = "MUL";
public static final  String DIV = "DIV";

	public Integer getSuma(Integer num1, Integer num2) {
		Integer suma = num1 + num2;
		return suma;
	}

	public Integer getResta(Integer num1, Integer num2) {
		Integer resta = num1 - num2;
		return resta;
	}

	public Integer getMulti(Integer num1, Integer num2) {
		Integer multiplicacion = num1 * num2;
		return multiplicacion;
	}

	public Integer getDivision(Integer num1, Integer num2) {
		Integer division = num1 / num2;
		return division;
	}
	public Integer getCalcular(Integer num1, Integer num2, String cadena) {
		if( cadena.equals("ADD")) {
			return getSuma(num1,num2);
		}
		else if (cadena.equals("SUB")) {
			return getResta(num1,num2);
			
		}
		else if (cadena.equals("MUL")) {
			return getMulti(num1,num2);
		}
		else {
			return getDivision(num1,num2);
		}
		
	}	
}
