package ejerciciosThinkJavaCap8;

import java.util.Random;

import pruebas.demo;

public class Histogram {

	public static void main(String[] args) {
		int numValues = 300;
		int maximoValor = 20;
		int[] array = randomArray(numValues, maximoValor);
		printArray(array);
		int[] histogram = histogram(array, maximoValor);
		printArray(histogram);
		System.out.println();
		boolean[][] bidi = histogramToBidi(histogram);
		char[][] screen = bidiToScreen(bidi);
		printScreen(screen);
	}

	public static int[] randomArray(int size, int maximoValor) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(maximoValor);
		}
		return a;
	}

	public static void printArray(int[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
	}

	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] < high) {
				count++;
			}
		}
		return count;
	}
// el histograma, no tiene mucha ciencia
	public static int[] histogram(int[] array, int maximoValor) {
		int[] result = new int[maximoValor];
		for (int i = 0; i < result.length; i++) {
			result[i] = inRange(array, i, i + 1);
		}

		return result;
	}
// el valor maximo del histograma para pintar la matriz booleana
	public static int maximo(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (result < array[i]) {
				result = array[i];
			}
		}

		return result;
	}
// convertir histograma a booleano bidimentsional
	public static boolean[][] histogramToBidi(int[] histogram) {
		boolean[][] bidi = new boolean[maximo(histogram)][histogram.length];
		int k = (bidi.length);
		for (int i = 0; i < bidi.length; i++) {
			k--;
			for (int j = 0; j < bidi[i].length; j++) {
				if (histogram[j] >= i) {
					bidi[k][j] = true;
				} else {
					bidi[k][j] = false;
				}
			}
		}

		return bidi;
	}

	public static char[][] bidiToScreen(boolean[][] bidi) {
//la matriz bidi, pero el ancho por cuatro para pintar las barras y dejar hueco, mas los margenes
		char[][] result = new char[(bidi.length) + 1][bidi[0].length * 4 + 3];
//relleno de puntos la matriz pantalla
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = '.';
			}
		}
//pinto las barras
		for (int i = 0; i < bidi.length; i++) {
			for (int j = 0; j < bidi[i].length; j++) {
				if (bidi[i][j] == true) {
					int k = j * 4 + 4;
					result[i][k] = '\u2588';
					result[i][k + 1] = '\u2588';
				}
			}
		}
// la barra de abajo (posicion 2)
		for (int i = 0; i < result[0].length; i++) {
			result[result.length - 2][i] = '_';
		}
// la barras de separacion verticales abajo		
		for (int i = 2; i < result[0].length; i = i + 4) {
			result[result.length - 1][i] = '|';
		}
// la barra de al lado		
		for (int i = 0; i < result.length; i++) {
			result[i][2] = '|';
		}
// los nimeros a la izquierda	dificultad: el separar el char si son dos numeros	
		for (int i = 0; i < (result.length - 2); i++) {
			result[i][1] = Integer.toString(bidi.length - i - 1)
					.charAt(Integer.toString(bidi.length - i - 1).length() - 1);
		}
		for (int i = 0; i < (result.length - 2); i++) {
			if ((bidi.length - i - 1) > 9)
				result[i][0] = Integer.toString(bidi.length - i - 1)
						.charAt(Integer.toString(bidi.length - i - 1).length() - 2);
		}
//	los numeros de abajo, la misma dificultad que arriba	
		int j = 0;
		for (int i = 5; i < result[0].length; i = i + 4) {
			j++;
			result[result.length - 1][i] = Integer.toString(j).charAt(Integer.toString(j).length() - 1);
		}
		j = 0;
		for (int i = 4; i < result[0].length; i = i + 4) {
			j++;
			if (j > 9)
				result[result.length - 1][i] = Integer.toString(j)
						.charAt((Integer.toString(j).length() - 2));
		}

		return result;
	}

	public static void printScreen(char[][] screen) {
		for (int i = 0; i < screen.length; i++) {
			for (int j = 0; j < screen[i].length; j++) {
				System.out.print(screen[i][j]);
			}
			System.out.print("\n");
		}

	}
}
