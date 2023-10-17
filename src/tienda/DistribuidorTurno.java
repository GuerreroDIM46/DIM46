package tienda;

public class DistribuidorTurno {
	private final int MAXIMO = 99;
	private final int MINIMO = 0;
	private int turnoActual;
	
	public int getMAXIMO() {
		return MAXIMO;
	}
	
	public int getMINIMO() {
		return MINIMO;
	}
	
	public int getTurnoActual() {
		return turnoActual;
	}
	
	private void setTurnoActual(int turnoActual) {
		this.turnoActual = turnoActual;
	}
	
	public DistribuidorTurno() {
		setTurnoActual(getMINIMO());
	}
	
	public void añadirTurno() {
		if (getTurnoActual() == getMAXIMO()) {
			setTurnoActual(getMINIMO());
		} else {
			setTurnoActual(getTurnoActual() + 1);
		}
	}
	
	public Ticket nuevoTicket() {
		Ticket nuevoTicket = new Ticket(getTurnoActual());
		int nuevoValor;
		if (getTurnoActual() >= getMAXIMO()) {
			setTurnoActual(getMINIMO());
		} else {
			setTurnoActual(getTurnoActual() + 1);			
		}
		
		return nuevoTicket;
	}
}
