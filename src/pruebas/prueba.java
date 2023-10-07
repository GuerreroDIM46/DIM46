package pruebas;

public class prueba {
	public static void main(String[] args) {
		double numeroN = 121.0;
		double resultado = squareRoot(numeroN);
		
		System.out.println("la raiz aproximada de " + numeroN + " es: " + resultado);
	}

	public static double squareRoot(double a) {

		double x0 = a / 2.0;
		double x1;

		do {
			x1 = (x0 + a / x0) / 2.0;
			x0 = x1;
			
		} while (Math.abs(x1 - x0) >= 0.0001);

		return x1;
	}

}
