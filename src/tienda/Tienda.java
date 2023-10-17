package tienda;

public class Tienda {

	public static void main(String[] args) {
		DistribuidorTurno distribuidorTurno = new DistribuidorTurno();
		VisorTurno visorTurno = new VisorTurno(distribuidorTurno);
		
		System.out.println(visorTurno.getTurno());
		System.out.println(distribuidorTurno.getTurnoActual());
		
		for (int i = 0; i < 110; i++) {
			Ticket ticket = distribuidorTurno.nuevoTicket();
			System.out.println(ticket.getNumero());
			
		}

	}

}
