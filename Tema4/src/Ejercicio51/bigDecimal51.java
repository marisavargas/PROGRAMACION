package Ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bigDecimal51 {

	public static void main(String[] args) {
		BigDecimal suma =  BigDecimal.ZERO;
		List<BigDecimal>numUsuario = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
		System.out.println("Indicame un numero");
		String numero = sc.next();
		BigDecimal num = new BigDecimal(numero);
		if(i==0) {
			numUsuario.add(num);
		}
		else {
			if(numUsuario.get(i-1).compareTo(num)== -1) {
				numUsuario.add(num);
			}
			else {
				do {
					System.out.println("Este numero no es correcto , indique otro mayor que el anterior");
					 numero = sc.next();
					 num = new BigDecimal(numero);
				}while(numUsuario.get(i-1).compareTo(num)== -1);
				numUsuario.add(num);
			}
		
		}
		}
		for (int i = 0; i < numUsuario.size(); i++) {
			
			suma= suma.add(numUsuario.get(i));
		}
		System.out.println("lista de numeros :" + numUsuario);
		BigDecimal redondeador = suma.setScale(2,RoundingMode.HALF_DOWN);
		System.out.println( "suma redondeada" +redondeador);
		BigDecimal division = numUsuario.get(0).divide(numUsuario.get(1),3,RoundingMode.HALF_UP);
		System.out.println( "division" + division);
		sc.close();
	}

}
