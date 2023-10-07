package pruebas;

public class PruebasConArrays2 {

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 3, 4 };

		int[][] prueba = { a, b };

		for (int i = 0; i < prueba.length; i++) {
			for (int j = 0; j < prueba.length; j++) {
				System.out.print(prueba[i][j] + "\t");
			}
			System.out.println("\n");
		}
		for (int[] fila : prueba) {
			for (int numero : fila) {
				System.out.print(numero + "\t");
			}
			System.out.println("\n");
		}

	}
}
