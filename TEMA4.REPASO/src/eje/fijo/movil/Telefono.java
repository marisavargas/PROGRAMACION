package eje.fijo.movil;

public class Telefono {
 protected Integer numero;
 protected Boolean enLlamada;

 
public Telefono(Integer numero) {
	super();
	this.numero = numero;
	this.enLlamada = false;
}
public Integer consultarNumero () {
	return numero;
}
 public void marcar( int nuevoNumero) {
	 System.out.println("llamando a "+ nuevoNumero );
	 if(nuevoNumero==numero){
		 System.out.println("comunicando");
	 }
	 else {
		 System.out.println("en comunicacion ");
		 this.enLlamada=true;
	 }
 }
public void colgar() {
	if(enLlamada= true) {
		System.out.println("comunicacion terminada");
		enLlamada= false;
	}else {
		enLlamada=true;
		return;
	}
	

 }
}
