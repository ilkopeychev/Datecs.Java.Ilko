import java.util.Scanner;

public class task5Caclulator {
public static void main(String[] args) {
	System.out.println(" tova e edin prost kaklulator /n izberete 1 za sybirane, 2 za izvajdane, 3 za umnojenie, 4 za delenie ");
	Scanner sc= new Scanner(System.in);
	int userDigit=sc.nextInt();
	switch (userDigit) {
	case 1:
		System.out.println("vie izbrahte sybirane molq vyvedete 2 chisla");
		System.out.println("Vyvedete 1vo chislo");
		int firstDigit=sc.nextInt();
		System.out.println("Vyvedete 2ro chislo");
		int secondDigit=sc.nextInt();
		System.out.println(" sborat e   " +(firstDigit+secondDigit));
		break;
	case 2:
		System.out.println("vie izbrahte izvajdane molq vyvedete 2 chisla");
		System.out.println("Vyvedete 1vo chislo");
		firstDigit=sc.nextInt();
		System.out.println("Vyvedete 2ro chislo");
		secondDigit=sc.nextInt();
		System.out.println(" razlikata e   " +(firstDigit-secondDigit));
		break;
	case 3:
		System.out.println("vie izbrahte umnojenie molq vyvedete 2 chisla");
		System.out.println("Vyvedete 1vo chislo");
		firstDigit=sc.nextInt();
		System.out.println("Vyvedete 2ro chislo");
		secondDigit=sc.nextInt();
		System.out.println(" proizvedenieto e   " +(firstDigit*secondDigit));
		break;
	case 4:
		System.out.println("vie izbrahte delenie molq vyvedete 2 chisla");
		System.out.println("Vyvedete 1vo chislo");
		firstDigit=sc.nextInt();
		System.out.println("Vyvedete 2ro chislo");
		secondDigit=sc.nextInt();
		if (secondDigit==0) {
			System.out.println(" na nula ne se deli priqtelche opitai pak");
			throw new NullPointerException();
		}
		System.out.println(" chasnoto e   " +(firstDigit/secondDigit));
		break;
	default:
		System.out.println(" nepoznata opciq ot menuto ");
		break;
	}
}
}
