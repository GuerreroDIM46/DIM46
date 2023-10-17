package hijosDelSpectrum;

public class Ejecucion {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("Seat Ibiza", "Rojo");
		coche1.setMatricula("1234 BBB");
		Coche coche2 = new Coche("Seat Ibiza", "Rojo");
		coche2.setMatricula("1234 BBB");
		Coche coche3 = coche1;

		// Igualdad
//		System.out.println("coche1 y coche2 son iguales: " + coche1.equals(coche2));
//		System.out.println("Pinto coche2 de Negro");
//		coche2.setColor("Negro");
//		System.out.println("Los coches siguen siendo iguales: " + coche1.equals(coche2));
//		System.out.println("Cambio la matrícula a coche2");
//		coche2.setMatricula("5555 CCC");
//		System.out.println("Los coches siguen siendo iguales: " + coche1.equals(coche2));

		//Identidad
//		System.out.println("coche1 y coche2 son el mismo: " + (coche1 == coche2));
//		System.out.println("coche1 y coche3 son el mismo: " + (coche3 == coche1));
		
	  Coche miCoche = new Coche();
	  System.out.println(new Moto());
	 
	  System.out.println(coche1);
	  System.out.println(new Moto("Suzuki", "Negro"));
	  
	  VehiculoConRuedas triciclo = new VehiculoConRuedas("Fisher price", "multicolor") {
			
			@Override
			public int getNumeroDeRuedas() {
				// TODO Auto-generated method stub
				return 3;
			}//metodo get
		}; // body de la clase anonima ojo semicolom
		
		Moto harley = new Moto("Harley-Davidson", "Rosa") {

	    @Override
	    public void setColor(String color) {
	        if(!(color.equals("Rojo") || color.equals("Negro"))) {
	            System.out.println("No se permite ese color para " + modelo);
	        } else {
	            super.setColor(color);
	        }// el if
	    }//el setcolor metodo
	    
	};// el body de la clase anonima
	System.out.println(harley);
	Vehiculo barco = new Vehiculo("CMB Yachts", "Blanco") {
    double eslora = 47.8;

    private double getEslora() {
        return eslora;
    }
    
    @Override
    public String toString() {
        return super.toString() + " con " + getEslora() + "m de eslora";
    }
    
};
System.out.println(barco);
System.out.println(triciclo.getClass());
System.out.println(barco.getClass());
System.out.println(harley.getClass());

	}// el main
	

}// la clase ejecucion
