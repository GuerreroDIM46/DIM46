package ejerciciosThinkJavaCap6;

public class Triangles {

	public static void main(String[] args) {
		int ladoA = 10;
		int ladoB = 10;
		int ladoC = 10;

		if (isTriangle(ladoA, ladoB, ladoC))
			System.out.println("hay triangulo");
		else
			System.out.println("Los valores proporcionados no forman un triangulo");

	}

	public static boolean isTriangle(int ladoA, int ladoB, int ladoC) {
		boolean trianguloSi;
		if (ladoA > ladoB + ladoC)
			trianguloSi = false;
		else if (ladoB > ladoA + ladoC)
			trianguloSi = false;
		else if (ladoC > ladoA + ladoB)
			trianguloSi = false;
		else
			trianguloSi = true;
		return trianguloSi;
	}
}
