package fixedTasks;

import javax.crypto.Cipher;

public class caeserCipher {
	public static String cipher(String msg, int shift) {
		/*
		 * ������������� �� ������ ������ �� �� �� ���� ����������, ������ ������� � ����� � ��������, �����
		 * �����, �� �� ������� ��� ����� ��� ����� �������� ��� ����� ������ S
		 * 
		 */
		StringBuilder input = new StringBuilder();
		int len = msg.length();

// �������� ����� �����
		for (int x = 0; x < len; x++) {
			// ���������� �� ������� ������
			if (msg.charAt(x) == ',' || msg.charAt(x) == ' ' || msg.charAt(x) == '.') {
				input.append(msg.charAt(x));
			} else {
				// ������ �� ��������� �� ������ ��������, ������� �� ������ ����� ���, �
				// ������� ������� ��� � ASCI ���������, ����� ������ �������� �� �����������
				char c = (char) (msg.charAt(x) + shift);
				// ��� ����� ��� ���� ����� � �� ����� �� z ������� �� ����� �� ������
				if (c > 'z')
					input.append((char) (msg.charAt(x) - (26 - shift)));
				else
					input.append((char) (msg.charAt(x) + shift));
			}
		}
		return input.toString();
	}

	// ����� :) ��������� ������ ���� ��� �������� �� 26 (����� ������ ������ �� ��
	// ������ ������ ���������)
	public static void main(String[] args) {
		System.out.println(cipher("datecsabc", 3));
		System.out.println(cipher("azshte stana programist", 3));
	}
}
