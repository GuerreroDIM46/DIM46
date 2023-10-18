package pruebas;

public class demo {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 15; i++) {
			
			j++;
			System.out.print(   Integer.toString(j).charAt(Integer.toString(j).length() - 1)        +"\t"   );
		}
	}
}
