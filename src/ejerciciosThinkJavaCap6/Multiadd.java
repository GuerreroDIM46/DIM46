package ejerciciosThinkJavaCap6;

public class Multiadd {

	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 3;

		System.out.println(multadd(a, b, c));
		System.out.println(multadd((1 / 2), Math.cos(Math.PI / 4), Math.sin(Math.PI / 4)));
		System.out.println(multadd(1, Math.log10(10), Math.log10(20)));
		System.out.println(expsum(b));

	}

	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}

	public static double expsum(double x) {
		double resultado = multadd(x, Math.pow(Math.E, -x), Math.sqrt(1 - Math.pow(Math.E, -x)));
		return resultado;
	}
}
