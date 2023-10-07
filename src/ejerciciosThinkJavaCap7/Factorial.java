package ejerciciosThinkJavaCap7;

public class Factorial {

	public static void main(String[] args) {
		int numeroN = 5;
		
		System.out.println(calculaFactorial(numeroN));
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
}
