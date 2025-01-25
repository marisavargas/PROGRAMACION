package Semaforo;

public class Text33 {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		System.out.println(semaforo.toString());
		semaforo.setColor("rosa");
		System.out.println(semaforo.toString());
		semaforo.setColor(Semaforo.VERDE);
		semaforo.setParpadeando(true);
		for (int i = 0; i < 5; i++) {
			semaforo.cambiarEstado();
			System.out.println(semaforo.toString());
			
		}
		Semaforo semaforo1 = semaforo;

	}	
}
