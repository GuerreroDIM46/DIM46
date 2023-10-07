package pruebas;
import java.util.Arrays;

public class PruebasConArrays {
	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 3, 4 };
		int[][] aba = { a, b, a };
		imprimirMatriz(aba);
		System.out.println();
		// cambiamos el primer valor
		aba[0][0] = 5;
		imprimirMatriz(aba);
		// pero lo que cambia es "a"
		// no entender como una copia
		// es el mismo objeto
		// se ve en esta impresion
		System.out.println(Arrays.toString(aba));
		System.out.println("a es: " + Arrays.toString(a));
		System.out.println();

		// cambiamos el tercer array
		aba[2] = new int[] { 6, 7 };
		imprimirMatriz(aba);
		// ahora son 3 objetos distintos
		System.out.println(Arrays.toString(aba));
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				// hacer la operación que se necesite
				System.out.print(matriz[i][j] + "\t");
				// uso \t para alinear las columnas
			}
			System.out.println(); // siguiente fila
		}
	}
}