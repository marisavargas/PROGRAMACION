package Ejercicio18;

public class Profesor  extends Persona{
 private String dni;
 

public String toString() {
	return "profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad +"] "; /* ejercicio 23*/

}
public Profesor() {
	
}

public Profesor(String nombre, Integer edad,String dni) {
	super(nombre, edad);
	this.dni=dni;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}
 
 
}
