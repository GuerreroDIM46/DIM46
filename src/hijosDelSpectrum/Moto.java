package hijosDelSpectrum;

public class Moto extends VehiculoConRuedas {
// extendes porque hereda de vehiculo con ruedas
	public Moto(String modelo, String color) {
		super(modelo, color);  // el constructor de vehiculo con ruedas
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNumeroDeRuedas() {
// la sobreescritura del get ruedas heredado 
		return 2;
	}
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
  public String toString() {
    return "Moto: " + super.toString(); //algpo + el toString de cehiculo con ruedas
  }
}
