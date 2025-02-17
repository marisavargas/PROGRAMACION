package Ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Text50 {

	public static void main(String[] args) {
		Set<Pais>pais = new HashSet<>();
		Pais pais1 = new Pais("ES","España");
		Pais pais2 = new Pais("CK","Islas Cook");
		Pais pais3 = new Pais("CK","Islas Caiman");
		pais.add(pais1);
		pais.add(pais2);
		pais.add(pais3);
		System.out.println(pais);
		Pais pais4 =new Pais ("es","España");
		pais.add(pais4);
		System.out.println(pais);
		Iterator<Pais> it = pais.iterator();
		while(it.hasNext()){
			Pais pais = it.next();
			if(!pais.getCodigo().equals("ES")) {
				it.remove();
			}
		}System.out.println(pais);
		pais.clear();
		System.out.println(pais);
	}

}
