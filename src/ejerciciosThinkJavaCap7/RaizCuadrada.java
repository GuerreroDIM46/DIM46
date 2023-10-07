package ejerciciosThinkJavaCap7;
public class RaizCuadrada {

	public static void main(String[] args) {
		double numeroN = 178;

		System.out.println(squareRoot(numeroN));

	}

	public static double squareRoot(double numeroN) {
		double x0 = numeroN;
		double x1 = numeroN / 2;

		while (Math.abs(x1 - x0) >= 0.0001) {
			x0 = x1;
			x1 = (x0 + numeroN / x0) / 2;
		}

		return x1;
	}
}
