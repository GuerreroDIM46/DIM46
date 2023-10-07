package ejerciciosThinkJavaCap2;

public class Date {

	public static void main(String[] args) {
		String dayString = "Thursday";
		int date = 31;
		String monthString = "February";
		int year = 2023;

		System.out.println(
				"American format:\n" + dayString + ", " + monthString + date + "; " + year);
		System.out.println(
				"European format:\n" + dayString + " " + date + " " + monthString + " " + year);
		printAmerican(dayString, date, monthString, year);
		printEuropean(dayString, date, monthString, year);
	}

	public static void printAmerican(String dayString, int date, String monthString, int year) {
		System.out.println(
				"\nAmerican format:\n" + dayString + ", " + monthString + date + ", " + year);
	}

	public static void printEuropean(String dayString, int date, String monthString, int year) {
		System.out.println(
				"\nEuropean format:\n" + dayString + " " + date + " " + monthString + " " + year);
	}
}
