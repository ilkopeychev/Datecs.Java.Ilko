import java.util.Scanner;

public class task3CountMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Vyvedete suma v leva ");
		double money = sc.nextDouble();
		// First i separate the coins and the papers
		int paperMoney = (int) money % 100;
		int coinsMoney = (int)((money*100)%100);
		
		 System.out.println(paperMoney+" knijni ");
		 System.out.println(coinsMoney+" stotinki ");
		 
		if (paperMoney / 100 > 0) {
			System.out.println(paperMoney / 100 + " x " + 100 + " leva ");
			paperMoney %= 100;
		}
		if (paperMoney / 50 > 0) {
			System.out.println(paperMoney / 50 + " x " + 50 + " leva ");
			paperMoney %= 50;
		}
		if (paperMoney / 20 > 0) {
			System.out.println(paperMoney / 20 + " x " + 20 + " leva ");
			paperMoney %= 100;
		}
		if (paperMoney / 10 > 0) {
			System.out.println(paperMoney / 10 + " x " + 10 + " leva ");
			paperMoney %= 10;
		}
		if (paperMoney / 5 > 0) {
			System.out.println(paperMoney / 5 + " x " + 5 + " leva ");
			paperMoney %= 5;
		}
		if (paperMoney / 2 > 0) {
			System.out.println(paperMoney / 2 + " x " + 2 + " leva ");
			paperMoney %= 2;
		}
		if (paperMoney / 1 > 0) {
			System.out.println(paperMoney + " x " + 1 + " lev ");

		}
		if (coinsMoney / 50 > 0) {
			System.out.println(coinsMoney / 50 + " x " + 50 + " stotinki ");
			coinsMoney %= 50;
		}
		if (coinsMoney / 20 > 0) {
			System.out.println(coinsMoney / 20 + " x " + 20 + " stotinki ");
			coinsMoney %= 20;
		}
		if (coinsMoney / 10 > 0) {
			System.out.println(coinsMoney / 10 + " x " + 10 + " stotinki ");
			coinsMoney %= 10;
		}
		if (coinsMoney / 5 > 0) {
			System.out.println(coinsMoney / 5 + " x " + 5 + " stotinki ");
			coinsMoney %= 5;
		}
		if (coinsMoney / 2 > 0) {
			System.out.println(coinsMoney / 2 + " x " + 2 + " stotinki ");
			coinsMoney %= 2;
		}
		if (coinsMoney / 1 > 0) {
			System.out.println(coinsMoney + " x " + 1 + " stotinka ");
		}
	
	}
}
