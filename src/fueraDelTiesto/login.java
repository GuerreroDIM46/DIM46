package fueraDelTiesto;

import javax.swing.JOptionPane;


public class login {

	public static void main(String[] args) {
		String[][] userPassStrings = new String[][] {{"juan", "maria", "xavier", "paula"},{"imbecil", "payaso", "subnormal", "cerdo"}};
//		for (int i = 0; i < userPassStrings.length; i++) {
//			System.out.println(userPassStrings[1][0]);
		
		boolean isPasswordCorrect = false;
		boolean isInList = false;
		int indice = 0; 
		int indice2 = 0;
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
			while (!isInList) {
				for (int i = 0; i < userPassStrings[0].length; i++) {
					if (userPassStrings[0][i].equalsIgnoreCase(nombre)) {
						isInList = true;
						indice = i;
					}//if
				}//for
				if (!isInList) nombre = JOptionPane.showInputDialog("Prueba a meter tu nombre otra vez, imbecil");
			}//while
			String password = JOptionPane.showInputDialog("Introduce tu password");
			if (userPassStrings[1][indice].equals(password)) isPasswordCorrect = true;
			else {
				while (indice2 < 2 & !isPasswordCorrect) {
					password = JOptionPane.showInputDialog("Prueba a meter tu password otra vez, imbecil");
					if (userPassStrings[1][indice].equals(password)) {
						isPasswordCorrect = true;
					}
				indice2++;
				}
			}//if
			if (isPasswordCorrect) System.out.println("estas dentro");
			else System.out.println("a tomar por culo");
				
			
	}//main
}//login


