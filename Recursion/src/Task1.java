import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
	// колекция(избрал съм арейлист) и променлива да ми пази стойноста за value
	public static ArrayList<String> finaloutput = new ArrayList<String>();
	public static String finalValue = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("\\s", "");

		parseTLV(input);
     // Тук изпринтвам колекцията, но съм я закоментирал, че изглежда много грозно 
//		for (int i = 0; i < finaloutput.size(); i++) {
//			System.out.println(finaloutput.get(i));
//		}

	}

	public static void parseTLV(String tlv) {
// дъно на рекурсията
		if (tlv == null || tlv.length() <= 2) {

			return;
		}
// обикалям стринга подаден като инпут
		for (int i = 0; i < tlv.length() - 2;) {
			try {
				// режа първите 2 символа и ги приемам като таг
				String key = tlv.substring(i, i = i + 2);
// прилагам проверка дали тага е от от 1 байт
				if ((Integer.parseInt(key, 16) & 0x1F) == 0x1F) {
					// ако не добавям още един
					key += tlv.substring(i, i = i + 2);
				}
				// след това си взимам дължината(i то се увеличава автоматично още в скобите)
				String len = tlv.substring(i, i = i + 2);
				int length = Integer.parseInt(len, 16);
// проверка - повече от  1 байт за дължина
				if (length > 127) {
					
					int bytesLength = length - 128;
					len = tlv.substring(i, i = i + (bytesLength * 2));
					length = Integer.parseInt(len, 16);
				}
				// умножавам по 2 понеже го прочитам като стринг и 1 двуцифрено число реално има дължина 2
				length *= 2;
// след като имам дължината на стойноста я режа и я подготвям да я подам като параметър в рекурсията
				String value = tlv.substring(i, i = i + length);
		// добавям елементите в колекцията, като ще влизат подред- таг, дължина, стойност
				finaloutput.add(key);
finaloutput.add(len);
				finaloutput.add(value);
				finalValue = value.replaceAll("\\s", "");

				System.out.println(key +" ("+ len+ ")    " + finalValue);

			} catch (NumberFormatException e) {
				throw new RuntimeException("Error parsing number", e);
			} catch (IndexOutOfBoundsException e) {
				throw new RuntimeException("Error processing field", e);
			}
		}
		// рекурсивно извиквам функцията
		parseTLV(finalValue);
	}

}
