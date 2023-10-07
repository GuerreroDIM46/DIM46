package enClase;

public class Pitagoras {

	public static void main(String[] args) {
		double xCentro = 0;
		double yCentro = 0;
		double xPerimetroCircunferencia = 5;
		double yPerimetroCircunferencia = 6;

		System.out.println("El area de la circunferencia es "
				+ String.format("%.2f", areaCircunferenciaPorPuntoCentroYPuntoPerimetro(xCentro, yCentro,
						xPerimetroCircunferencia, yPerimetroCircunferencia)));

	}

	public static double areaCircunferenciaPorPuntoCentroYPuntoPerimetro(double xCentro,
			double yCentro, double xPerimetroCircunferencia, double yPerimetroCircunferencia) {
		double incrementoX = xPerimetroCircunferencia - xCentro;
		double incrementoY = yPerimetroCircunferencia - yCentro;
		double area = Math.PI * Math.pow(incrementoX, 2) * Math.pow(incrementoY, 2);
		return area;
	}
}
