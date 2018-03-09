import java.util.Scanner;

public class cezarovShifarTask8 {
	public static void main(String[] args) {
		// taking the alphabet for helper
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		String userMessage = sc.nextLine();
		userMessage = userMessage.toLowerCase();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < userMessage.length(); i++) {
			// i should add all the symbols
			if (userMessage.charAt(i) == ',' || userMessage.charAt(i) == ' ' || userMessage.charAt(i) == '.') {
				output.append(userMessage.charAt(i));
			} else {
				for (int alphaIterator = 0; alphaIterator < alphabet.length(); alphaIterator++) {

					if ((userMessage.charAt(i) == alphabet.charAt(alphaIterator))) {
						if (userMessage.charAt(i) == 'z') {
							output.append('a');
						} else
							output.append(alphabet.charAt(alphaIterator + 1));
					}
				}
			}
		}
		// sega razkodirame
		String shiftedmessage = output.toString();
		StringBuilder output2 = new StringBuilder();
		System.out.println(" shifyrat e =  " + shiftedmessage);
		for (int i = 0; i < shiftedmessage.length(); i++) {
			// i should add all the symbols
			if (shiftedmessage.charAt(i) == ',' || shiftedmessage.charAt(i) == ' ' || shiftedmessage.charAt(i) == '.') {
				output2.append(shiftedmessage.charAt(i));
			} else {
				for (int alphaIterator = 0; alphaIterator < alphabet.length(); alphaIterator++) {

					if ((shiftedmessage.charAt(i) == alphabet.charAt(alphaIterator))) {
						if (shiftedmessage.charAt(i) == 'a') {
							output2.append('z');
						} else
							output2.append(alphabet.charAt(alphaIterator - 1));
					}
				}
			}
		}
		System.out.println(" i razkodiran obratno e  -->>>  " +output2.toString());
	}
}
