package hardTasks;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		// примерен масив с числа
		int num[] = { 6, 82, 12, 41, 41, 59, -32, 61 };
		selectionSort(num);
		System.out.println(Arrays.toString(num));
	}

	static void selectionSort(int[] num) {
		// за удобство ще си пазя до къде съм подредил масива (в краищата)

		int start = 0;
		int end = num.length - 1;

		// броя до < брояа елементи делено на 2>
		for (int sortCount = 0; sortCount < num.length / 2; sortCount++) {
			// пазя позицията на най-големия и най малкия, като допускам, че са в началото
			// на несортираната последователност

			int maxIndex = start;
			int minIndex = start;
			// сега намираме индексите им
			for (int index = start; index <= end; index++) {
				if (num[index] > num[maxIndex]) {
					maxIndex = index;
				}
				if (num[index] < num[minIndex]) {
					minIndex = index;
				}
			}
				// разменяме като слагаме най големия на последна текуща позиция
				int temp = num[maxIndex];
				num[maxIndex] = num[end];
				num[end] = temp;
				// ако случайно сме преместили най малкия, коригираме индекса на най малкия
				// понеже там вече е стоял най големия
				if (minIndex == end) {
					minIndex = maxIndex;
				}
				// сега слагаме най малкия на текуща начална позиция
				temp = num[minIndex];
				num[minIndex] = num[start];
				num[start] = temp;

				// за оптимизация измествам началото и края на масива като свивам с по 1 елемент
				// за да може да търся само в несортираните граници мин и макс
				end--;
				start++;
			}
		}
	}

