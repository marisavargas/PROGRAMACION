package Tema55;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Text55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluacion evau= new Evaluacion();
		evau.addNota("23322323D",new BigDecimal (7.2));
		evau.addNota("63323633F",new BigDecimal (5.2));
		evau.addNota("09123990Z",new BigDecimal (9.1));
		evau.addNota("75612323B",new BigDecimal (3.2));
		evau.addNota("53271502Y",new BigDecimal (4.9));
		System.out.println(evau);
		evau.addNota("09123990Z",new BigDecimal (5.5));
		System.out.println(evau);
		evau.corregirNota("53271502Y",new BigDecimal (8.7));
		evau.corregirNota("48806354D", new BigDecimal(6.4));
		System.out.println(evau);
		System.out.println(evau.obtenerNotaMedia().setScale(2,RoundingMode.HALF_UP));
		System.out.println(evau.obtenerNotaAlumno("23322323D").setScale(2,RoundingMode.HALF_UP));
		System.out.println(evau.obtenerCantidadAprobaddos());
		System.out.println(evau.obtenerSuspensos());
		evau.borrarAprobados();
		System.out.println(evau);
		
	}

}
