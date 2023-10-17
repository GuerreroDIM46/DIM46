package pescaderia;

public class Expendedor {
	private int maximo = 99;
	private int minimo = 0;
	int ultimoGenerado = minimo;
	
	public Turno generarTurno() {
		if (ultimoGenerado > maximo) {
		ultimoGenerado = minimo;
		}
		ultimoGenerado++;
		return new Turno(ultimoGenerado);
		
	}
}
