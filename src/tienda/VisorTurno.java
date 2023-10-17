package tienda;

public class VisorTurno {
	private int turno;
	private DistribuidorTurno distribuidorTurno;
	
	public int getTurno() {
		return turno;
	}

	public VisorTurno(DistribuidorTurno distribuidorTurno) {
		this.distribuidorTurno = distribuidorTurno;
		turno = distribuidorTurno.getTurnoActual();
	}

}
