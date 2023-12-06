package practice_project3;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0; // Element found at the first index
        }

        int bound = 1;
        int n = arr.length;

        while (bound < n && arr[bound] <= target) {
            bound *= 2; // Double the bound
        }

        // Perform binary search within the identified range
        int left = bound / 2;
        int right = Math.min(bound, n - 1);

        return binarySearch(arr, target, left, right);
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Adjust the left bound
            } else {
                right = mid - 1; // Adjust the right bound
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;

        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
