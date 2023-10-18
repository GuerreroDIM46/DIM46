package pruebas;

public class demo {

	public static void main(String[] args) {
		int[][] demo = new int[2][3];
		demo[0][0] = 1;
		demo[0][1] = 2;
		demo[0][2] = 3;
		demo[1][0] = 4;
		demo[1][1] = 5;
		demo[1][2] = 6;

		
		for (int i = 0; i < demo.length; i++) {
			for (int j = 0; j < demo[i].length; j++) {
				System.out.println(demo[i][j]);
			}
			
		}
			
		

	}

}
