
public class Task1 {
	public static void main(String[] args) {
		// drawing top Side of the asterix
		for (int rows = 0; rows < 5; rows++) {
			for (int j = 4 - rows; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int k = rows; k <= rows * 2 + (rows); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int rows = 0; rows < 4; rows++) {
			for (int i = 1; i <= 2+rows; i++) {
				System.out.print(" ");
			}
			for (int i =7-2*rows-1; i >=0; i--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
