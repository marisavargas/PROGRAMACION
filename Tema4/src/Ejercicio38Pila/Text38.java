package Ejercicio38Pila;

public class Text38 {

	public static void main(String[] args) {
		 PilaCadenas cola = new  PilaCadenas();
		 cola.añadirCadena("primero");
		 cola.añadirCadena("segundo");
		 System.out.println(cola.sacarCadena());
		 cola.añadirCadena("tercero");
		 System.out.println(cola.toString());
		 cola.añadirCadena("cuarto");
		 System.out.println(cola.toString());
		 

	}

}
