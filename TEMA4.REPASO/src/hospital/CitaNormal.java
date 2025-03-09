package hospital;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaNormal  extends Cita{

	public CitaNormal(String paciente, LocalDate fechaCita, Integer hora,
			Boolean seguro ) {
		super(paciente, fechaCita, hora, seguro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getImporteFactura() {
		// TODO Auto-generated method stub
		if( seguro=false) {
			BigDecimal coste= new BigDecimal(150);
			return coste;
		}else {
			BigDecimal coste= new BigDecimal(100);
			return coste;
		}
		
	}

}
