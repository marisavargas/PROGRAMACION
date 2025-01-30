package Ejercici37Colas;

public class Text37 {

	public static void main(String[] args) {
	 ColaCadenas cola = new  ColaCadenas();
	 cola.añadirCadena("primero");
	 cola.añadirCadena("segundo");
	 System.out.println(cola.sacarCadena());
	 cola.añadirCadena("tercero");
	 System.out.println(cola.toString());
	 cola.añadirCadena("cuarto");
	 System.out.println(cola.toString());
	 
	}

}
