package pescaderia;

public class Turno {
	private int numero = 0;
	
	public int getNumero() {
		return numero;
	}
	
	public Turno(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Turno [numero=" + numero + "]";
	}
	
	
}
