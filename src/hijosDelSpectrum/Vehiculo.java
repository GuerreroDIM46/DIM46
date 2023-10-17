package hijosDelSpectrum;

public class Vehiculo {

	protected String modelo;
	private String color;

	public Vehiculo() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Vehiculo(String modelo, String color) {
    this.modelo = modelo;
    setColor(color);
}

	@Override
	public String toString() {
		return modelo + " (" + getColor() + ")";
	}

}