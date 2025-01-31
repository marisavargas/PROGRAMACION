package ejercicio41futbol;

public class Pastido {
private Equipo equipoLocal;
private Equipo equipoVisitante;
private Resultado resultado;


public Pastido() {
	
}
public Equipo equipoGanador() {
	if(resultado.isVictoriaLocal()) {
		return equipoLocal;
	}
	else if(resultado.isVictoriaVisitante()) {
		return equipoVisitante;
	
	}else  {
		return null;
	}
	
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
@Override
public String toString() {
	return  equipoLocal   + " vs." + equipoVisitante + resultado;
}

}
