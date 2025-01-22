package Ejercicio18;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	private String dni;
	private Double nota;
	private Curso curso; /* este es el ejercicio22 */
	private Alumno [] alumnos;  /* ejercicio 30*/

	public Alumno(String dni) { /* este es el ejercicio 20 */
		this.dni = dni;
		;
	}

	public Alumno() {

	}
	private Curso (Integer numAlumnos) {  /* ejercicio 30 terminar en casa*/
		alumnos = new Alumnos();
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
		this.dni = dni.toUpperCase();/* ejercicio 26 */
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public void aprobar() { /* este es el ejercicio 19 */
		this.nota = 5.0;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";/* este es el ejercicio 24 */
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	public boolean validarDni(String dni) { /*
											 * ejercicio27 return (dni != null && dni.length()==9);
											 */

		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]"); /* ejercicio 28 */
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			return true;

		}
		return false;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	public boolean validar(){ /* ejercicio 29*/
	 if (validarDni(dni)){
		 return false;
	 }
	 if(curso ==null) {
		 return false;
		 
	 }
	 if(getNombre ()==null || getNombre().length()<10){
		 return false;
	 }
	 if(getEdad ()==null || getEdad()< 65 || getEdad ()>12 ) {
		 return false;
	 }
		 	
	return true;
}
}