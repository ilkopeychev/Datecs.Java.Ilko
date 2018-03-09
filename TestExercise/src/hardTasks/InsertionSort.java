package hardTasks;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int num[] = { 6, 82, 12, 41, 41, 59, -32, 61 };
	intertionSort(num);
	System.out.println(Arrays.toString(num));
}
static void intertionSort(int arr[])
{
    int n = arr.length;
    for (int i=1; i<n; ++i)
    {
        int temp = arr[i];
        int j = i-1;

        /* премества елементите които са по големи от temp 
         с една позиция напред от тяхната начална */
        while (j>=0 && arr[j] > temp)
        {
            arr[j+1] = arr[j];
            j --;
        }
        arr[j+1] = temp;
    }
}
}
