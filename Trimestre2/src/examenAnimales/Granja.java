package examenAnimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Granja {
	private String localidad;
	private List<Animal> animales;
	
	public Granja(String localidad) {
		super();
		this.localidad = localidad;
		this.animales= new ArrayList<>();
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public void addAnimal(Animal animal) {
		animales.add(animal);
		
	}
	public List<Animal> getAnimalesNacimientos(Integer año){
		List<Animal> animalesAñoNacimiento = new ArrayList<>();
		for (Animal animal : animales) {
			if(animal.getFechaNacimiento().getYear()== año) {
				animalesAñoNacimiento.add(animal);
			}
			
		}return animalesAñoNacimiento;
		
			
		}
	public BigDecimal getPesoTotal() {
		BigDecimal suma=new BigDecimal (0);
		for (Animal animal : animales) {
			suma=suma.add(animal.getPeso());
			
		}return  suma.setScale(2,RoundingMode.HALF_UP);
	}
	public BigDecimal calcularPrecioVenta() {
		BigDecimal sumaDinero= new BigDecimal(0);
		for (Animal animal : animales) {
			if(animal.sePuedeVender()== true) {
				sumaDinero= sumaDinero.add(animal.getPrecioVentaKg().multiply(animal.getPeso()));
			}
			
		}return  sumaDinero.setScale(2,RoundingMode.HALF_UP);
		
	}
	public void venderAnimales() {
		Iterator<Animal> iterador = animales.iterator();
		while (iterador.hasNext()) {
			Animal animal= iterador.next();
			if(animal.sePuedeVender()== true) {
				iterador.remove();
			}
			
			}
	}

	@Override
	public String toString() {
		return "GRANJA  DE" + localidad + "//" + animales.size() +" animales con "+ getPesoTotal ()+ "kg";
	}
	
	}

