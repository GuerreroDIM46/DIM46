package tickets;

public class Expendedor {
	private int minimo = 0;
	private int maximo = 99;
	int ultimoGenerado = minimo;
	
	public Turno generarTurno() {
		if (ultimoGenerado > maximo) {
		ultimoGenerado = minimo;	
		}
		return new Turno(ultimoGenerado++);


	}
}
