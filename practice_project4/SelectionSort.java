package practice_project4;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] abi) {
        int n = abi.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (abi[j] < abi[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = abi[i];
            abi[i] = abi[minIndex];
            abi[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] abi = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(abi));

        selectionSort(abi);

        System.out.println("Sorted array: " + Arrays.toString(abi));
    }
}
