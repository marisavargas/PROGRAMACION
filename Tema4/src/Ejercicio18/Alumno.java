package Ejercicio18;

import java.util.Objects;

public class Alumno extends Persona {
<<<<<<< HEAD
	private String dni;
	private Double nota;
	private Curso curso; /* este es el ejercicio22 */

	public Alumno(String dni) { /* este es el ejercicio 20 */
		this.dni = dni;;
	}
	public Alumno() {
		
	}
	
=======
 private String dni;
 private Double nota;
 private Curso curso;  /* este es el ejercicio22*/

 public  Alumno (String dniAlumno) {  /* este es el ejercicio 20*/
		this.dni= dniAlumno;
}
 
public String toString() {
	return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";/* este es el ejercicio 24*/
}

public Curso getCurso() {
	return curso;
}
>>>>>>> e39518abbeed115ff721d997bab3ddc54ad44751

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";/* este es el ejercicio 24 */
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(dni);
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

	public void aprobar() { /* este es el ejercicio 19 */
		this.nota = 5.0;
	}

}
