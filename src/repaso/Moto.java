package repaso;

public class Moto extends VehiculoConRuedas {

	public Moto() {
		// TODO Auto-generated constructor stub
	}

	public Moto(String modelo, String color) {
		super(modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNumeroDeRuedas() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}
}