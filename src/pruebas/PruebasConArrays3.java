package pruebas;

public class PruebasConArrays3 {

	public static void main(String[] args) {
		int[] n = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] prueba = make(6);
		for (int i = 0; i < prueba.length; i++) {
			System.out.println(prueba[i] + "\n");
		}	
		dub(n);
		System.out.println("\n");
		System.out.println(mus(n));
		
	}

	public static int[] make(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		return a;

	}

	public static void dub(int[] jub) {
		for (int i = 0; i < jub.length; i++) {
			jub[i] *= 2;
		}
		for (int i = 0; i < jub.length; i++) {
			System.out.println(jub[i]);
		}
	}
	
	public static int mus(int[] zoo) {
    int fus = 0;
    for (int i = 0; i < zoo.length; i++) {
        fus += zoo[i];
    }
    return fus;
}
}
