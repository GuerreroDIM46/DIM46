package enClase;

public class calcularMaximoDelArray {

	public static int[] make(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		return a;

	}

	public static int indexOfMax(int[] array) {
		int mayorValor = 0;
		int resultado = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > resultado) {
				mayorValor = array[i];
				resultado = i;
			}
		}
		return resultado;
	}
	
	public static int indexOfMax2(int[] array) {
		int mayorValor = 0;
		int resultado = 0;
	for (int j : array) {
		
	
			if (j > resultado) {
				mayorValor = j;
				resultado = j;
			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		int prueba[] = make(10);
		for (int i = 0; i < prueba.length; i++) {
			System.out.print(prueba[i] + "\t");
		}
		System.out.println("\n\nEl indice de mayor valor es " + indexOfMax(prueba));
		System.out.println("\nEl mayor valor es " + indexOfMax2(prueba));
	}

}
