package ejerciciosThinkJavaCap6;

public class Divisiones {

	public static void main(String[] args) {
		int numeroA = 40;
		int numeroB = 3;

		if (isDivisible(numeroA, numeroB)) {
			System.out.println(numeroA + " es divisible entre " + numeroB);
		} else {
			System.out.println(numeroA + " no es divisible entre " + numeroB);
		}

	}

	public static boolean isDivisible(int n, int m) {
		boolean divisibleSi = (n % m == 0);
		return divisibleSi;
	}
}
