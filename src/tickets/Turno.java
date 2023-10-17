package tickets;

public class Turno {
	int numero;
	
	public int getNumero() {
		return numero;
	}
	
	public Turno() {
	}
	
	public Turno(int numero) {
		this();
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "Turno [numero=" + numero + "]";
	}
	
	
	
}
