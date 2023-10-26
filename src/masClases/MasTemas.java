package masClases;

import java.util.ArrayList;
import java.util.Collection;

import hijosDelSpectrum.Coche;
import hijosDelSpectrum.Moto;
import hijosDelSpectrum.Vehiculo;

public class MasTemas {

	public static void main(String[] args) {
	
		String matricula = "1234ABC";
		Coche coche = new Coche("Ford Fiesta", "Rojo"); // ¿por que no usar variable Vehiculo?
		coche.setMatricula(matricula);
		Vehiculo moto = new Moto("Suzuki", "Verde");
		Coche coche2 = new Coche("panda", "marron");
		Coche coche3 = new Coche("leon",  "rosa");
		
		Collection<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(coche);
		vehiculos.add(moto);
		vehiculos.add(coche3);
		vehiculos.add(coche2);
		System.out.println(vehiculos.iterator().next());
		
		System.out.println();
		
		
		ArrayList<Vehiculo> vehiculoslist = new ArrayList<>(vehiculos);
				
		for (int i = 0; i < vehiculoslist.size(); i = i + 2) {
			System.out.println(vehiculoslist.get(i).getColor() + " | " + vehiculoslist.get(i + 1).getColor());
			
		}
			
		
	}

}
