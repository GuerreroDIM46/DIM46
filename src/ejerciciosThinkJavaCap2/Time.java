package ejerciciosThinkJavaCap2;

public class Time {

	public static void main(String[] args) {
		int horas = 10;
		int minutos = 22;
		int segundos = 1;
		int minutosEnHoras = 60;
		int segundosEnMinutos = 60;
		int horasEnDia = 24;
		int secondsFromMidnight = segundos + minutos * segundosEnMinutos
				+ horas * minutosEnHoras * segundosEnMinutos;
		int secondsInDay = horasEnDia * minutosEnHoras * segundosEnMinutos;
		int secondsToMidnight = secondsInDay - secondsFromMidnight;
		double percentOfDayPassed = secondsFromMidnight * 100 / secondsInDay;
		int initialTime = 36241;

		System.out.println("Han pasado " + secondsFromMidnight + " segundos desde medianoche");
		System.out.println("Quedan " + secondsToMidnight + " segundos hasta medianoche");
		System.out.println("Ha pasado el " + percentOfDayPassed + "% del dia");
		System.out.println("He tardadado " + (secondsFromMidnight - initialTime)
				+ " segundos en hacer el ejercicio");
	}

}
