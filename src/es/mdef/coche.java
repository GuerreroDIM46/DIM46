package es.mdef;

public class coche {
	String modelo;
	String color;
	int numeroDeRuedas;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public coche() {
	numeroDeRuedas = 4;
	}

	public coche(String modelo) {
		this();
		setModelo(modelo);
	}

	public coche(String modelo, String color) {
		this(modelo);
		setColor(color);
	}

	@Override
	public String toString() {
		return "coche [modelo=" + modelo + ", color=" + color + ", numeroDeRuedas=" + numeroDeRuedas + "]";
	}



	
}


