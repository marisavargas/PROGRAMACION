package examenaPlantas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Arbol {
	protected Integer numeroSerie;
	protected LocalDate fechaPlantacion;
	protected BigDecimal Altura;
	private static final BigDecimal EXPORTFRUTAL = new BigDecimal(0.5);
	private static final BigDecimal EXPORTPINO = new BigDecimal(0.2);

	public Arbol(Integer numeroSerie) {
		super();
		this.numeroSerie = numeroSerie;
		this.fechaPlantacion = LocalDate.now();
		this.Altura = new BigDecimal(0);

	}

	public LocalDate getFechaPlantacion() {
		return fechaPlantacion;
	}

	public void setFechaPlantacion(LocalDate fechaPlantacion) {
		this.fechaPlantacion = fechaPlantacion;
	}

	public BigDecimal getAltura() {
		return Altura;
	}

	public void setAltura(BigDecimal altura) {
		Altura = altura;
	}

	public Integer getEdad() {
		Period periodo = fechaPlantacion.until(LocalDate.now());
		Integer edad = periodo.getMonths() + (periodo.getYears() * 12);
		return edad;
	}

	public Integer getNumeroSerie() {
		return numeroSerie;
	}

	public abstract BigDecimal getAlturaMinimaExportacion();

	public abstract BigDecimal getPrecioMinimaExportacion();

	public abstract Boolean sePuedeExpotar();

	public static BigDecimal getExportfrutal() {
		return EXPORTFRUTAL;
	}

	public static BigDecimal getExportpino() {
		return EXPORTPINO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroSerie);
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
		return Objects.equals(numeroSerie, other.numeroSerie);
	}
	
}
