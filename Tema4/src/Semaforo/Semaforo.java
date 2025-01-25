package Semaforo;

public class Semaforo {
	public static final  String ROJO ="rojo";
	public static final String AMARILLO ="amarillo";
	public static final String VERDE ="verde";
private String color;
private boolean parpadeando;
public Semaforo() {
	color = ROJO;
	parpadeando = false;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	if( color.equals(AMARILLO)|| color.equals(ROJO)|| color.equals(VERDE)) {
		this.color = color;
	}
}
public boolean isParpadeando() {
	return parpadeando;
}
public void setParpadeando(boolean parpadeando) {
	if( color.equals(AMARILLO) ) {
		this.parpadeando = parpadeando;
	}
	
}
@Override
public String toString() {
	if( color.equals(AMARILLO) && parpadeando== true) {
		return "Semaforo " + color + "parpadeando";
	} 
	
	return "Semaforo [color=" + color + ", parpadeando=" + parpadeando + "]";
}
public  void cambiarEstado() {
	if(color.equals(VERDE)) {
		setColor(AMARILLO );
		setParpadeando(true);
	}
	else if( color.equals(AMARILLO) && parpadeando== true) {
		setParpadeando (false);
	}
	else if ( color.equals(AMARILLO) && parpadeando== false) {
		setColor(ROJO);
		
	}
	else if (color.equals(ROJO)) {
		setColor(VERDE);
	}
}


}
