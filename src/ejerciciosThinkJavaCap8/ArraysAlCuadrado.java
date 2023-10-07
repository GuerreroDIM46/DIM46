package ejerciciosThinkJavaCap8;

public class ArraysAlCuadrado {

	public static void main(String[] args) {
		double[] a;
		a = new double[] { 1, 2, 3, 4, 5, 6, 7 };

		double[] b = powArray(a);
//		b = new double[a.length];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = Math.pow(a[i], 2);
//		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + "-----------" + b[i]);
		}
	}

	public static double[] powArray(double[] a) {
		double[] b;
		b = new double[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = Math.pow(a[i], 2);
		}
		
		return b;
	}

}
