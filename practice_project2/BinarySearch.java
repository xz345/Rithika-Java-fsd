package practice_project2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its in
            } else if (arr[mid] < target) {
                start = mid + 1; // Adjust the start bound
            } else {
                end = mid - 1; // Adjust the end bound
            }
        }
        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int in = binarySearch(arr, target);

        if (in != -1) {
            System.out.println("Element found at in " + in);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
