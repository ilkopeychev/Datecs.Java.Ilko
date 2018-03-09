import java.util.Scanner;

public class task7LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete godina");
		int year = sc.nextInt();
		if (year < 1582) {
			System.out.println(" godinata e po malka ot 1582");
		} else {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println("Godinata e visokosna");
					} else {
						System.out.println(" ne e visokosna ");
					}
				}
			} else {
				System.out.println("Ne e visokosna");
			}
		}
	}
}
