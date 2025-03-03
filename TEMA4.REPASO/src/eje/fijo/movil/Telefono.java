package eje.fijo.movil;

public class Telefono {
 protected Integer numero;
 protected Boolean enLlamada;
/*public Telefono(Integer numero) {
	super();
	this.numero = numero;
	this.enLlamada=false;
}*/
public Integer consultarNumero () {
	return numero;
}
 public void marcar() {
	 System.out.println("llamando a "+ numero );
	 if(numero.equals(numero)){
		 System.out.println("comunicando");
	 }
	 else {
		 System.out.println("en comunicacion ");
		 this.enLlamada=true;
	 }
public Boolean colgar() {
	if(enLlamada= true) {
		System.out.println("comunicacion terminada");
		enLlamada= false;
	}else {
		return enLlamada == true;
	}
	

 }
}
