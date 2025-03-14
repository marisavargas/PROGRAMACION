package ExamenBMarisaVargas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import examen.Arbol;
//Belen: formatea la clase: penalizacion -0.2
public class Plantacion {
//Belen: variables en minusculas
private String CIF;  
List<Arbol>arboles;
public Plantacion(String cIF) {
	super();
	CIF = cIF;
	// Belen: this.arboles = new ArrayList<>();
	List<Arbol>arboles=new ArrayList<>();
}
public String getCIF() {
	return CIF;
}
public void setCIF(String cIF) {
	CIF = cIF;
}

//Belen: recibe el arbol como parametro y lo añade:
/*
 public void addArbol(Arbol arbol) {
        arboles.add(arbol);
    }
 */
public void addArbol() {
	for (Arbol arbol : arboles) {
		arboles.add(arbol);
	}
}

//Belen: errores de compilacion:
/*
 *  BigDecimal alturaTotal = BigDecimal.ZERO;
        for (Arbol arbol : arboles) {
            alturaTotal = alturaTotal.add(arbol.getAltura());
        }
        return alturaTotal.setScale(2, RoundingMode.HALF_UP);
 */
public BigDecimal getAlturaTotal() {
	
	BigDecimal sumaAltura= new BigDecimal();
	for (Arbol arbol : arboles) {
		sumaAltura=sumaAltura.add(arbol.getAlturaArbol(),2,RoundingMode.HALF_UP);				;
		 return sumaAltura;
		}
	
}

//Belen: 
/*
 *  BigDecimal gananciaTotal = BigDecimal.ZERO;
        for (Arbol arbol : arboles) {
            if (arbol.sePuedeExportar()) {
                gananciaTotal = gananciaTotal.add(arbol.getAltura().multiply(arbol.getPrecioPorCm()));
            }
        }
		return gananciaTotal.setScale(2,......);
 */
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
	//return "PLANTACION: " + this.cif + " - " + this.arboles.size() + " árboles con " + this.getAlturaTotal() + " cm totales" ;
	return "Plantacion CIF=" + CIF + "-"+ totalArboles() + "arboles con "+ getAlturaTotal() +"cm totales";

}
}
			


