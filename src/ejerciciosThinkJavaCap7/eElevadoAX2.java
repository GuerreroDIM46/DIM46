package ejerciciosThinkJavaCap7;

public class eElevadoAX2 {

	public static void main(String[] args) {
		int x = 2;
		int n = 30;
		System.out.println(myexp(x, n));

	}

	public static int calculaFactorial(int numeroN) {
		int resultado = 0;
		if (numeroN == 1) {
			resultado = 1;
		} else {
			resultado = numeroN * calculaFactorial(numeroN - 1);
		}
		return resultado;
	}

	public static double myexp(int x, int n) {
		double resultado = 1 + x;
		for (int i = 1; i < n; i++) {
			resultado = resultado + Math.pow(x, i) / calculaFactorial(i);
		}
		return resultado;
	}
}
