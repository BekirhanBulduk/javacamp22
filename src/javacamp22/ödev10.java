package javacamp22;

public class ödev10 {

	public static void main(String[] args) {
		String[][] arabalar = new String[3][3];

		arabalar[0][0] = "BMW";
		arabalar[0][1] = "Mercedes";
		arabalar[0][2] = "Audi";
		arabalar[1][0] = "Honda";
		arabalar[1][1] = "Toyota";
		arabalar[1][2] = "Mazda";
		arabalar[2][0] = "Peugeot";
		arabalar[2][1] = "Renault";
		arabalar[2][2] = "DS";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arabalar[i][j]);
			}
			System.out.println();
		}
	}
}
