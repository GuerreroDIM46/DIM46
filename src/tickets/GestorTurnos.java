package tickets;


public class GestorTurnos {

	public static void main(String[] args) {
		
		Expendedor expendedor = new Expendedor();
		for (int i = 0; i < 105; i++) {
			Turno turno = expendedor.generarTurno();
			System.out.println(turno);
		}
	}

}
