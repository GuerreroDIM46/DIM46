package histograma;

public class Pantalla {
	private int ancho;
	private int alto;
	char[][] bufferPantalla;
	int[][] posicion;
	
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public Pantalla(int ancho, int alto) {
		setAlto(alto);
		setAncho(ancho);
		int anchoBufferPantalla = 2 * ancho;
		int posicionX;
		int posicionY;
		bufferPantalla = new char[anchoBufferPantalla][alto];
		bufferPantalla = inicializarPantalla(ancho, alto);
	}
	
	public char[][] inicializarPantalla(int ancho, int alto) {
		char[][] result = new char[ancho][alto];
		Pixel pixel = new Pixel(' ', ' ');
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixelAPosicion(i, j, pixel, result);
			}
		}
		return result;
	}
	
	public char[][] pixelAPosicion(int posicionX, int posicionY, Pixel pixel, char[][] bufferPantalla){
		char[][] result = bufferPantalla;
		int i = posicionY;
		int j = posicionX * 2;
		result[i][j] = pixel.getChar1();
		result[i][j +1] = pixel.getChar2();
		return result;
	}
	
	public static void imprimirPantalla(Pantalla screen) {
		for (int i = 0; i < screen.bufferPantalla.length; i++) {
			for (int j = 0; j < screen.bufferPantalla[i].length; j++) {
				System.out.print(screen.bufferPantalla[i][j]);
			}
			System.out.print("\n");
		}
	}
	
}
