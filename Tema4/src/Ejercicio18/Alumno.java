package Ejercicio18;

public class Alumno extends Persona {
 private String dni;
 private Double nota;
 private Curso curso;  /* este es el ejercicio21*/

 public  Alumno (String dniAlumno) {  /* este es el ejercicio 20*/
		this.dni= dniAlumno;
}
 
public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}

public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public Double getNota() {
	return nota;
}
public void setNota(Double nota) {
	this.nota = nota;
}
public void aprobar() { /* este es el ejercicio 19*/
	this.nota= 5.0;
}



}
