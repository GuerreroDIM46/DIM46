package hijosDelSpectrum;

public abstract class VehiculoConRuedas extends Vehiculo {

	public VehiculoConRuedas() {
		super();
	}// el constructor heredado de vehiculo

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}// lo mimo que antes
	// se ponen los constructores para que los hereden los subtipos
	public abstract int getNumeroDeRuedas();
// los abstract no tienen cuerpo, semicolon sin body, y es para heredar codigo
	
	
	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}
	// le toString de Vehiculo
	
}