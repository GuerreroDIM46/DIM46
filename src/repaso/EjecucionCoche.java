package repaso;

public class EjecucionCoche {

	public static void main(String[] args) {

		System.out.println(new Moto("Suzuki", "Negro"));

		VehiculoConRuedas triciclo = new VehiculoConRuedas("Fisher-Price", "Multicolor") {

			@Override
			public int getNumeroDeRuedas() {
				return 3;
			}

		};// modificacion de vehiculo con ruedas
		System.out.println(triciclo);
		Moto harley = new Moto("Harley-Davidson", "Rosa") {

		    
		    public void setColorString(String colorString) {
		        if(!(colorString.equals("Rojo") || colorString.equals("Negro"))) {
		            System.out.println("No se permite ese color para " + modeloString);
		        } else {
		            setColorString(colorString);
		        }
		    }
		    
		};
		System.out.println(harley);
		
		
		
	}//main
}//class
