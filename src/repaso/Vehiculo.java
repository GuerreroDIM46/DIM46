package repaso;

import java.util.Objects;

public class Vehiculo {

	protected String modeloString;
	protected String colorString;

	public Vehiculo() {
		super();
	}
	
	public Vehiculo(String modelo, String color) {
		this.modeloString = modelo;
		this.colorString = color;
	}
	
	
	public String getColorString() {
		return colorString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(modeloString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(modeloString, other.modeloString);
	}

	@Override
	public String toString() {
		return modeloString + " (" + getColorString() + ")";
	}
	

}