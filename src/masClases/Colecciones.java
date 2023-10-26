package masClases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import hijosDelSpectrum.Coche;
import hijosDelSpectrum.Moto;
import hijosDelSpectrum.Vehiculo;

public class Colecciones {

	public static void main(String[] args) {
		String matricula = "1234ABC";
		Coche coche = new Coche("Ford Fiesta", "Rojo"); // ¿por que no usar variable Vehiculo?
		coche.setMatricula(matricula);
		Vehiculo moto = new Moto("Suzuki", "Verde");
		
		Collection<Vehiculo> vehiculos = new ArrayList<>();
		System.out.println(vehiculos.size());
		vehiculos.add(coche);
		vehiculos.add(moto);
		System.out.println(vehiculos.size());
		System.out.println(vehiculos);
		System.out.println();
		
		vehiculos.forEach(v -> System.out.println(v));
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		vehiculos.forEach(System.out::println);
		
		
		
		
		System.out.println();
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
		System.out.println("\nQuito la moto");
		vehiculos.remove(moto);
		vehiculos.forEach(System.out::println);
		
		coche = new Coche("Ford Fiesta", "Blanco");
		coche.setMatricula(matricula);
		System.out.println("\nAñado nuevo coche");
		vehiculos.add(coche);
		vehiculos.forEach(System.out::println);
		
		System.out.println("\nQuito coche " + coche);
		vehiculos.remove(coche);
		vehiculos.forEach(System.out::println);
		
		vehiculos.addAll(Arrays.asList(new Coche("panda", "marron"), new Coche("leon",  "rosa")));
		
		vehiculos.forEach(System.out::println);
		
			
	}

}
