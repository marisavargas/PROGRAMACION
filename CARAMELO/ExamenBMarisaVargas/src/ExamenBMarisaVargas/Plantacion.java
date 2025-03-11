package ExamenBMarisaVargas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Plantacion {
private String CIF;
List<Arbol>arboles;
public Plantacion(String cIF) {
	super();
	CIF = cIF;
	List<Arbol>arboles=new ArrayList<>();
}
public String getCIF() {
	return CIF;
}
public void setCIF(String cIF) {
	CIF = cIF;
}
public void addArbol() {
	for (Arbol arbol : arboles) {
		arboles.add(arbol);
	}
}

public BigDecimal getAlturaTotal() {
	BigDecimal sumaAltura= new BigDecimal();
	for (Arbol arbol : arboles) {
		sumaAltura=sumaAltura.add(arbol.getAlturaArbol(),2,RoundingMode.HALF_UP);				;
		 return sumaAltura;
		}
	
}
public void calculaGananciaExportacion() {

	for (Arbol arbol : arboles) {
		if(arbol.sePuedeExportar()) {
			BigDecimal total=arbol.precioExportacion.multiply(getAlturaTotal());
			
			
		}
	}
	
}
public void exportarArboles() {
	Iterator <Arbol>iterator= arboles.iterator();
	while (iterator.hasNext()) {
		Arbol arboles= iterator.next();
		if(arboles.sePuedeExportar()) {
			iterator.remove();
		}
	}
	}
	public Integer totalArboles() {
		Integer total = 0;
	for (int i = 0; i < arboles.size(); i++) {
		if( arboles (i)-1) {
			break;
		}else {
			total= total + arboles(i);
		}
	}return total;
		
	}
	private Integer arboles(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
@Override
public String toString() {
	return "Plantacion CIF=" + CIF + "-"+ totalArboles() + "arboles con "+ getAlturaTotal() +"cm totales";

}
}
			


