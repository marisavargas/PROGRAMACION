package hospital;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	private String medico;
	private List<Cita> citas;

	public Agenda(String medico) {
		super();
		this.medico = medico;
		citas = new ArrayList<>();
	}

	public void addCita(Cita citaNueva) {
		Boolean duplicado = false;
		for (Cita cita : citas) {
			if (cita.equals(citaNueva)) {
				duplicado = true;
				break;
			}
		}
		if (duplicado == false) {
			citas.add(citaNueva);
		}

	}

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> listaDia = new ArrayList<>();
		for (Cita cita : listaDia) {
			if (cita.getFechaCita().isEqual(fecha)) {
				listaDia.add(cita);

			}
		}
		return listaDia;

	}

	public BigDecimal getImportePendienteFacturar() {
		BigDecimal suma = new BigDecimal(0);
		for (Cita cita : citas) {
			if (cita.getFacturada() == false) {
				suma = suma.add(cita.getImporteFactura());
			}
		}
		return suma;
	}

	public void borrarCitasFacturas() {
		Iterator<Cita> iterator = citas.iterator();
		while (iterator.hasNext()) {
			Cita cita = iterator.next();
			if (cita.getFacturada() == true) {
				iterator.remove();
			}
		}

	}

	public Boolean tieneCitaProxima(String paciente) {

		for (Cita cita : citas) {
			if (cita.getFechaCita().isAfter(LocalDate.now()) 
					&& cita.getPaciente().equals(paciente)) {
				return true;
			}

		}return false;
	}
	public void facturarCitasPendientes(String paciente) {
		for (Cita cita : citas) {
			if (cita.getFechaCita().isAfter(LocalDate.now()) 
					&& cita.getPaciente().equals(paciente)) {
				cita.setFacturada(true);
			}

		}
	}

	@Override
	public String toString() {
		return "Agenda [medico=" + medico + ", citas=" + citas + "]";
	}
	
	}

