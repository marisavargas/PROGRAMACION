package Ejercicio18;

public class profesor  extends Persona{
 private String dni;
 

public String toString() {
<<<<<<< HEAD
	return "profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad +"] "; /* ejercicio 23*/
=======
	return "profesor [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";/* ejercicio 23*/
>>>>>>> e39518abbeed115ff721d997bab3ddc54ad44751
}
public profesor() {
	
}

public profesor(String nombre, Integer edad,String dni) {
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
