package fueraDelTiesto;

import javax.swing.JOptionPane;

public class EntradasJOptionPane {

	public static void main(String[] args) {

		String nombreString = JOptionPane.showInputDialog("introduce tu nombre, imbecil");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("introduce tu  edad, payaso"));
		
		System.out.println("te llamas " + nombreString + ", payaso " + edad);
		
		
		

	}

}
