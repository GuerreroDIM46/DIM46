package repaso;

public abstract class VehiculoConRuedas extends Vehiculo {

	protected int numeroDeRuedas;

	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	public abstract int getNumeroDeRuedas();

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}
	
	
}