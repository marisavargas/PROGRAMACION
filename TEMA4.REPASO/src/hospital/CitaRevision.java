package hospital;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaRevision extends Cita{
	private Integer numRevision;
	
 public CitaRevision(String paciente, LocalDate fechaCita, Integer hora,
		 Boolean seguro,  Integer numRevision) {
		super(paciente, fechaCita, hora, seguro);
		// TODO Auto-generated constructor stub
		this.numRevision=numRevision;
	}

@Override
public BigDecimal getImporteFactura() {
	// TODO Auto-generated method stub
	BigDecimal coste= new BigDecimal(60);
	BigDecimal numRe= new BigDecimal(numRevision);
	return coste.multiply(numRe);
	}
 
}
