package coche;

public class coche  {
protected	int ruedas;
protected	int largo;
protected	int ancho;
protected	int motor;
protected	int peso;
protected String color;

	public coche(String color) {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
		setColor(color);
	}
	public coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
		
	}
	
	public int getRuedas() {
		return ruedas;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
}