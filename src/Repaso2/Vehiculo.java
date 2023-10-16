package Repaso2;

public class Vehiculo {

	protected String modelo;
	protected String color;

	public Vehiculo() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color, Coche coche) {
		this.color = color;
	}

}