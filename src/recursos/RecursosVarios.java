package recursos;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class RecursosVarios {
	public static void main(String[] args) {
		int[][] array = {{ 3, 9, 5 }, { 6, 7, 8 }, { 3, 4, 6 }};
		
		int[][] array2 = new int[][]{{ 3, 9, 5 }, { 6, 7, 8 }, { 3, 4, 6 }};
		
		int[][] array3 = new int [3][3];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				array3[i][j] = (int)(Math.random() * 100);
			}
		}					
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				System.out.print(array3[i][j] + " ");
			}
		}
		System.out.println("\n");
		for (int[] fila:array3) {
			for (int elemento:fila){
				System.out.print(elemento + " ");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Estas dentro");
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
	}
	
	
	public double round3Dec(double n) {
		double result = Math.round(n * 1000d) / 1000d;
		return result;
	}
	
	
	
	
}
