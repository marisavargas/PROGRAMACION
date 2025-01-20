package Ejercicio18;

public  abstract class Persona {
protected String nombre;
protected Integer edad;

<<<<<<< HEAD
public Persona() {
	
}
=======
>>>>>>> e39518abbeed115ff721d997bab3ddc54ad44751

public Persona(String nombre, Integer edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}
<<<<<<< HEAD
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + "]";/* ejercicio24*/
}

=======
>>>>>>> e39518abbeed115ff721d997bab3ddc54ad44751
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}

}
