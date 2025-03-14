package ExamenBMarisaVargas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Arbol {
	protected Integer numSerie;
	protected LocalDate fechaPlantacion;
	protected BigDecimal alturaArbol;
	
	//Belen: estos dos atributos no son de la clase.
	protected BigDecimal alturaExportacion;
	protected BigDecimal precioExportacion;

	public Arbol(Integer numSerie) {
		super();
		this.numSerie = numSerie;
		this.fechaPlantacion = LocalDate.now();
		//Belen:this.altura = BigDecimal.ZERO;	 
		BigDecimal zero = this.alturaArbol.ZERO;

	}

	public BigDecimal getAlturaArbol() {
		return alturaArbol;
	}

	public void setAlturaArbol(BigDecimal alturaArbol) {
		this.alturaArbol = alturaArbol;
	}

	public BigDecimal getPrecioExportacion() {
		return precioExportacion;
	}

	public Integer getNumSerie() {
		return numSerie;
	}

	

	public LocalDate getFechaPlantacion() {
		return fechaPlantacion;
	}

	public void setFechaPlantacion(LocalDate fechaPlantacion) {
		this.fechaPlantacion = fechaPlantacion;
	}

	public BigDecimal getAlturaExportacion() {
		return alturaExportacion;
	}

	public Integer getEdad() {
		Period periodo = fechaPlantacion.until(LocalDate.now());
		Integer mesesEdad = periodo.getMonths();
		//Belen: return mesesEdad + (periodo.getYears()*12); 
		return mesesEdad;
	}

	//Belen: 
	/*public boolean sePuedeExportar() {
		return altura.compareTo(getAlturaMinimaExportacion()) >= 0;
	}*/
	
	//EN este metodo debes usar herencia y polimorfismo. Debes usar el metodo getAlturaMinimaExportacion
	// que es diferente en cada clase hija y debe estar implementado en ambas.
	public Boolean sePuedeExportar() {
		BigDecimal alturaFrutal= new BigDecimal(ArbolFrutal.ALTURAFRUTAL);
		if ( alturaArbol.compareTo(alturaFrutal)>=0 ) {
			System.out.println("el arbol de fruta puede ser exportado");
			return true;

		}
		BigDecimal alturaPino = new BigDecimal(ArbolPino.ALTURAPINO);
		if (alturaArbol.compareTo(alturaPino)>=0 ) {
			System.out.println("el pino puede se exportado");
			return true;

		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(numSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arbol other = (Arbol) obj;
		return Objects.equals(numSerie, other.numSerie);
	}
	

}
