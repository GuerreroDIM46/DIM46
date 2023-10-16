package repaso;

import java.util.Objects;

public class Coche extends VehiculoConRuedas {
	private String matriculaString;
	
	
	public void setModeloString(String modeloString) {
		this.modeloString = modeloString;
	}
	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
	public void setMatriculaString(String matriculaString) {
		this.matriculaString = matriculaString;
	}
	
	public Coche() {
		super();
		numeroDeRuedas = 4;
		}
	
	public Coche(String modelo) {
		this();
		setModeloString(modelo);
	}
	
	public Coche(String modelo, String color) {
		this(modelo);
		setColorString(color);
	}
	
	
	@Override
	public String toString() {
		return "Placa " + matriculaString + " - " + super.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(matriculaString);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matriculaString, other.matriculaString);
	}
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	
	
	
	
}
