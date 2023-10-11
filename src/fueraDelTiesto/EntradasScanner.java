package fueraDelTiesto;


import java.util.Scanner;

public class EntradasScanner {

	public static void main(String[] args) {
		System.out.println("introduce tu nombre");
		
		
		Scanner entrada=new Scanner(System.in);
		String nombreString = entrada.nextLine();
		
		System.out.println("introduce tu edad");
		int edad = entrada.nextInt();

		System.out.println("tu nombre es " + nombreString + "y eres subnormal" + edad);
	}

}
