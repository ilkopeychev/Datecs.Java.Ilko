package fixedTasks;

import javax.crypto.Cipher;

public class caeserCipher {
	public static String cipher(String msg, int shift) {
		/*
		 * инициализирам си стринг билдер за да не бави програмата, защото стринга в джава е имютъбъл, което
		 * значи, че се създава нов обект при всяко добавяне към нашия стринг S
		 * 
		 */
		StringBuilder input = new StringBuilder();
		int len = msg.length();

// обхождам нашия инпут
		for (int x = 0; x < len; x++) {
			// проверявам за излишни чарове
			if (msg.charAt(x) == ',' || msg.charAt(x) == ' ' || msg.charAt(x) == '.') {
				input.append(msg.charAt(x));
			} else {
				// вместо да използвам на готово азбуката, дирекно си взимам самия чар, и
				// ползвам неговия код в ASCI таблицата, който реално отговаря на номерацията
				char c = (char) (msg.charAt(x) + shift);
				// ако нашия чар плюс шифта е по голям от z почваме да броим от начало
				if (c > 'z')
					input.append((char) (msg.charAt(x) - (26 - shift)));
				else
					input.append((char) (msg.charAt(x) + shift));
			}
		}
		return input.toString();
	}

	// воала :) решението работи само със шифтване до 26 (което реално трябва да ни
	// изведе същото съобщение)
	public static void main(String[] args) {
		System.out.println(cipher("datecsabc", 3));
		System.out.println(cipher("azshte stana programist", 3));
	}
}
