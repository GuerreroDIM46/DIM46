package ejerciciosThinkJavaCap8;

import java.util.Random;

public class Histogram {

	public static void main(String[] args) {
		int numValues = 60;
		int maximoValor = 10;
		int[] array = randomArray(numValues, maximoValor);
		printArray(array);
		int[] histogram = histogram(array, maximoValor);
		printArray(histogram);
		System.out.println(maximo(histogram));
		boolean[][] bidi = histogramToBidi(histogram);
		char[][] screen = bidiToScreen(bidi);
		printScreen(bidi);
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
	
	public static int[] histogram(int[] array, int maximoValor) {
		int[] result = new int[maximoValor];
		for (int i = 0; i < result.length; i++) {
			result[i] = inRange(array, i, i+1);
		} 
				
		return result;
	}
	
	public static int maximo(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (result < array[i]) {
				result = array[i];
			}
		}
		
		return result;
	}
	
	public static boolean[][] histogramToBidi(int[] histogram){
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
		char[][] result = new char[(bidi.length) + 1][bidi[0].length * 3 + 1];
		for (int i = 0; i < result.length; i++) {
			result[i][0] = '|';
		}
		for (int i = 0; i < result[0].length; i++) {
//			result[bidi.length][i] = '|';	
			if((i % 3) == 0) {
				result[bidi.length][i] = '|';
			} else {
				result[bidi.length][i] = '_';
			}
		}
		for (int i = 0; i < bidi.length; i++) {
			for (int j = 0; j < bidi[i].length; j++) {
				if (bidi[i][j] == true) {
					int k = j;
					result[i][k] = '='; 
				}
			}
		}
		return result;
	}
	
	public static void printScreen(boolean[][] screen) {
		for (int i = 0; i < screen.length; i++) {
			for (int j = 0; j < screen[i].length; j++) {
				System.out.print(screen[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}
}
