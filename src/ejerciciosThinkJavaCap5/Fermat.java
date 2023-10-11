package ejerciciosThinkJavaCap5;

public class Fermat {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		int n = 1;

		if ((checkFermat(a, b, c, n)) && n > 2)
			System.out.println("Holy smokes, Fermat was wrong!");
		else
			System.out.println("No, that doesn’t work.");

	}

	public static boolean checkFermat(int a, int b, int c, int n) {
		boolean fermatSi = (Math.pow(a, n) + Math.pow(a, n)) == Math.pow(c, n);
		return fermatSi;
	}

}
