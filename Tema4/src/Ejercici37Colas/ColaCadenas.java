package Ejercici37Colas;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
 private List <String> lista ;
 public ColaCadenas() {
	 lista = new ArrayList<String>();
 }
 
 public  void añadirCadena(String cadena1) {
  lista.add(cadena1);
 }
 public String sacarCadena() {
	 String cadena = lista.get(0);
	 lista.remove(0);
	 return cadena;
 }
 public Integer getTamaño() {
	 return lista.size();
 }
 
public List <String> getLista() {
	return lista;
}

public void setLista(List <String> lista) {
	this.lista = lista;
}
@Override
public String toString() {
	return "ColaCadenas [lista=" + lista + "]";
}
	

}
