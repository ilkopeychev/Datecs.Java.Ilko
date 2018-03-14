import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
	// ��������(������ ��� ��������) � ���������� �� �� ���� ��������� �� value
	public static ArrayList<String> finaloutput = new ArrayList<String>();
	public static String finalValue = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("\\s", "");

		parseTLV(input);
     // ��� ���������� ����������, �� ��� � ������������, �� �������� ����� ������ 
//		for (int i = 0; i < finaloutput.size(); i++) {
//			System.out.println(finaloutput.get(i));
//		}

	}

	public static void parseTLV(String tlv) {
// ���� �� ����������
		if (tlv == null || tlv.length() <= 2) {

			return;
		}
// �������� ������� ������� ���� �����
		for (int i = 0; i < tlv.length() - 2;) {
			try {
				// ���� ������� 2 ������� � �� ������� ���� ���
				String key = tlv.substring(i, i = i + 2);
// �������� �������� ���� ���� � �� �� 1 ����
				if ((Integer.parseInt(key, 16) & 0x1F) == 0x1F) {
					// ��� �� ������� ��� ����
					key += tlv.substring(i, i = i + 2);
				}
				// ���� ���� �� ������ ���������(i �� �� ��������� ����������� ��� � �������)
				String len = tlv.substring(i, i = i + 2);
				int length = Integer.parseInt(len, 16);
// �������� - ������ ��  1 ���� �� �������
				if (length > 127) {
					
					int bytesLength = length - 128;
					len = tlv.substring(i, i = i + (bytesLength * 2));
					length = Integer.parseInt(len, 16);
				}
				// ��������� �� 2 ������ �� �������� ���� ������ � 1 ���������� ����� ������ ��� ������� 2
				length *= 2;
// ���� ���� ���� ��������� �� ��������� � ���� � � ��������� �� � ����� ���� ��������� � ����������
				String value = tlv.substring(i, i = i + length);
		// ������� ���������� � ����������, ���� �� ������ ������- ���, �������, ��������
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
		// ���������� �������� ���������
		parseTLV(finalValue);
	}

}
