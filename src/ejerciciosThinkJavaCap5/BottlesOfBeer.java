package ejerciciosThinkJavaCap5;

public class BottlesOfBeer {

	public static void main(String[] args) {
		for (int i = 99; i > -1; i--) {
			if (i > 1)
				System.out.println(i + " bottles of beer on the wall,\r\n" + i + " bottles of beer,\r\n"
						+ "ya’ take one down, ya’ pass it around,\r\n" + (i - 1)
						+ " bottles of beer on the wall.\n");
			else if (i == 1)
				System.out.println(i + " bottles of beer on the wall,\r\n" + i + " bottles of beer,\r\n"
						+ "ya’ take one down, ya’ pass it around,\r\nnone bottles of beer on the wall.\n");
			else if (i == 0)
				System.out.println("No bottles of beer on the wall,\r\n" + "no bottles of beer,\r\n"
						+ "ya’ can’t take one down, ya’ can’t pass it around,\r\n"
						+ "’cause there are no more bottles of beer on the wall! ");
		}
	}
}