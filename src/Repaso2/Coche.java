package Repaso2;

public class Coche extends Vehiculo {
	int numeroDeRuedas;
	String matricula;
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Coche() {
		super();
		numeroDeRuedas = 4;
	}

	public Coche(String modelo) {
		this();
		this.modelo = modelo;
	}

	public Coche(String modelo, String color) {
		this(modelo);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [numeroDeRuedas=" + numeroDeRuedas + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", color=" + color + "]";
	}

}
