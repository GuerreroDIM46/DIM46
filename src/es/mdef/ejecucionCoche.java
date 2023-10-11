package es.mdef;

public class ejecucionCoche {

	public static void main(String[] args) {
		coche renault = new coche();
		coche nissan = new coche("Qasqhai");
		coche mio = new coche("Qasqhai", "rojo");
		
		System.out.println(renault.toString());
		System.out.println(nissan.toString());
		System.out.println(mio.toString());
	}

	
	
}
