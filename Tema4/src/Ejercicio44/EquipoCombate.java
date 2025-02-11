package Ejercicio44;

import java.util.ArrayList;
import java.util.List;

public class EquipoCombate {
public List <Personaje> EquipoCombate;
private Integer totalPuntosVida;

public EquipoCombate() {
	EquipoCombate = new ArrayList<>();
	totalPuntosVida=0; 
}


public List<Personaje> getEquipoCombate() {
	return EquipoCombate;
}

public void setEquipoCombate(List<Personaje> equipoCombate) {
	EquipoCombate = equipoCombate;
}

public Integer getTotalPuntosVida() {
	return totalPuntosVida;
}

public void setTotalPuntosVida(Integer totalPuntosVida) {
	this.totalPuntosVida = totalPuntosVida;
}

}
