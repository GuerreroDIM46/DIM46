package histograma;

public class Pixel {
	private char char1;
	private char char2;
	String pixel;
	
	public void setChar1(char char1) {
		this.char1 = char1;
	}
	
	public void setChar2(char char2) {
		this.char2 = char2;
	}

	public char getChar1() {
		return char1;
	}
	
	public char getChar2() {
		return char2;
	}
	
	public Pixel(char char1, char char2) {
		setChar1(char1);
		setChar2(char2);
		pixel = "char1" + "char2";
}	

	
}
