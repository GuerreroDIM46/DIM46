package ejerciciosThinkJavaCap7;

public class PotenciaIterativa {

	public static void main(String[] args) {
		double base = 2;
		int exponente = 4;
		System.out.println(CalculaPotencia(base, exponente));
	}

	public static double CalculaPotencia(double base, int exponente) {
		double resultado = 0;
		if (exponente == 0) {
			resultado = 1;
		} else {
			if (exponente % 2 == 0) {
				resultado = CalculaPotencia(base, exponente / 2) * CalculaPotencia(base, exponente / 2);
			} else {
				resultado = CalculaPotencia(base, exponente / 2) * CalculaPotencia(base, exponente / 2)
						* base;
			}
		}
		return resultado;
	}
}
