package ejercicio41futbol;

public class Pastido {
private Equipo equipoLocal;
private Equipo equipoVisitante;
private Resultado resultado;


public Pastido(Equipo equipoLocal, Equipo equipoVisitante, Resultado resultado) {
	super();
	this.equipoLocal = equipoLocal;
	this.equipoVisitante = equipoVisitante;
	this.resultado = resultado;
}
public Equipo getEquipoLocal() {
	return equipoLocal;
}
public void setEquipoLocal(Equipo equipoLocal) {
	this.equipoLocal = equipoLocal;
}
public Equipo getEquipoVisitante() {
	return equipoVisitante;
}
public void setEquipoVisitante(Equipo equipoVisitante) {
	this.equipoVisitante = equipoVisitante;
}
public Resultado getResultado() {
	return resultado;
}
public void setResultado(Resultado resultado) {
	this.resultado = resultado;
}

}
