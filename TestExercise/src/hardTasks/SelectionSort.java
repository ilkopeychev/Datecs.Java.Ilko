package hardTasks;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		// �������� ����� � �����
		int num[] = { 6, 82, 12, 41, 41, 59, -32, 61 };
		selectionSort(num);
		System.out.println(Arrays.toString(num));
	}

	static void selectionSort(int[] num) {
		// �� �������� �� �� ���� �� ���� ��� �������� ������ (� ��������)

		int start = 0;
		int end = num.length - 1;

		// ���� �� < ����� �������� ������ �� 2>
		for (int sortCount = 0; sortCount < num.length / 2; sortCount++) {
			// ���� ��������� �� ���-������� � ��� ������, ���� ��������, �� �� � ��������
			// �� ������������� ����������������

			int maxIndex = start;
			int minIndex = start;
			// ���� �������� ��������� ��
			for (int index = start; index <= end; index++) {
				if (num[index] > num[maxIndex]) {
					maxIndex = index;
				}
				if (num[index] < num[minIndex]) {
					minIndex = index;
				}
			}
				// ��������� ���� ������� ��� ������� �� �������� ������ �������
				int temp = num[maxIndex];
				num[maxIndex] = num[end];
				num[end] = temp;
				// ��� �������� ��� ���������� ��� ������, ���������� ������� �� ��� ������
				// ������ ��� ���� � ����� ��� �������
				if (minIndex == end) {
					minIndex = maxIndex;
				}
				// ���� ������� ��� ������ �� ������ ������� �������
				temp = num[minIndex];
				num[minIndex] = num[start];
				num[start] = temp;

				// �� ����������� ��������� �������� � ���� �� ������ ���� ������ � �� 1 �������
				// �� �� ���� �� ����� ���� � ������������� ������� ��� � ����
				end--;
				start++;
			}
		}
	}

